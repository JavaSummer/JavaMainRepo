package javasmmr.zoosome.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SpringLayout;
import javax.swing.event.ListSelectionListener;

import javasmmr.zoosome.repositories.ZooData;

public class ListFrame extends ZooFrame {
	private static final long serialVersionUID = 8962513809276594079L;

	private final static String[] EMPTY = { "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY", "EMPTY" };

	private final static Color LIGHT_GREY = new Color(125, 200, 45);
	private final static Color NOT_LIGHT_GREY = new Color(175, 100, 80);
	private final static Color SOMETHING_REDISH = new Color(200, 20, 45);

	private final static Font DEFAULT_FONT = new Font("Serif", Font.PLAIN, 15);
	private final static Font BOLD_FONT = new Font("Serif", Font.BOLD, 16);

	// Description panel
	private LinkedList<JLabel> animalDescriptionLabels;
	private LinkedList<JLabel> animalDataLabels;
	private JPanel animalPlanet;

	// Deletion controls
	private JButton btnDelete;
	private JCheckBox cbDelete;
	private JButton btnDeleteAll;
	private JCheckBox cbDeleteAll;

	// List panel
	private JList<String> animalList;
	private JScrollPane animalScrollPane;

	public ListFrame(String title) {
		super(title);

		SpringLayout slPane = new SpringLayout();
		contentPanel.setLayout(slPane);

		// Description panel

		animalDescriptionLabels = new LinkedList<JLabel>();
		animalDataLabels = new LinkedList<JLabel>();
		// GridLayout for panel
		animalPlanet = new JPanel();
		animalPlanet.setBackground(LIGHT_GREY);
		animalPlanet.setLayout(new GridLayout(8, 2, 5, 5));
		// Adding the description fields
		for (int i = 0; i < 8; i++) {
			JLabel newDesc = new JLabel();
			if (i < 6) {
				newDesc.setFont(DEFAULT_FONT);
			} else {
				newDesc.setFont(BOLD_FONT);
			}
			animalDescriptionLabels.add(newDesc);
			animalPlanet.add(newDesc);

			JLabel newData = new JLabel();
			if (i < 6) {
				newData.setFont(DEFAULT_FONT);
			} else {
				newData.setFont(BOLD_FONT);
			}
			animalDataLabels.add(newData);
			animalPlanet.add(newData);
		}

		slPane.putConstraint(SpringLayout.WEST, animalPlanet, 0, SpringLayout.WEST, contentPanel);
		slPane.putConstraint(SpringLayout.EAST, animalPlanet, 0, SpringLayout.EAST, contentPanel);
		contentPanel.add(animalPlanet);

		// Delete button and check box

		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
		btnDelete.setBackground(SOMETHING_REDISH);
		slPane.putConstraint(SpringLayout.NORTH, btnDelete, 5, SpringLayout.SOUTH, animalPlanet);
		slPane.putConstraint(SpringLayout.WEST, btnDelete, 0, SpringLayout.WEST, contentPanel);
		contentPanel.add(btnDelete);

		cbDelete = new JCheckBox("Enable Deletion");
		cbDelete.setBackground(NOT_LIGHT_GREY);
		slPane.putConstraint(SpringLayout.NORTH, cbDelete, 5, SpringLayout.SOUTH, animalPlanet);
		slPane.putConstraint(SpringLayout.WEST, cbDelete, 5, SpringLayout.EAST, btnDelete);
		contentPanel.add(cbDelete);

		btnDeleteAll = new JButton("Delete All");
		btnDeleteAll.setEnabled(false);
		btnDeleteAll.setBackground(SOMETHING_REDISH);
		slPane.putConstraint(SpringLayout.NORTH, btnDeleteAll, 5, SpringLayout.SOUTH, animalPlanet);
		slPane.putConstraint(SpringLayout.EAST, btnDeleteAll, 0, SpringLayout.EAST, contentPanel);
		contentPanel.add(btnDeleteAll);

		cbDeleteAll = new JCheckBox("Enable Complete Anihilation");
		cbDeleteAll.setBackground(NOT_LIGHT_GREY);
		cbDeleteAll.setEnabled(false);
		slPane.putConstraint(SpringLayout.NORTH, cbDeleteAll, 5, SpringLayout.SOUTH, animalPlanet);
		slPane.putConstraint(SpringLayout.EAST, cbDeleteAll, -5, SpringLayout.WEST, btnDeleteAll);
		contentPanel.add(cbDeleteAll);

		// Selection list
		animalScrollPane = new JScrollPane();

		if (ZooData.getAnimalListSize() > 0) {
			animalList = new JList<String>(ZooData.getAnimalListNames());
		} else {
			animalList = new JList<String>(new String[] { "Empty" });
			setEmptyDescription();
		}
		animalList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		animalList.setBackground(LIGHT_GREY);
		animalScrollPane.setViewportView(animalList);

		slPane.putConstraint(SpringLayout.NORTH, animalScrollPane, 5, SpringLayout.SOUTH, btnDelete);
		slPane.putConstraint(SpringLayout.WEST, animalScrollPane, 0, SpringLayout.WEST, contentPanel);
		slPane.putConstraint(SpringLayout.EAST, animalScrollPane, 0, SpringLayout.EAST, contentPanel);
		slPane.putConstraint(SpringLayout.SOUTH, animalScrollPane, 0, SpringLayout.SOUTH, contentPanel);
		contentPanel.add(animalScrollPane);
	}

