package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Scarabeus;
import javasmmr.zoowsome.views.InsectFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class InsectController extends AbstractController {

	private InsectFrame frame;

	public InsectController(InsectFrame frame, boolean hasBackButton) {
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
			boolean isDangerous = frame.getDangerous();
			boolean canFly = frame.getCanFly();

			switch (frame.getAnimalType()) {
			case "Butterfly":
				Data.addAnimalToList(new Butterfly(name, nrOfLegs, canFly, isDangerous, maintenanceCost, dangerPerc));
				break;
			case "Cockroach":
				Data.addAnimalToList(new Cockroach(name, nrOfLegs, canFly, isDangerous, maintenanceCost, dangerPerc));
				break;
			case "Scarabeus":
				Data.addAnimalToList(new Scarabeus(name, nrOfLegs, isDangerous, canFly, maintenanceCost, dangerPerc));
				break;
			}
			
			FrameStack.getInstance().pop();

		}

	}

}