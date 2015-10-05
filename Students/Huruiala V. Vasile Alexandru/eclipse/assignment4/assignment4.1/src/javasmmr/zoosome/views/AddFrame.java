package javasmmr.zoosome.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoosome.services.factories.Constants;

public class AddFrame extends ZooFrame {
	private static final long serialVersionUID = -4582486173358540994L;

	private static final Color BACKGROUND_COLOR = new Color(180, 230, 150);
	private static final Color FIELD_PANLEL_BACKGROUND_COLOR = new Color(104, 225, 82);
	private static final Color RANDOM_PANEL_PANLEL_BACKGROUND_COLOR = new Color(101, 200, 81);
	private static final Color CHECK_BOX_PANLEL_BACKGROUND_COLOR = new Color(92, 210, 79);

	private static final Font GENERATE_BUTTON_FONT = new Font("Serif", Font.BOLD, 24);
	private static final Color GENERATE_BUTTON_COLOR = new Color(25, 200, 10);
	private static final Color GENERATE_BUTTON_TEXT_COLOR = new Color(12, 31, 2);

	private static final Font RANDOM_BUTTON_FONT = new Font("Serif", Font.BOLD, 20);
	private static final Color RANDOM_BUTTON_COLOR = new Color(220, 100, 20);
	private static final Color RANDOM_BUTTON_TEXT_COLOR = new Color(10, 22, 0);

	private static final Font RANDOM_CHECK_BOX_FONT = new Font("Serif", Font.BOLD, 60);
	private static final Color RANDOM_CHECK_BOX_COLOR = new Color(240, 140, 40);
	private static final Color RANDOM_CHECK_BOX_TEXT_COLOR = new Color(10, 22, 0);

	// Form panel
	private JPanel animalForm;

	// Random generation Panel
	private JPanel randomPanel;
	private JButton btnRandom;
	private JComboBox<String> randomCB;
	private JLabel generationStatus;

	// Drop downs
	private JPanel animalCBPanel;

	private JComboBox<String> cbSpecies;
	private JComboBox<String> cbIndividual;

	private JLabel descSpecies;
	private JLabel descIndividual;

	// Text fields
	private LinkedList<JTextField> animalTextFields;

	// Descriptive labels
	private LinkedList<JLabel> animalDescriptionLabels;
	private LinkedList<JLabel> animalHelpLabels;

	private JButton btnConfirmNewAnimal;

