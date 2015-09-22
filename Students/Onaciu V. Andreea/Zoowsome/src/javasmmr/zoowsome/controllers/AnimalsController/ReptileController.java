package javasmmr.zoowsome.controllers.AnimalsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.controllers.*;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.AnimalsFrame.ReptileFrame;
import javasmmr.zoowsome.models.animals.*;

public class ReptileController extends AbstractController {
	ReptileFrame reptile;

	public ReptileController(ReptileFrame reptileFrame, boolean hasBackButton) {
		super(reptileFrame, hasBackButton);
		this.reptile = reptileFrame;
		reptileFrame.setSaveButtonActionListener(new SaveButtonActionListener());
	}

	private class SaveButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if ((!reptile.getName().equals("")) && (!reptile.getNrOfLegs().equals(""))
					&& (!reptile.getCost().equals(""))
					&& (!reptile.getDanger().equals(""))) {

				if (JOptionPane.showConfirmDialog(reptile, "Are you sure you want to save this reptile ?") == 0) {

					try {
						String name = reptile.getName();
						String nrOfLegs = reptile.getNrOfLegs();
						String cost = reptile.getCost();
						String danger = reptile.getDanger();
						Boolean eggs = reptile.getEggs();
						String animal = reptile.getReptile();
						Reptile a;
						if (animal.equals("Ampisbaenian"))
							a = new Amphisbaenian(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), eggs);
						else if (animal.equals("Tuataras"))
							a = new Tuataras(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), eggs);
						else
							a = new Chameleon(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), eggs);
						animals.add(a);
						JOptionPane.showMessageDialog(reptile, "The reptile was succesfully created !");
						new MainMenuController(new MainMenuFrame("Menu"), true);
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(reptile, "Entered data is wrong");
						
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(reptile, "You must fill all the fields !");
			
			}

		}
	}

}
