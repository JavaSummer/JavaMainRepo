package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * 
 * @author Marius Bologa
 *
 */
public class AddController extends AbstractController {
	/**
	 * 
	 * @param addFrame
	 *            If we need to add a new frame.
	 * @param hasBackButton
	 *            If the back button was pushed.
	 */
	public AddController(final AddFrame addFrame, final boolean hasBackButton) {
		super(addFrame, hasBackButton);
		addFrame.setAnimal(new AnimalButtonActionListener());
		addFrame.setEmployee(new EmployeeButtonActionListener());
	
	}
/**
 * 
 * @author Marius Bologa
 *
 */
	public class AnimalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new AnimalController(new AnimalFrame("Animal"), true);
		 	   
		}
	}
	public class EmployeeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			new EmployeeController(new EmployeeFrame("Employee"), true);
		}
	}
	
	
}