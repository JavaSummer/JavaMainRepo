package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.views.animals.create.CreateIFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateIController extends AbstractController {
	/**
	 * 
	 */
	private CreateIFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateIController(final CreateIFrame frame,
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
			if (frame1.getButterfly().isSelected()) {
				new Butterfly(frame1.getName(), frame1.
						getMaintenanceCost(), frame1.getDangerPerc());
				System.out.println("1");
			} else if (frame1.getCockroach().isSelected()) {
				new Cockroach(frame1.getName(), frame1.
						getMaintenanceCost(), frame1.getDangerPerc());
				System.out.println("2");
			} else {
				new Spider(frame1.getName(), frame1.
						getDangerous(), frame1.getMaintenanceCost(),
						frame1.getDangerPerc());
				System.out.println("3");
			}
			JOptionPane.showMessageDialog(frame, "Successfully created!");
		}

	}
}
