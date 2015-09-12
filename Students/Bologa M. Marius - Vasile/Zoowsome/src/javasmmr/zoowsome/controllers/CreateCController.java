package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.views.animals.create.CreateCFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateCController extends AbstractController {
	/**
	 * 
	 */
	private CreateCFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame .
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateCController(final CreateCFrame frame, final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCreateButtonActionListener(new CreateButtonActionListener());
		this.frame1 = frame;

	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	public class CreateButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			try {
				Caretaker c = new Caretaker(frame1.getTheName(), frame1.getId(), frame1.getSalary());

				try {
					employees = employeeRepository.load();
				} catch (ParserConfigurationException | SAXException | IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				employees.add(c);
				try {
					employeeRepository.save(employees);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (XMLStreamException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (ParseException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			JOptionPane.showMessageDialog(frame, "Successfully created!");
		}

	}
}