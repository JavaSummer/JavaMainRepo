package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Boomslang;
import javasmmr.zoowsome.models.animals.Tuatara;
import javasmmr.zoowsome.models.animals.Turtle;
import javasmmr.zoowsome.views.animals.create.CreateRFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateRController extends AbstractController {
	/**
	 * 
	 */
	private CreateRFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateRController(final CreateRFrame frame,
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
			if (frame1.getBoomslang().isSelected()) {
				new Boomslang(frame1.getName(), frame1.
						getMaintenanceCost(), frame1.getDangerPerc());
			} else if (frame1.getTuatara().isSelected()) {
				new Tuatara(frame1.getName(), frame1.
						getMaintenanceCost(), frame1.getDangerPerc());
			} else {
				new Turtle(frame1.getName(), frame1.
						getMaintenanceCost(), frame1.getDangerPerc());
			}
			JOptionPane.showMessageDialog(frame, "Successfully created!");

		}
	}
}