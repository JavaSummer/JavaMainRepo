package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Crocodile;
import javasmmr.zoowsome.views.ReptileFrame;

public class ReptileController extends AbstractController {

	private ReptileFrame frame;

	public ReptileController(ReptileFrame frame, boolean hasBackButton) {
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
			boolean laysEggs = frame.getLysEggs();

			switch (frame.getAnimalType()) {
			case "Crocodile":
				Data.addAnimalToList(new Crocodile(name, nrOfLegs, laysEggs, maintenanceCost, dangerPerc));
				break;
			case "Lizard":
				Data.addAnimalToList(new Crocodile(name, nrOfLegs, laysEggs, maintenanceCost, dangerPerc));
				break;
			case "Turtle":
				Data.addAnimalToList(new Crocodile(name, nrOfLegs, laysEggs, maintenanceCost, dangerPerc));
				break;
			}

		}

	}

}