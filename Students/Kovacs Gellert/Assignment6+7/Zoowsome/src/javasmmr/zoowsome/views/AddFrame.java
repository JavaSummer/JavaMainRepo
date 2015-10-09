package javasmmr.zoowsome.views;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.services.factories.Constants;

public class AddFrame extends ZooFrame {
	
	private static final long serialVersionUID = 1L;
	private JComboBox<String> cBoxSpecies;
	private JComboBox<String> cBoxAnimal;
	private JButton btnNext;	
	
	public AddFrame(String title) {
		super(title);
		
		contentPanel.setLayout(new GridLayout(1,1,0,0));
		JPanel panSelect = new JPanel();
		
		contentPanel.add(panSelect);
		SpringLayout slPanel = new SpringLayout();
		panSelect.setLayout(slPanel);
		
		JLabel entityTypeLabel = new JLabel("Type of entity that will be added: \n");
		slPanel.putConstraint(SpringLayout.NORTH, entityTypeLabel, 8, SpringLayout.NORTH, panSelect);
		slPanel.putConstraint(SpringLayout.WEST, entityTypeLabel, 5, SpringLayout.WEST, panSelect);
		
		cBoxSpecies = new JComboBox<String>(Constants.Arrays.Species);
		cBoxSpecies.setSelectedIndex(0);
		slPanel.putConstraint(SpringLayout.NORTH, cBoxSpecies, 5, SpringLayout.NORTH, panSelect);
		slPanel.putConstraint(SpringLayout.WEST, cBoxSpecies, 200, SpringLayout.WEST, panSelect);
		
		cBoxAnimal = new JComboBox<String>(Constants.Arrays.Aquatics);
		cBoxAnimal.setSelectedIndex(0);
		slPanel.putConstraint(SpringLayout.NORTH, cBoxAnimal, 5, SpringLayout.NORTH, panSelect);
		slPanel.putConstraint(SpringLayout.WEST, cBoxAnimal, 300, SpringLayout.WEST, panSelect);
		
		btnNext = new JButton("Next");
		btnNext.setPreferredSize(new Dimension(150, 100));
		slPanel.putConstraint(SpringLayout.NORTH, btnNext, 60, SpringLayout.NORTH, panSelect);
		slPanel.putConstraint(SpringLayout.WEST, btnNext, 175, SpringLayout.WEST, panSelect);
		
		panSelect.add(entityTypeLabel);
		panSelect.add(cBoxSpecies);
		panSelect.add(cBoxAnimal);
		panSelect.add(btnNext);
		
		setVisible(true);
	}
	
	public void setNextButtonActionListener(ActionListener a) {
		btnNext.addActionListener(a);
	}
	
	public void changeAnimalComboBoxElements(String[] fields) {
		cBoxAnimal.removeAllItems();
		for (String f : fields) {
			cBoxAnimal.addItem(f);
		}
	}
	
	public void setSpeciesComboBoxItemListener(ItemListener a) {
		cBoxSpecies.addItemListener(a);
	}

	public void setAnimalComboBoxItemListener(ItemListener a) {
		cBoxAnimal.addItemListener(a);
	}
	
	public JComboBox<String> getcBoxSpecies() {
		return cBoxSpecies;
	}
	
	public JComboBox<String> getcBoxAnimal() {
		return cBoxAnimal;
	}
}
