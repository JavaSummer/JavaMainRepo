package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Pelican;
import javasmmr.zoowsome.models.animals.WhiteStork;
import javasmmr.zoowsome.views.animals.create.CreateBFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateBController extends AbstractController {
	/**
	 * 
	 */
	private CreateBFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame .
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateBController(final CreateBFrame frame,
			final boolean hasBackButton) {
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
			if (frame1.getPelican().isSelected()) {
				new Pelican(frame1.getName(), frame1.
						getAvgFlightAltitude(), frame1.getMaintenanceCost(),
						frame1.getDangerPerc());
			} else if (frame1.getWhitestork().isSelected()) {
				new WhiteStork(frame1.getName(), frame1.
						getAvgFlightAltitude(), frame1.getMaintenanceCost(),
						frame1.getDangerPerc());
			} else {
				new Eagle(frame1.getName(), frame1.getMigrates(), 
						frame1.getAvgFlightAltitude(),
						frame1.getMaintenanceCost(), frame1.getDangerPerc());

			}
			JOptionPane.showMessageDialog(frame, "Successfully created!");
		}
	}
}
