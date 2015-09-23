package javasmmr.zoowsome.repositories;

import java.util.ArrayList;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Catfish;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Crocodiles;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Duck;
import javasmmr.zoowsome.models.animals.Lizard;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Pigeon;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Sparrow;
import javasmmr.zoowsome.models.animals.Spider;
import javasmmr.zoowsome.models.animals.Tiger;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal>{

	private static final String XML_FILENAME = "Animals.xml";
	
	//this is where I will store all the animals that have to be listed(assign 7)
	private static ArrayList<Animal> animalsToBeListed = new ArrayList<Animal>();
	
	public static void addAnimalToBeListed(Animal animal){
		animalsToBeListed.add(animal);
	}
	
	public static ArrayList<Animal>getAnimalsToBeListed(){
		return animalsToBeListed;
	}
	

	public AnimalRepository() {
		
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}


	
	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0)
				.getTextContent();
		switch (discriminant) {

		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;

		case Constants.Animals.Aquatics.Catfish:
			Animal catfish = new Catfish();
			catfish.decodeFromXml(element);
			return catfish;

		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;

		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;

		case Constants.Animals.Reptiles.Crocodiles:
			Animal crocodiles = new Crocodiles();
			crocodiles.decodeFromXml(element);
			return crocodiles;

		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;

		case Constants.Animals.Birds.Duck:
			Animal duck = new Duck();
			duck.decodeFromXml(element);
			return duck;

		case Constants.Animals.Reptiles.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;

		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;

		case Constants.Animals.Birds.Pigeon:
			Animal pigeon = new Pigeon();
			pigeon.decodeFromXml(element);
			return pigeon;

		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;

		case Constants.Animals.Birds.Sparrow:
			Animal sparrow = new Sparrow();
			sparrow.decodeFromXml(element);
			return sparrow;

		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;

		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;

		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Butterfly();
			turtle.decodeFromXml(element);
			return turtle;

		default:
			break;
		}
		
		return null;
	}

}
