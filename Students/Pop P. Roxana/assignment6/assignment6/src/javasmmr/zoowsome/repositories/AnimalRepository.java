package javasmmr.zoowsome.repositories;

import org.w3c.dom.*;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal>{

	private static final String XML_FILENAME = "Animals.xml";

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