	public AddFrame(String title) {
		super(title);

		SpringLayout slPane = new SpringLayout();
		contentPanel.setLayout(slPane);

		// Form panel
		animalForm = new JPanel();
		animalForm.setLayout(new GridLayout(9, 0, 5, 5));
		animalForm.setBackground(BACKGROUND_COLOR);

		// Random generation panel
		SpringLayout slRand = new SpringLayout();
		randomPanel = new JPanel();
		randomPanel.setLayout(slRand);
		randomPanel.setBorder(BorderFactory.createEtchedBorder());
		randomPanel.setBackground(RANDOM_PANEL_PANLEL_BACKGROUND_COLOR);

		btnRandom = new JButton("Add random animal to the list");
		btnRandom.setFont(RANDOM_BUTTON_FONT);
		btnRandom.setBackground(RANDOM_BUTTON_COLOR);
		btnRandom.setForeground(RANDOM_BUTTON_TEXT_COLOR);
		slRand.putConstraint(SpringLayout.NORTH, btnRandom, 5, SpringLayout.NORTH, randomPanel);
		slRand.putConstraint(SpringLayout.WEST, btnRandom, 5, SpringLayout.WEST, randomPanel);
		slRand.putConstraint(SpringLayout.SOUTH, btnRandom, -5, SpringLayout.SOUTH, randomPanel);
		randomPanel.add(btnRandom);

		randomCB = new JComboBox<String>(new String[] { "1", "5", "10", "50", "100" });
		randomCB.setFont(RANDOM_CHECK_BOX_FONT);
		randomCB.setBackground(RANDOM_CHECK_BOX_COLOR);
		randomCB.setForeground(RANDOM_CHECK_BOX_TEXT_COLOR);
		slRand.putConstraint(SpringLayout.NORTH, randomCB, 5, SpringLayout.NORTH, randomPanel);
		slRand.putConstraint(SpringLayout.EAST, randomCB, -5, SpringLayout.EAST, randomPanel);
		slRand.putConstraint(SpringLayout.SOUTH, randomCB, -5, SpringLayout.SOUTH, randomPanel);
		slRand.putConstraint(SpringLayout.WEST, randomCB, 5, SpringLayout.EAST, btnRandom);
		randomPanel.add(randomCB);

		animalForm.add(randomPanel);

		// Drop down panel
		SpringLayout slDD = new SpringLayout();
		animalCBPanel = new JPanel();
		animalCBPanel.setLayout(slDD);
		animalCBPanel.setBorder(BorderFactory.createEtchedBorder());
		animalCBPanel.setBackground(CHECK_BOX_PANLEL_BACKGROUND_COLOR);

		generationStatus = new JLabel();
		generationStatus.setFont(new Font("Serif", Font.BOLD, 24));
		slDD.putConstraint(SpringLayout.NORTH, generationStatus, 5, SpringLayout.NORTH, animalCBPanel);
		slDD.putConstraint(SpringLayout.WEST, generationStatus, 5, SpringLayout.WEST, animalCBPanel);
		slDD.putConstraint(SpringLayout.EAST, generationStatus, -5, SpringLayout.EAST, animalCBPanel);
		animalCBPanel.add(generationStatus);

		cbSpecies = new JComboBox<String>(Constants.Species.SPECIES);
		cbSpecies.setSelectedIndex(1);
		slDD.putConstraint(SpringLayout.NORTH, cbSpecies, 5, SpringLayout.SOUTH, generationStatus);
		slDD.putConstraint(SpringLayout.SOUTH, cbSpecies, -5, SpringLayout.SOUTH, animalCBPanel);
		slDD.putConstraint(SpringLayout.WEST, cbSpecies, 5, SpringLayout.WEST, animalCBPanel);
		animalCBPanel.add(cbSpecies);

		cbIndividual = new JComboBox<String>(Constants.Animals.Mammal.MAMMAL);
		cbIndividual.setSelectedIndex(0);
		slDD.putConstraint(SpringLayout.NORTH, cbIndividual, 5, SpringLayout.SOUTH, generationStatus);
		slDD.putConstraint(SpringLayout.SOUTH, cbIndividual, -5, SpringLayout.SOUTH, animalCBPanel);
		slDD.putConstraint(SpringLayout.EAST, cbIndividual, -5, SpringLayout.EAST, animalCBPanel);
		animalCBPanel.add(cbIndividual);

		descSpecies = new JLabel("Class");
		descSpecies.setFont(GENERATE_BUTTON_FONT);
		slDD.putConstraint(SpringLayout.NORTH, descSpecies, 5, SpringLayout.NORTH, generationStatus);
		slDD.putConstraint(SpringLayout.SOUTH, descSpecies, -5, SpringLayout.SOUTH, animalCBPanel);
		slDD.putConstraint(SpringLayout.WEST, descSpecies, 5, SpringLayout.EAST, cbSpecies);
		animalCBPanel.add(descSpecies);

		descIndividual = new JLabel("Family");
		descIndividual.setFont(GENERATE_BUTTON_FONT);
		slDD.putConstraint(SpringLayout.NORTH, descIndividual, 5, SpringLayout.NORTH, generationStatus);
		slDD.putConstraint(SpringLayout.SOUTH, descIndividual, -5, SpringLayout.SOUTH, animalCBPanel);
		slDD.putConstraint(SpringLayout.EAST, descIndividual, -5, SpringLayout.WEST, cbIndividual);
		animalCBPanel.add(descIndividual);

		animalForm.add(animalCBPanel);

		// Text fields and descriptive labels Panel
		animalTextFields = new LinkedList<JTextField>();
		animalDescriptionLabels = new LinkedList<JLabel>();
		animalHelpLabels = new LinkedList<JLabel>();

		for (int i = 0; i < 6; i++) {
			JPanel field = new JPanel();
			SpringLayout slField = new SpringLayout();
			field.setLayout(slField);
			field.setBorder(BorderFactory.createEtchedBorder());
			field.setBackground(FIELD_PANLEL_BACKGROUND_COLOR);

			JTextField tf = new JTextField(16);
			JLabel dl = new JLabel(String.format("d%d", i));
			JLabel hl = new JLabel(String.format("h%d", i));

			slField.putConstraint(SpringLayout.NORTH, dl, 7, SpringLayout.NORTH, field);
			slField.putConstraint(SpringLayout.WEST, dl, 7, SpringLayout.WEST, field);
			field.add(dl);
			animalDescriptionLabels.add(dl);

			slField.putConstraint(SpringLayout.SOUTH, tf, -5, SpringLayout.NORTH, hl);
			slField.putConstraint(SpringLayout.EAST, tf, -5, SpringLayout.EAST, field);
			slField.putConstraint(SpringLayout.WEST, tf, 5, SpringLayout.WEST, field);
			field.add(tf);
			animalTextFields.add(tf);

			slField.putConstraint(SpringLayout.SOUTH, hl, -2, SpringLayout.SOUTH, field);
			slField.putConstraint(SpringLayout.WEST, hl, 2, SpringLayout.WEST, field);
			field.add(hl);
			animalHelpLabels.add(hl);

			animalForm.add(field);
		}

		// Make animal button
		btnConfirmNewAnimal = new JButton("Confirm new animal");
		btnConfirmNewAnimal.setFont(GENERATE_BUTTON_FONT);
		btnConfirmNewAnimal.setBackground(GENERATE_BUTTON_COLOR);
		btnConfirmNewAnimal.setForeground(GENERATE_BUTTON_TEXT_COLOR);
		animalForm.add(btnConfirmNewAnimal);

		slPane.putConstraint(SpringLayout.NORTH, animalForm, 0, SpringLayout.NORTH, contentPanel);
		slPane.putConstraint(SpringLayout.EAST, animalForm, 0, SpringLayout.EAST, contentPanel);
		slPane.putConstraint(SpringLayout.WEST, animalForm, 0, SpringLayout.WEST, contentPanel);
		slPane.putConstraint(SpringLayout.SOUTH, animalForm, 0, SpringLayout.SOUTH, contentPanel);
		contentPanel.add(animalForm);
	}

