package javasmmr.zoowsome.views;

import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.JTable;
import javasmmr.zoowsome.models.employees.Employee;
import java.awt.*;
import javax.swing.*;

public class ListEmployees extends ZooFrame {
	JTable table1;
	JLabel sentence;
	ArrayList<Employee> employees;

	public ListEmployees(String title, ArrayList<Employee> employees) {
		super(title);
		this.employees = employees;
		contentPanel.setLayout(new FlowLayout());
		JPanel panel = new JPanel();

		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		FlowLayout slPanel = new FlowLayout();
		pan.setLayout(slPanel);
		String[] columns1 = { "Function", "Name", "ID", "Salary" };
		String[][] info1 = new String[employees.size()][columns1.length];
		int i1 = 0;
		for (Employee employee : employees) {
			info1[i1][0] = employee.getClass().getSimpleName();
			info1[i1][1] = employee.getName();
			info1[i1][2] = String.valueOf(employee.getId());
			info1[i1][3] = String.valueOf(employee.getSalary());
			i1++;
		}
		JTable table1 = new JTable(info1, columns1);
		table1.setPreferredScrollableViewportSize(new Dimension(500, 50));
		table1.setFillsViewportHeight(true);
		JScrollPane scrollPane1 = new JScrollPane(table1);
		add(scrollPane1);

		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}