	public void setSelectedAnimalListIndex(int index) {
		animalList.setSelectedIndex(index);
	}

	public int getSelectedAnimalListIndex() {
		return animalList.getSelectedIndex();
	}

	public void setDescription(String[] desc, String[] data) {
		int i = 0;
		Iterator<JLabel> itDesc = animalDescriptionLabels.iterator();
		while (itDesc.hasNext() && i < desc.length) {
			itDesc.next().setText(desc[i++]);
		}

		i = 0;
		Iterator<JLabel> itData = animalDataLabels.iterator();
		while (itData.hasNext() && i < data.length) {
			itData.next().setText(data[i++]);
		}
	}

	public void setEmptyDescription() {
		setDescription(EMPTY, EMPTY);
	}

	public LinkedList<JLabel> getAnimalDescriptionLabels() {
		return animalDescriptionLabels;
	}

	public LinkedList<JLabel> getAnimalDataLabels() {
		return animalDataLabels;
	}

	public void setDeleteButtonState(boolean b) {
		btnDelete.setEnabled(b);
	}

	public void setDeleteAllButtonState(boolean b) {
		btnDeleteAll.setEnabled(b);
	}

	// Used in a different event
	public boolean getCBDelete() {
		return cbDelete.isSelected();
	}

	public void setDeleteAllCheckBoxState(boolean b) {
		cbDeleteAll.setEnabled(b);
	}

	// Used when Delete buddon is pressed
	public void deleteSelectedAnimalList() {
		if (ZooData.getAnimalListSize() >= 1) {
			animalList.setListData(ZooData.getAnimalListNames());
		} else {
			animalList.setListData(new String[] { "Empty" });
		}
		animalList.setSelectedIndex(0);
	}

	// Delete All button effect
	public void deleteAnimalList() {
		animalList.setListData(new String[] { "Empty" });
	}

	public void setButtonDeleteActionListener(ActionListener a) {
		btnDelete.addActionListener(a);
	}

	public void setButtonDeleteAllActionListener(ActionListener a) {
		btnDeleteAll.addActionListener(a);
	}

	public void setCheckBoxDeleteActionListener(ActionListener a) {
		cbDelete.addActionListener(a);
	}

	public void setCheckBoxDeleteAllActionListener(ActionListener a) {
		cbDeleteAll.addActionListener(a);
	}

	public void setAnimalListListSelectionListener(ListSelectionListener a) {
		animalList.addListSelectionListener(a);
	}
}