	// Event Listeners
	public void setRandomAnimalButtonActionListener(ActionListener a) {
		btnRandom.addActionListener(a);
	}

	public void setRandomCBItemListenet(ItemListener a) {
		randomCB.addItemListener(a);
	}

	public void setSpeciesComboBoxItemListener(ItemListener a) {
		cbSpecies.addItemListener(a);
	}

	public void setIndividualComboBoxItemListener(ItemListener a) {
		cbIndividual.addItemListener(a);
	}

	public void setConfirmNewAnimalButtonActionListener(ActionListener a) {
		btnConfirmNewAnimal.addActionListener(a);
	}

	// Updates when you select a number from the drop down
	public void setRandomButtonText(String s) {
		btnRandom.setText(s);
	}

	public int getRandomCB() {
		return Integer.parseInt(randomCB.getItemAt(randomCB.getSelectedIndex()));
	}

	// Feedback to the user
	public void setGenerationStatus(String s) {
		generationStatus.setText(s);
	}

	// Species drop down
	public void setIndexSpeciesComboBox(int index) {
		cbSpecies.setSelectedIndex(index);
	}

	// The second drop down updates when you change the first one
	public void resetIndividualsComboBox(String[] fields) {
		cbIndividual.removeAllItems();
		for (String f : fields) {
			cbIndividual.addItem(f);
		}
	}

	public String getSpeciesSelected() {
		return cbSpecies.getSelectedItem().toString();
	}

	public String getIndividualSelected() {
		return cbIndividual.getSelectedItem().toString();
	}

	public LinkedList<JLabel> getAnimalDescriprionLabels() {
		return animalDescriptionLabels;
	}

	public LinkedList<JLabel> getAnimalHelpLabels() {
		return animalHelpLabels;
	}

	// Used to point out mistakes
	public void highlightAnimalHelpLabel(int index) {
		animalHelpLabels.get(index).setForeground(Color.RED);
	}

	public void resetHighlightAnimalHelpLabel() {
		Iterator<JLabel> it = animalHelpLabels.iterator();
		while (it.hasNext()) {
			it.next().setForeground(Color.BLACK);
		}
	}

	public LinkedList<JTextField> getAnimalTextFields() {
		return animalTextFields;
	}

	public void resetAnimalTextField(int index) {
		animalTextFields.get(index).setText("");
	}

	public void resetAllAnimalTextField() {
		for (int i = 0; i < animalTextFields.size(); i++) {
			animalTextFields.get(i).setText("");
		}
	}
}
