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

			if ((!mammal.getName().equals("Enter name")) && (!mammal.getNrOfLegs().equals("Enter nrOfLegs"))
					&& (!mammal.getCost().equals("Enter cost")) && (!mammal.getDanger().equals("Enter danger perc"))
					&& (!mammal.getHair().equals("Enter perc.body hair"))
					&& (!mammal.getTemp().equals("Enter body temp"))) {

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
						new MammalController(new MammalFrame("Mammal"), true);
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(mammal, "You must fill all the fields !");
				new MammalController(new MammalFrame("Mammal"), true);
			}

		}
	}

}
