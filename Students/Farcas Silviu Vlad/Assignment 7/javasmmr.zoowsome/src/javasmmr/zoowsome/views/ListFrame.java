package javasmmr.zoowsome.views;

import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;

public class ListFrame extends ZooFrame {

	public ListFrame(String title) {
		super(title);
	}

	public void getRepository(AnimalRepository aniRep, ArrayList<Animal> animal, EmployeeRepository empRep,
			ArrayList<Employee> emp) {
		try {
			animal = aniRep.load();
			emp = empRep.load();
			if (!animal.isEmpty()) {
				contentPanel.add(new JLabel("Animals: "));
				for (Animal ani : animal) {
					contentPanel.add(new JLabel("[" + ani.getClass().getSimpleName() + "; Name: "));
					contentPanel.add(new JLabel(ani.getName() + "; Nr. of legs: "));
					contentPanel.add(new JLabel(String.valueOf(ani.getNrOfLegs()) + "]"));
				}
			}
			if (!emp.isEmpty()) {
				contentPanel.add(new JLabel("Employees: "));
				for (Employee em : emp) {
					contentPanel.add(new JLabel("[" + em.getClass().getSimpleName() + "; Name: "));
					contentPanel.add(new JLabel(em.getName() + "; ID: "));
					contentPanel.add(new JLabel(String.valueOf(em.getId()) + "; Salary: "));
					contentPanel.add(new JLabel(String.valueOf(em.getSalary()) + "]"));
				}
			}
		} catch (Exception e) {

		}
	}
}
