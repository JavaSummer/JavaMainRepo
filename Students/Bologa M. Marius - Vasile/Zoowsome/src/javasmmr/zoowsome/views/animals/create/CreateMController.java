package javasmmr.zoowsome.views.animals.create;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Boomslang;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Tuatara;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.views.AbstractController;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateMController extends AbstractController {
	private CreateMFrame frame1;
	/**
	 * 
	 * @param frame Add a new frame.
	 * @param hasBackButton If the back button was pushed or not.
	 */
	public CreateMController(final CreateMFrame frame, final boolean hasBackButton) {
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
			if (frame1.getCow()) {
				new Cow(frame1.getName(),
					frame1.getPercBodyHair(), frame1.
					getMaintenanceCost(), frame1.getDangerPerc());
			} else if (frame1.getMonkey()) {
				new Monkey(frame1.getName(), frame1.
					getPercBodyHair(), frame1.
					getMaintenanceCost(), frame1.getDangerPerc());
			} else {
				new Tiger(frame1.getName(), frame1.
				getPercBodyHair(), frame1.
				getMaintenanceCost(), frame1.getDangerPerc());
			}
			JOptionPane.showMessageDialog(frame, "Successfully created!"); 
	}

}
}