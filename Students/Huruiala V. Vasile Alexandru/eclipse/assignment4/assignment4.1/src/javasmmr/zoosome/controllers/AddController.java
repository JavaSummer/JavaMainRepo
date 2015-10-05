package javasmmr.zoosome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JLabel;
import javax.swing.JTextField;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.repositories.ZooData;
import javasmmr.zoosome.services.factories.Constants;
import javasmmr.zoosome.services.factories.animals.BigFactory;
import javasmmr.zoosome.views.AddFrame;

public class AddController extends AbstractController {

	private final AddFrame addFrame;

	public AddController(AddFrame addFrame, boolean hasBackButton) {
		super(addFrame, hasBackButton);
		this.addFrame = addFrame;
		addFrame.setRandomAnimalButtonActionListener(new RandomAnimalButtonActionListener());
		addFrame.setSpeciesComboBoxItemListener(new SpeciesComboBoxItemListener());
		addFrame.setConfirmNewAnimalButtonActionListener(new ConfirmNewAnimalButtonActionListener());
		addFrame.setRandomCBItemListenet(new RandomCBItemListener());
		addFrame.setIndexSpeciesComboBox(0);
	}

	// Generate random animals button
	private class RandomAnimalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Take data from drop down then generate them
			int count = addFrame.getRandomCB();
			ZooData.addAnimal(new BigFactory().generateRandomAnimalAmount(count));
			addFrame.setGenerationStatus("Successfully generated " + count + " animal" + ((count == 1) ? "" : "s"));
		}
	}

	private class RandomCBItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			int selectedRandom = addFrame.getRandomCB();
			String newName = null;

			if (selectedRandom == 1) {
				newName = "Add random animal to the list";
			} else {
				newName = "Add " + selectedRandom + " random animals to the list";
			}

			addFrame.setRandomButtonText(newName);
		}
	}

	// Species drop down
	private class SpeciesComboBoxItemListener implements ItemListener {

		@Override
		public void itemStateChanged(ItemEvent e) {
			int indexS = indexSpecies();

			addFrame.resetIndividualsComboBox(Constants.Animals.SPECIES_TYPE[indexS]);

			// Change the description and help labels to match the species
			updateLabels(getFieldNames(), Constants.Animals.ANIMAL_FIELD_HELP[indexS]);
		}
	}

	// Gets the species index of the selected animal (form the drop downs) i. e.
	// Insect is 4
	private int indexSpecies() {
		return Constants.indexOfStringIn1DStringArray(Constants.Species.SPECIES, addFrame.getSpeciesSelected());
	}

	// Gets the individual index of the selected animal (form the drop downs) i.
	// e. Kangaroo is 3
	private int indexIndividual() {
		return Constants.indexOfStringIn1DStringArray(Constants.Animals.SPECIES_TYPE[indexSpecies()],
				addFrame.getIndividualSelected());
	}

	// Uses reflection api to retrieve the field names to be displayed as detail
	// labels
	private String[] getFieldNames() {

		// The prefix is "DEFAULT_"
		final int FIELD_NAME_PREFIX_LENGTH = 8;
		final int indexS = indexSpecies();
		final int indexI = indexIndividual();

		Class cls = Constants.Animals.ANIMAL_CLASSES[indexS][indexI];
		Field[] fields = cls.getDeclaredFields();
		String[] fieldNames = new String[fields.length];

		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			String name = fields[i].getName();
			name = name.substring(FIELD_NAME_PREFIX_LENGTH, name.length());
			name = name.toLowerCase();
			name = name.replace('_', ' ');
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			fieldNames[i] = name;
		}

		return fieldNames;
	}

	private void updateLabels(String[] fieldNames, String[] fieldHelp) {
		Iterator<JLabel> itd = addFrame.getAnimalDescriprionLabels().iterator();
		Iterator<JLabel> ith = addFrame.getAnimalHelpLabels().iterator();

		int i = 0;
		while (itd.hasNext() && ith.hasNext()) {
			JLabel labelDesc = itd.next();
			JLabel labelHelp = ith.next();

			if (i < fieldNames.length) {
				labelDesc.setText(fieldNames[i]);
				labelHelp.setText(fieldHelp[i]);
			} else {
				labelDesc.setText("N/A");
				labelHelp.setText("N/A");
			}
			i++;
		}
	}

	// The Big Button
	// Does What A Button MUST Do
	public class ConfirmNewAnimalButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			addFrame.resetHighlightAnimalHelpLabel();
			Animal newAnimal = confirmNewAnimal();
			if (newAnimal != null) {
				ZooData.addAnimal(newAnimal);
				addFrame.resetAllAnimalTextField();
				addFrame.resetHighlightAnimalHelpLabel();
				addFrame.setGenerationStatus("Successfully generated '" + newAnimal.getName() + "'");
			}
		}
	}

	// If the text fields are correct, generate the animal
	// Uses reflection api and a generalized constructor
	public Animal confirmNewAnimal() {
		int indexS = indexSpecies();
		int indexI = indexIndividual();
		Animal newAnimal = null;

		try {
			Constructor con = Constants.Animals.ANIMAL_CLASSES[indexS][indexI]
					.getConstructor(Constants.Animals.GENERAL_CONSTRUCTOR_CLASSES);

			// Extracting the Strings form text fields
			LinkedList<JTextField> fields = addFrame.getAnimalTextFields();
			String[] fieldStrings = new String[fields.size()];
			Iterator<JTextField> it = fields.iterator();
			int i = 0;
			while (it.hasNext()) {
				fieldStrings[i++] = it.next().getText();
			}

			for (String s : Constants.Animals.ANIMAL_CONSTRUCTOR_CLASSES_HELP[indexS]) {
				System.out.println(s);
			}

			// Testing for correctness
			try {
				testForCorrectness(fieldStrings, Constants.Animals.ANIMAL_CONSTRUCTOR_CLASSES_HELP[indexS]);
			} catch (Exception e) {
				System.out.println("ex");
				return null;
			}

			// Creating the object
			newAnimal = (Animal) con.newInstance(fieldStrings[0], fieldStrings[1], fieldStrings[2], fieldStrings[3],
					fieldStrings[4], fieldStrings[5]);

			BigFactory.printDetails(newAnimal);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return newAnimal;
	}

	private void testForCorrectness(String[] string, String[] classHelp) throws Exception {
		int count = classHelp.length;
		for (int i = 0; i < count; i++) {

			System.out.println(i + ": s:" + string[i] + ":s " + " h:" + classHelp[i] + ":h");

			if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_STRING)) {
				if (string[i].length() <= 0) {
					addFrame.setGenerationStatus("Give the animal a name");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Invalid name");
				}
			} else if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_POSITIVE_INTEGER)) {
				int number;
				try {
					number = Integer.parseInt(string[i]);
				} catch (NumberFormatException e) {
					addFrame.setGenerationStatus("Needs to be a positive integer");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
				if (number < 0) {
					addFrame.setGenerationStatus("Needs to be a positive integer");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
			} else if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_MAINTENANCE_DOUBLE)) {
				double number = 0;
				try {
					number = Double.parseDouble(string[i]);
				} catch (NumberFormatException e) {
					addFrame.setGenerationStatus("Needs to be a number");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
				if (number < 0.1 || number > 8.0) {
					addFrame.setGenerationStatus("Needs to be a number between 0.1 and 8");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
			} else if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_INCLUSIVE_SUBUNITARY)) {
				double number = 0;
				try {
					number = Double.parseDouble(string[i]);
				} catch (NumberFormatException e) {
					addFrame.setGenerationStatus("Needs to be a number");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
				if (number < 0.0 || number > 1.0) {
					addFrame.setGenerationStatus("Needs to be a number between 0 and 1");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
			} else if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_DOUBLE)) {
				double number = 0;
				try {
					number = Double.parseDouble(string[i]);
				} catch (NumberFormatException e) {
					addFrame.setGenerationStatus("Needs to be a number");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
				if (number < 0) {
					addFrame.setGenerationStatus("Needs to be a positive number");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
			} else if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_BOOLEAN)) {
				if ((!string[i].equals("0")) && (!string[i].equals("1"))) {
					addFrame.setGenerationStatus("Needs to be a '0' or '1'");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
			} else if (classHelp[i].equals(Constants.Animals.CONSTRUCTOR_CLASS_HELP_WATERTYPE)) {
				if ((!string[i].equals("0")) || (!string[i].equals("1"))) {
				} else {
					addFrame.setGenerationStatus("Needs to be a '0' or '1'");
					addFrame.resetAnimalTextField(i);
					addFrame.highlightAnimalHelpLabel(i);
					throw new Exception("Sorry, wrong number.");
				}
			}
		}
	}
}
