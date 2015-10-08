package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Mockingjay;
import javasmmr.zoowsome.models.animals.Pigeon;
import javasmmr.zoowsome.views.BirdFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class BirdController extends AbstractController {

	private BirdFrame frame;

	public BirdController(BirdFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		this.frame = frame;

		frame.setCreateButtonActionListener(new CreateButtonActionListener());
	}

	private class CreateButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String name = frame.getNameText();
			int nrOfLegs = frame.getNrOfLegs();
			float maintenanceCost = frame.getMaintenanceCost();
			float dangerPerc = frame.getDangerPerc();
			int avgFlightAltitude = frame.getAvgFlightAltitude();
			boolean migrates = frame.getMigrates();

			switch (frame.getAnimalType()) {
			case "Pigeon":
				Data.addAnimalToList(new Pigeon(name, nrOfLegs, migrates, avgFlightAltitude, maintenanceCost, dangerPerc));
				break;
			case "Eagle":
				Data.addAnimalToList(new Eagle(name, nrOfLegs, migrates, avgFlightAltitude, maintenanceCost, dangerPerc));
				break;
			case "Mockingjay":
				Data.addAnimalToList(new Mockingjay(name, nrOfLegs, migrates, avgFlightAltitude, maintenanceCost, dangerPerc));
				break;
			}
			
			FrameStack.getInstance().pop();
		}

	}

}