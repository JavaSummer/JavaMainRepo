package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.models.animals.Wolf;
import javasmmr.zoowsome.views.MammalFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class MammalController extends AbstractController {

	private MammalFrame frame;

	public MammalController(MammalFrame frame, boolean hasBackButton) {
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
			float percBodyHair = frame.getPercBodyHair();
			float normalBodyTemp = frame.getNormalBodyTemp();

			switch (frame.getAnimalType()) {
			case "Cow":
				Data.addAnimalToList(new Cow(name, nrOfLegs, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc));
				break;
			case "Tiger":
				Data.addAnimalToList(new Tiger(name, nrOfLegs, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc));
				break;
			case "Wolf":
				Data.addAnimalToList(new Wolf(name, nrOfLegs, normalBodyTemp, percBodyHair, maintenanceCost, dangerPerc));
				break;
			}
			
			FrameStack.getInstance().pop();

		}

	}

}