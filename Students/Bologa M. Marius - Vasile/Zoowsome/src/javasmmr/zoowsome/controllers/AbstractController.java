package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AbstractController {
	/**
	 * 
	 */
	public AnimalRepository animalRepository = new AnimalRepository();
	/**
	 * 
	 */
	public EmployeeRepository employeeRepository = new EmployeeRepository();
	/**
	 * 
	 */
	public ArrayList<Animal> animals = new ArrayList<>();
	/**
	 * 
	 */
	public ArrayList<Employee> employees = new ArrayList<>();
	/**
	 * 
	 */
	public String[] species = { Constants.Species.Aquatic, Constants.Species.Bird, Constants.Species.Insect,
			Constants.Species.Mammal, Constants.Species.Reptile };
	/**
	 * 
	 */
	public String[][] animalsF = {
			{ Constants.Animals.Aquatic.Tuna, Constants.Animals.Aquatic.Shark, Constants.Animals.Aquatic.NorthernPike },
			{ Constants.Animals.Birds.Eagle, Constants.Animals.Birds.WhiteStork, Constants.Animals.Birds.Pelican },
			{ Constants.Animals.Insects.Cockroach, Constants.Animals.Insects.Spider,
					Constants.Animals.Insects.Butterfly },
			{ Constants.Animals.Mammals.Cow, Constants.Animals.Mammals.Tiger, Constants.Animals.Mammals.Monkey },
			{ Constants.Animals.Reptiles.Turtle, Constants.Animals.Reptiles.Boomslang,
					Constants.Animals.Reptiles.Tuatara } };
	/**
	 * 
	 */
	public AnimalFactory abstractFactory = new AnimalFactory();
	/**
	 * 
	 */
	public SpeciesFactory sf;
	/**
	 * 
	 */
	protected ZooFrame frame;

	/**
	 * 
	 * @param frame
	 *            The frame.
	 * @param hasBackButton
	 *            The back button.
	 */
	public AbstractController(final ZooFrame frame, final boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton) {
			frame.setBackButtonActionListener(new BackButtonListener());
		}
	}

	/**
	 * 
	 * @author Marius Bologa
	 *
	 */
	private class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}
}