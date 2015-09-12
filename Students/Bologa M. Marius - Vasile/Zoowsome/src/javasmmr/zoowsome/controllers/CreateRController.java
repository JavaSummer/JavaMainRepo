package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.views.animals.create.CreateRFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateRController extends AbstractController {
	/**
	 * 
	 */
	private CreateRFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame.
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateRController(final CreateRFrame frame, final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCreateButtonActionListener(new CreateReptileButtonActionListener());
		this.frame1 = frame;
		try {
			sf = abstractFactory.getSpeciesFactory(species[4]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	public class CreateReptileButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			if (frame1.getBoomslang().isSelected()) {
				try {
					Animal animal = sf.getAnimal(animalsF[4][1]);
					animal.setName(frame1.getTheName());
					animal.setNrOfLegs(frame1.getNrOfLegs());
					animal.setMaintenanceCost(frame1.getMaintenanceCost());
					animal.setDangerPerc(frame1.getDangerPerc());
					animals = animalRepository.load();
					animals.add(animal);
					animalRepository.save(animals);
				} catch (Exception e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			} else if (frame1.getTuatara().isSelected()) {
				try {
					Animal animal = sf.getAnimal(animalsF[4][2]);
					animal.setName(frame1.getTheName());
					animal.setNrOfLegs(frame1.getNrOfLegs());
					animal.setMaintenanceCost(frame1.getMaintenanceCost());
					animal.setDangerPerc(frame1.getDangerPerc());
					animals = animalRepository.load();
					animals.add(animal);
					animalRepository.save(animals);
				} catch (Exception e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			} else {
				try {
					Animal animal = sf.getAnimal(animalsF[4][0]);
					animal.setName(frame1.getTheName());
					animal.setNrOfLegs(frame1.getNrOfLegs());
					animal.setMaintenanceCost(frame1.getMaintenanceCost());
					animal.setDangerPerc(frame1.getDangerPerc());
					animals = animalRepository.load();
					animals.add(animal);
					animalRepository.save(animals);
				} catch (Exception e3) {
					// TODO Auto-generated catch block
					e3.printStackTrace();
				}
			}
			JOptionPane.showMessageDialog(frame, "Successfully created!");

		}
	}
}