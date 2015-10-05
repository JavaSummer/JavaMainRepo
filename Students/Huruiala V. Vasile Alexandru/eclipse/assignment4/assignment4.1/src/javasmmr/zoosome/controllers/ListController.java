package javasmmr.zoosome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.repositories.ZooData;
import javasmmr.zoosome.views.ListFrame;

public class ListController extends AbstractController {

	private ListFrame listFrame;

	public ListController(ListFrame listFrame, boolean hasBackButton) {
		super(listFrame, hasBackButton);
		this.listFrame = listFrame;
		listFrame.setAnimalListListSelectionListener(new AnimalListListSelectionListener());
		listFrame.setButtonDeleteActionListener(new ButtonDeleteActionListener());
		listFrame.setButtonDeleteAllActionListener(new ButtonDeleteAllActionListener());
		listFrame.setCheckBoxDeleteActionListener(new CheckBoxDeleteActionListener());
		listFrame.setCheckBoxDeleteAllActionListener(new CheckBoxDeleteAllActionListener());
		if (ZooData.getAnimalListSize() > 0) {
			// Reselecting causes an event to fire so the description is updated
			listFrame.setSelectedAnimalListIndex(0);
		}
	}

	// The first check box activates the Delete button and the second check box
	// The second check box activates the Delete All button
	private class ButtonDeleteActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (ZooData.getAnimalListSize() > 0) {
				ZooData.removeAnimal(ZooData.getAnimalFromAnimalList(listFrame.getSelectedAnimalListIndex()));

				int selectedIndex = listFrame.getSelectedAnimalListIndex();
				listFrame.deleteSelectedAnimalList();
				if (ZooData.getAnimalListSize() > 0) {
					if (selectedIndex == 0) {
						listFrame.setSelectedAnimalListIndex(1);
						listFrame.setSelectedAnimalListIndex(0);
					} else if (selectedIndex < ZooData.getAnimalListSize()) {
						listFrame.setSelectedAnimalListIndex(selectedIndex);
					} else {
						listFrame.setSelectedAnimalListIndex(selectedIndex - 1);
					}
				} else {
					listFrame.setEmptyDescription();
				}

			}
		}
	}

	private class CheckBoxDeleteActionListener implements ActionListener {

		private boolean deleteButtonState = false;

		@Override
		public void actionPerformed(ActionEvent e) {
			deleteButtonState = !deleteButtonState;
			listFrame.setDeleteButtonState(deleteButtonState);
			listFrame.setDeleteAllCheckBoxState(deleteButtonState);
		}
	}

	private class ButtonDeleteAllActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (ZooData.getAnimalListSize() > 0) {
				ZooData.removeAllAnimals();
				listFrame.deleteAnimalList();
				listFrame.setEmptyDescription();
			}
		}
	}

	private class CheckBoxDeleteAllActionListener implements ActionListener {

		private boolean deleteAllButtonState = false;

		@Override
		public void actionPerformed(ActionEvent e) {
			deleteAllButtonState = !deleteAllButtonState;
			listFrame.setDeleteAllButtonState(deleteAllButtonState);
		}
	}

	private class AnimalListListSelectionListener implements ListSelectionListener {

		// Necessary since events get triggered twice so this filters duplicate
		// events
		private int lastSelectedIndex = 1;

		@Override
		public void valueChanged(ListSelectionEvent e) {
			int currentSelectedIndex = listFrame.getSelectedAnimalListIndex();
			if (lastSelectedIndex == currentSelectedIndex || ZooData.getAnimalListSize() == 0
					|| currentSelectedIndex < 0) {
				return;
			}

			// Retrieving the animal object
			Animal animalSelected = ZooData.getAnimalFromAnimalList(currentSelectedIndex);

			// Getting the strings for the description panel
			String[][] description = getAnimalDescription(animalSelected);
			// Updating the description panel
			listFrame.setDescription(description[0], description[1]);

			lastSelectedIndex = currentSelectedIndex;
		}
	}

	/** Get the field names and values of the respective fields */
	private String[][] getAnimalDescription(Animal animal) {

		// The prefix is "DEFAULT_"
		final int FIELD_NAME_PREFIX_LENGTH = 8;
		final int NUMBER_OF_DISPLAYED_FIELDS = 8;

		Class cls = animal.getClass();
		Field[] fields = cls.getDeclaredFields();

		// Getting the field names
		String[] fieldNames = new String[NUMBER_OF_DISPLAYED_FIELDS];
		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			String name = fields[i].getName();
			name = name.substring(FIELD_NAME_PREFIX_LENGTH, name.length());
			name = name.toLowerCase();
			name = name.replace('_', ' ');
			name = name.substring(0, 1).toUpperCase() + name.substring(1);
			fieldNames[i] = name;
		}
		fieldNames[6] = "Class";
		fieldNames[7] = "Family";

		// Getting the field values
		String[] fieldValues = new String[NUMBER_OF_DISPLAYED_FIELDS];
		String[] fieldClassValues = animal.getFields();
		for (int i = 0; i < fieldClassValues.length; i++) {
			fieldValues[i] = fieldClassValues[i];
		}
		fieldValues[6] = cls.getSuperclass().getSimpleName();
		fieldValues[7] = cls.getSimpleName();

		return new String[][] { fieldNames, fieldValues };
	}
}
