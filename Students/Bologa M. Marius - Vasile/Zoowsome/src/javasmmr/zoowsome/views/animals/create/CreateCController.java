package javasmmr.zoowsome.views.animals.create;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.UUID;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.views.AbstractController;
/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateCController extends AbstractController {
	private CreateCFrame frame1;
	/**
	 * 
	 * @param frame Add a new frame .
	 * @param hasBackButton If the back button was pushed or not.
	 */
	public CreateCController(final CreateCFrame frame, final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCreateButtonActionListener(new CreateButtonActionListener());
		this.frame1=frame;
	}
/**
 * 
 * @author Marius Bologa
 *
 */
	public class CreateButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			ArrayList<Caretaker> c= new ArrayList<>();
		try {
			c.add(new Caretaker(frame1.getTheName(), frame1.getId(), frame1.getSalary()));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(frame, "Successfully created!");
	}

}
}