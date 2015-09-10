package javasmmr.zoowsome.views;

import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
			int k=0;
			if (!animal.isEmpty()) {
				JTable jt1;
				String[] columns = {"Animal", "Name", "Nr. of Legs"};
				String[][] data = new String[animal.size()][3];
				for (Animal ani : animal) {
					data[k][0] = ani.getClass().getSimpleName();
					data[k][1] = ani.getName();
					data[k][2] = String.valueOf(ani.getNrOfLegs());
					k++;
				}
				jt1 = new JTable (data, columns)
						{
							public boolean isCellEditable (int row, int col){
								return false;
							}
						};
				jt1.setPreferredScrollableViewportSize(new Dimension(500, 150));
				contentPanel.add(new JScrollPane(jt1));
			}
			k=0;
			if (!emp.isEmpty()) {
				JTable jt2;
				String[] columns = {"Employee", "Name", "ID", "Salary"};
				String [][] data = new String[emp.size()][4];
				for (Employee em : emp) {
					data[k][0] = em.getClass().getSimpleName();
					data[k][1] = em.getName();
					data[k][2] = String.valueOf(em.getId());
					data[k][3] = String.valueOf(em.getSalary());
					k++;
				}
				jt2 = new JTable (data, columns){
					public boolean isCellEditable (int row, int col){
						return false;
					}
				};
				jt2.setPreferredScrollableViewportSize(new Dimension(500, 150));
				contentPanel.add(new JScrollPane(jt2));
			}
		} catch (Exception e) {

		}
	}
}
