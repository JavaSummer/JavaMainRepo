package javasmmr.zoowsome.views.animals.create;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.services.factories.animal.Constants.Frames;
import javasmmr.zoowsome.views.ZooFrame;
/**
 * 
 * @author Marius Bologa
 *
 */
public class AnimalListFrame extends ZooFrame {
	/**
	 * 
	 * @param careTaker An array of caretakers.
	 */
	private static JFrame printAnimals(final ArrayList<Animal> animal) {
		int x = 8;
		JFrame someFrame = new JFrame();
	    someFrame.setSize(Frames.WIDTH, Frames.HEIGHT);
	    someFrame.setVisible(true);
		someFrame.setLayout(new GridLayout(animal.size(), animal.size(), 0, 0));
		for (int i = 0; i < animal.size(); i++) {
			JLabel l = new JLabel("Name:");
	        someFrame.add(l);
			JLabel l4 = new JLabel(animal.get(i).getName());
			someFrame.add(l4);
			JLabel l1 = new JLabel("NrOfLegs:");
			 someFrame.add(l1);
				JLabel l5 = new JLabel(String.valueOf((animal.get(i).getNrOfLegs())));
				 someFrame.add(l5);
			JLabel l2 = new JLabel("Dangerperc:");
			 someFrame.add(l2);
				JLabel l6 = new JLabel(String.valueOf((animal.get(i).getDangerPerc())));
				 someFrame.add(l6);
			JLabel l3 = new JLabel("MaintenanceCost:");
			 someFrame.add(l3);
				JLabel l7 = new JLabel(String.valueOf(animal.get(i).getMaintenanceCost()));
				 someFrame.add(l7);
		}
		return someFrame;

	}
	/**
	 * 
	 * @return A random Animal[];
	 * @throws Exception .
	 */
	private static ArrayList<Animal> randomAnimals() throws Exception {
		int n = 10;
		int x = 3, y = 5;
		String[] species = { Constants.Species.Aquatic, 
				Constants.Species.Mammal, Constants.Species.Bird,
				Constants.Species.Insect, Constants.Species.Reptile };

		String[][] animals = {
				{ Constants.Animals.Aquatic.Tuna, 
					Constants.Animals.Aquatic.Shark,
						Constants.Animals.Aquatic.NorthernPike },
				{ Constants.Animals.Mammals.Cow, Constants.Animals.
							Mammals.Tiger, Constants.Animals.Mammals.Monkey },
				{ Constants.Animals.Birds.Eagle, Constants.
								Animals.Birds.WhiteStork,
								Constants.Animals.Birds.Pelican },
				{ Constants.Animals.Insects.Cockroach,
									Constants.Animals.Insects.Spider,
						Constants.Animals.Insects.Butterfly },
				{ Constants.Animals.Reptiles.Turtle, 
							Constants.Animals.Reptiles.Boomslang,
						Constants.Animals.Reptiles.Tuatara } };
		AnimalFactory abstractFactory = new AnimalFactory();
		ArrayList<Animal> a = new ArrayList<>();
		Animal animal;
		 Random randomGenerator = new Random();
		for (int j = 0; j < n; j++) {
			 int randomIntAnimals = randomGenerator.nextInt(x);
			 int randomIntSpecies = randomGenerator.nextInt(y);
			SpeciesFactory sf = abstractFactory.getSpeciesFactory(
					species[randomIntSpecies]);
			animal = sf.getAnimal(animals[randomIntSpecies]
					[randomIntAnimals]);
			a.add(animal);
		}
		return a;
	}
	/**
	 * 
	 * @param title 
	 * @throws Exception 
	 */
		    public AnimalListFrame(final String title) throws Exception {
				super(title);
				ArrayList<Animal> animals = new ArrayList<>();
				animals = randomAnimals();
				printAnimals(animals);
				JLabel label = new JLabel("Animals");
				JFrame someFrame = new JFrame();
				getContentPane().setLayout(new FlowLayout());
			    getContentPane().add(label);
			    setSize(230, 230 ); 
			    setLocationRelativeTo(null);  
			    setVisible(true);	        // Sets up the view and adds the components
			
		    		         
		    	    
		    }



			@Override
			public void goBack() {
				// TODO Auto-generated method stub
				
			}
}