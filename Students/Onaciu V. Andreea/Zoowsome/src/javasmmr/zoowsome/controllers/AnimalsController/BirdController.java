package javasmmr.zoowsome.controllers.AnimalsController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.controllers.*;
import javasmmr.zoowsome.views.MainMenuFrame;

import javasmmr.zoowsome.views.AnimalsFrame.BirdFrame;
import javasmmr.zoowsome.models.animals.*;

public class BirdController extends AbstractController {
	BirdFrame bird;

	public BirdController(BirdFrame birdFrame, boolean hasBackButton) {
		super(birdFrame, hasBackButton);
		this.bird = birdFrame;
		birdFrame.setSaveButtonActionListener(new SaveButtonActionListener());

	}

	private class SaveButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if ((!bird.getName().equals("")) && (!bird.getNrOfLegs().equals(""))
					&& (!bird.getCost().equals("")) && (!bird.getDanger().equals(""))
					&& (!bird.getFlight().equals(""))) {

				if (JOptionPane.showConfirmDialog(bird, "Are you sure you want to save this aquatic animal ?") == 0) {

					try {
						String name = bird.getName();
						String nrOfLegs = bird.getNrOfLegs();
						String cost = bird.getCost();
						String danger = bird.getDanger();
						String flight = bird.getFlight();
						Boolean migrates = bird.getMigrates();
						String animal = bird.getBird();
						Bird a;
						if (animal.equals("Albatross"))
							a = new Albatross(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(flight), migrates);
						else if (animal.equals("Penguin"))
							a = new Penguin(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(flight), migrates);
						else if (animal.equals("Owl"))
							a = new Owl(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(flight), migrates);
						else
							a = new Flamingo(Integer.parseInt(nrOfLegs), name, Double.parseDouble(cost),
									Double.parseDouble(danger), Integer.parseInt(flight), migrates);
						animals.add(a);
						animalRepo.save(animals);
						JOptionPane.showMessageDialog(bird, "The bird was succesfully created !");
						new MainMenuController(new MainMenuFrame("Menu"), true);
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(bird, "Entered data is wrong");
						
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(bird, "You must fill all the fields !");
				
			}

		}
	}

}
