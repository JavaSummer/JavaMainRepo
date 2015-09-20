package javasmmr.zoowsome.controllers.AnimalsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.controllers.*;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.AnimalsFrame.MammalFrame;
import javasmmr.zoowsome.models.animals.*;

public class MammalController extends AbstractController {
	MammalFrame mammal;

	public MammalController(MammalFrame mammalFrame, boolean hasBackButton) {
		super(mammalFrame, hasBackButton);
		this.mammal = mammalFrame;
		mammalFrame.setSaveButtonActionListener(new SaveButtonActionListener());
	}

	private class SaveButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if ((!mammal.getName().equals("")) && (!mammal.getNrOfLegs().equals(""))
					&& (!mammal.getCost().equals("")) && (!mammal.getDanger().equals(""))
					&& (!mammal.getHair().equals(""))&& (!mammal.getTemp().equals(""))) {

				if (JOptionPane.showConfirmDialog(mammal, "Are you sure you want to save this mammal ?") == 0) {

					try {
						String name = mammal.getName();
						String nrOfLegs = mammal.getNrOfLegs();
						String cost = mammal.getCost();
						String danger = mammal.getDanger();
						String hair = mammal.getHair();
						String temp = mammal.getTemp();
						String animal = mammal.getMammal();
						Mammal a;
						if (animal.equals("Cow"))
							a = new Cow(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Float.parseFloat(temp), Float.parseFloat(hair));
						else if (animal.equals("Tiger"))
							a = new Tiger(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Float.parseFloat(temp), Float.parseFloat(hair));
						else
							a = new Monkey(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Float.parseFloat(temp), Float.parseFloat(hair));

						animals.add(a);
						JOptionPane.showMessageDialog(mammal, "The mammal was succesfully created !");
						new MainMenuController(new MainMenuFrame("Menu"), true);
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(mammal, "Entered data is wrong");
					
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(mammal, "You must fill all the fields !");
			
			}

		}
	}

}
