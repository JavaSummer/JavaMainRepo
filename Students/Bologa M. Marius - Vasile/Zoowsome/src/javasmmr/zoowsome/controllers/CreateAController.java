package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.NorthernPike;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Tuna;
import javasmmr.zoowsome.views.animals.create.CreateAFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateAController extends AbstractController {
	/**
	 * 
	 */
	private CreateAFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame .
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateAController(final CreateAFrame frame,
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
			if (frame1.getShark().isSelected()) {
				new Shark(frame1.getName(), frame1.
						getAvgSwimDepth(), frame1.getWaterType(),
						frame1.getMaintenanceCost(), frame1.
						getDangerPerc());
			} else if (frame1.getTuna().isSelected()) {
				new Tuna(frame1.getName(), frame1.getAvgSwimDepth(),
						frame1.getMaintenanceCost(),
						frame1.getDangerPerc());
			} else {
				new NorthernPike(frame1.getName(), frame1.
						getAvgSwimDepth(), frame1.getMaintenanceCost(),
						frame1.getDangerPerc());
			}
			JOptionPane.showMessageDialog(frame, "Successfully created!");
		}

	}
}