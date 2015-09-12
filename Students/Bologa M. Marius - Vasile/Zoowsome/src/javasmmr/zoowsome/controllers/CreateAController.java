package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.views.animals.create.CreateAFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateAController extends AbstractController {
	/**
	 * 
	 */
	private CreateAFrame frame1;

	/**
	 * 
	 * @param frame
	 *            Add a new frame .
	 * @param hasBackButton
	 *            If the back button was pushed or not.
	 */
	public CreateAController(final CreateAFrame frame, final boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setCreateButtonActionListener(new CreateAquaticButtonActionListener());
		this.frame1 = frame;
		try {
			sf = abstractFactory.getSpeciesFactory(species[0]);
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
	public class CreateAquaticButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			if (frame1.getShark().isSelected()) {
				try {
					Animal animal = sf.getAnimal(animalsF[0][1]);
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
			} else if (frame1.getTuna().isSelected()) {
				try {
					Animal animal = sf.getAnimal(animalsF[0][0]);
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
					Animal animal = sf.getAnimal(animalsF[0][2]);
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