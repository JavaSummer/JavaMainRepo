package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.Constants.Frames;

@SuppressWarnings("serial")
public class ListFrame extends ZooFrame {

	public ListFrame(String title) {
		super(title);
	}

	public void CreateAnimalTable(AnimalRepository animalRepository)
			throws ParserConfigurationException, SAXException, IOException {

		ArrayList<Animal> animalList = new ArrayList<>();
		animalList = animalRepository.load();

		if (animalList.size() != 0) {
			String[] columnNames = { "Name", "Danger %", "Maintenance Cost", "# of legs", "Taken care of" };
			String[][] info = new String[animalList.size()][5];

			for (int row = 0; row < animalList.size(); row++) {

				info[row][0] = String.valueOf(animalList.get(row).getName());
				info[row][1] = String.valueOf(animalList.get(row).getDangerPerc());
				info[row][2] = String.valueOf(animalList.get(row).getMaintenanceCost());
				info[row][3] = String.valueOf(animalList.get(row).getNrOfLegs());
				info[row][4] = String.valueOf(animalList.get(row).getTakenCareOf());

			}

			JTable animalTable = new JTable(info, columnNames);
			animalTable.setPreferredScrollableViewportSize(new Dimension(Frames.WIDTH, Frames.HEIGHT));
			animalTable.setFillsViewportHeight(true);
			getContentPane().add(new JScrollPane(animalTable), BorderLayout.CENTER);
			pack();

		} else {
			JOptionPane.showMessageDialog(contentPanel, "No animal to display.", "Warning",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	public void CreateEmployeeTable(EmployeeRepository employeeRepository)
			throws ParserConfigurationException, SAXException, IOException {
		
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList = employeeRepository.load();
		
		if (employeeList.size() != 0) {

			String[] columnNames = { "Name", "ID", "Salary", "Is dead" };
			String[][] info = new String[employeeList.size()][4];

			for (int row = 0; row < employeeList.size(); row++) {

				info[row][0] = String.valueOf(employeeList.get(row).getName());
				info[row][1] = String.valueOf(employeeList.get(row).getId());
				info[row][2] = String.valueOf(employeeList.get(row).getSalary());
				info[row][3] = String.valueOf(employeeList.get(row).getIsDead());

			}

			JTable employeeTable = new JTable(info, columnNames);
			employeeTable.setPreferredScrollableViewportSize(new Dimension(Frames.WIDTH, Frames.HEIGHT));
			employeeTable.setFillsViewportHeight(true);
			getContentPane().add(new JScrollPane(employeeTable), BorderLayout.CENTER);
			pack();

		} else {
			JOptionPane.showMessageDialog(contentPanel, "No employee to display.", "Warning",
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
