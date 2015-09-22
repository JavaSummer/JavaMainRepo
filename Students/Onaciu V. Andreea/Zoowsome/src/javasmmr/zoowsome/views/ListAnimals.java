package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JTable;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.models.animals.Animal;
import java.awt.*;
import javax.swing.*;

public class ListAnimals extends ZooFrame {
	JTable table;
	JLabel sentence;
	ArrayList<Animal> animals;

	public ListAnimals(String title, ArrayList<Animal> animals) {
		super(title);
		this.animals = animals;
		contentPanel.setLayout(new FlowLayout());
		JPanel panel = new JPanel();

		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		FlowLayout slPanel = new FlowLayout();
		pan.setLayout(slPanel);

		String[] columns = { "Species", "Name", "NrOfLegs", "MaintenanceCost", "DangerPercent" };
		String[][] info = new String[animals.size()][columns.length];
		int i = 0;
		for (Animal animal : animals) {
			info[i][0] = animal.getClass().getSimpleName();
			info[i][1] = animal.getName();
			info[i][2] = String.valueOf(animal.getNrOfLegs());
			info[i][3] = String.valueOf(animal.getMaintenanceCost());
			info[i][4] = String.valueOf(animal.getDangerPerc());
			i++;
		}
		JTable table = new JTable(info, columns);
		table.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table.setFillsViewportHeight(true);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}