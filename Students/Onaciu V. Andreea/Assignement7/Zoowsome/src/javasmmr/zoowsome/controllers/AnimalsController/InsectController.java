package javasmmr.zoowsome.controllers.AnimalsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.controllers.*;
import javasmmr.zoowsome.views.MainMenuFrame;

import javasmmr.zoowsome.views.AnimalsFrame.InsectFrame;
import javasmmr.zoowsome.models.animals.*;

public class InsectController extends AbstractController {
	InsectFrame insect;

	public InsectController(InsectFrame insectFrame, boolean hasBackButton) {
		super(insectFrame, hasBackButton);
		this.insect = insectFrame;
		insectFrame.setSaveButtonActionListener(new SaveButtonActionListener());

	}

	private class SaveButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if ((!insect.getName().equals("Enter name")) && (!insect.getNrOfLegs().equals("Enter nrOfLegs"))
					&& (!insect.getCost().equals("Enter cost")) && (!insect.getDanger().equals("Enter danger perc"))) {

				if (JOptionPane.showConfirmDialog(insect, "Are you sure you want to save this insect ?") == 0) {

					try {
						String name = insect.getName();
						String nrOfLegs = insect.getNrOfLegs();
						String cost = insect.getCost();
						String danger = insect.getDanger();
						Boolean fly = insect.getFly();
						Boolean isDanger = insect.getIsDanger();
						String animal = insect.getInsect();
						Insect a;
						if (animal.equals("Butterfly"))
							a = new Butterfly(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), fly, isDanger);
						else if (animal.equals("Spider"))
							a = new Spider(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), fly, isDanger);
						else
							a = new Cockroach(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), fly, isDanger);
						animals.add(a);
						JOptionPane.showMessageDialog(insect, "The insect was succesfully created !");
						new MainMenuController(new MainMenuFrame("Menu"), true);
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(insect, "Entered data is wrong");
						new InsectController(new InsectFrame("Insect"), true);
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(insect, "You must fill all the fields !");
				new InsectController(new InsectFrame("Insect"), true);
			}

		}
	}

}
