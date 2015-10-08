package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Piranha;
import javasmmr.zoowsome.models.animals.Sardine;
import javasmmr.zoowsome.models.animals.WaterType;
import javasmmr.zoowsome.views.AquaticFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

public class AquaticController extends AbstractController {

	private final AquaticFrame frame;

	public AquaticController(AquaticFrame frame, boolean hasBackButton) {
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
			WaterType waterType = frame.getWaterType();
			int avgSwimDepth = frame.getAvgSwimDepth();

			switch (frame.getAnimalType()) {
			case "Dolphin":
				Data.addAnimalToList(new Dolphin(name, nrOfLegs, avgSwimDepth, waterType, maintenanceCost, dangerPerc));
				break;
			case "Sardine":
				Data.addAnimalToList(new Sardine(name, nrOfLegs, avgSwimDepth, waterType, maintenanceCost, dangerPerc));
				break;
			case "Piranha":
				Data.addAnimalToList(new Piranha(name, nrOfLegs, avgSwimDepth, waterType, maintenanceCost, dangerPerc));
				break;
			}

			FrameStack.getInstance().pop();
		}

	}

}
