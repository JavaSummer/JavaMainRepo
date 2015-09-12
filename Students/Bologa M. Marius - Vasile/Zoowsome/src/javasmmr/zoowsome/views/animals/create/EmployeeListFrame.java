package javasmmr.zoowsome.views.animals.create;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.views.ZooFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class EmployeeListFrame extends ZooFrame {
	/**
	 * 
	 * @param emp
	 *            An array of employees.
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	private static JFrame printEmployees(final ArrayList<Employee> emp)
			throws ParserConfigurationException, SAXException, IOException {
		TableEModel m = new TableEModel(emp);
		JTable t = new JTable(m);
		JPanel panel = new JPanel();
		JFrame fram = new JFrame("Employees");
		panel.setLayout(new BorderLayout());
		JScrollPane tableC = new JScrollPane(t);
		tableC.getViewport().add(t);
		panel.add(tableC);
		fram.getContentPane().add(panel);
		fram.pack();
		fram.setVisible(true);
		return fram;
	}

	/**
	 * 
	 * @param title
	 *            Title of the frame.
	 * @throws Exception
	 *             .
	 */
	public EmployeeListFrame(final String title) throws Exception {
		super(title);
		EmployeeRepository abstractEmployeeRepository = new EmployeeRepository();
		ArrayList<Employee> employees = abstractEmployeeRepository.load();
		printEmployees(employees);

	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}