package javasmmr.zoowsome.repositories;

import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.*;


import org.w3c.dom.Element;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly();
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach();
			cockroach.decodeFromXml(element);
			return cockroach;

		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider();
			spider.decodeFromXml(element);
			return spider;

		case Constants.Animals.Aquatics.Salmon:
			Animal salmon = new Salmon();
			salmon.decodeFromXml(element);
			return salmon;

		case Constants.Animals.Aquatics.SeaHorse:
			Animal seaHorse = new SeaHorse();
			seaHorse.decodeFromXml(element);
			return seaHorse;

		case Constants.Animals.Aquatics.Shark:
			Animal shark = new Shark();
			shark.decodeFromXml(element);
			return shark;

		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey();
			monkey.decodeFromXml(element);
			return monkey;

		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;

		case Constants.Animals.Birds.Albatross:
			Animal albatross = new Albatross();
			albatross.decodeFromXml(element);
			return albatross;

		case Constants.Animals.Birds.Flamingo:
			Animal flamingo = new Flamingo();
			flamingo.decodeFromXml(element);
			return flamingo;

		case Constants.Animals.Birds.Owl:
			Animal owl = new Owl();
			owl.decodeFromXml(element);
			return owl;

		case Constants.Animals.Birds.Penguin:
			Animal penguin = new Penguin();
			penguin.decodeFromXml(element);
			return penguin;

		case Constants.Animals.Reptiles.Amphisbaenian:
			Animal amphisbaenian = new Amphisbaenian();
			amphisbaenian.decodeFromXml(element);
			return amphisbaenian;

		case Constants.Animals.Reptiles.Chameleon:
			Animal chameleon = new Chameleon();
			chameleon.decodeFromXml(element);
			return chameleon;

		case Constants.Animals.Reptiles.Tuataras:
			Animal tuataras = new Tuataras();
			tuataras.decodeFromXml(element);
			return tuataras;

		default:
			break;
		}
		return null;
	}

	
}