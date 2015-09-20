package javasmmr.zoowsome.controllers.AnimalsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.controllers.*;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.AnimalsFrame.AquaticFrame;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.animals.SeaHorse;
import javasmmr.zoowsome.models.animals.WaterType;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Shark;

public class AquaticController extends AbstractController {
	public AquaticFrame aquatic;

	public AquaticController(AquaticFrame aquaticFrame, boolean hasBackButton) {
		super(aquaticFrame, hasBackButton);
		aquaticFrame.setSaveButtonActionListener(new SaveButtonActionListener());
		this.aquatic = aquaticFrame;
	}

	private class SaveButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if ((!aquatic.getName().equals("")) && (!aquatic.getNrOfLegs().equals(""))
					&& (!aquatic.getCost().equals("")) && (!aquatic.getDanger().equals(""))
					&& (!aquatic.getDepth().equals(""))) {

				if (JOptionPane.showConfirmDialog(aquatic,
						"Are you sure you want to save this aquatic animal ?") == 0) {

					try {
						String name = aquatic.getName();
						String nrOfLegs = aquatic.getNrOfLegs();
						String cost = aquatic.getCost();
						String danger = aquatic.getDanger();
						String depth = aquatic.getDepth();
						String water = aquatic.getWater();
						String animal = aquatic.getAquatic();
						Aquatic a;
						if (animal.equals("SeaHorse"))
							a = new SeaHorse(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(depth), WaterType.getWater(water));
						else if (animal.equals("Shark"))
							a = new Shark(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(depth), WaterType.getWater(water));
						else
							a = new Salmon(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(depth), WaterType.getWater(water));
						animals.add(a);
						JOptionPane.showMessageDialog(aquatic, "Aquatic animal was succesfully created !");
						new MainMenuController(new MainMenuFrame("Menu"), true);
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(aquatic, "Entered data is wrong");
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(aquatic, "You must fill all the fields !");
				
			}

		}
	}

}
