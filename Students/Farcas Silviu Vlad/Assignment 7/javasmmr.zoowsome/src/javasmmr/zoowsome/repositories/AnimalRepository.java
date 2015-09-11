package javasmmr.zoowsome.repositories;

import java.util.ArrayList;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	protected Animal getEntityFromXmlElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animal.Bird.Chicken:
			Animal chicken = new Chicken(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			chicken.decodeFromXml(element);
			return chicken;
		case Constants.Animal.Bird.Stork:
			Animal stork = new Stork(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			stork.decodeFromXml(element);
			return stork;
		case Constants.Animal.Bird.Swallow:
			Animal swallow = new Swallow(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			swallow.decodeFromXml(element);
			return swallow;
		case Constants.Animal.Aquatic.Dolphin:
			Animal dolphin = new Dolphin(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animal.Aquatic.Frog:
			Animal frog = new Frog(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			frog.decodeFromXml(element);
			return frog;
		case Constants.Animal.Aquatic.Orca:
			Animal orca = new Orca(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			orca.decodeFromXml(element);
			return orca;
		case Constants.Animal.Insect.Butterfly:
			Animal butterfly = new Butterfly(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animal.Insect.Cockroach:
			Animal cockroach = new Cockroach(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animal.Insect.Spider:
			Animal spider = new Spider(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animal.Mammal.Cow:
			Animal cow = new Cow(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animal.Mammal.Monkey:
			Animal monkey = new Monkey(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animal.Mammal.Tiger:
			Animal tiger = new Tiger(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animal.Reptile.Chameleon:
			Animal chameleon = new Chameleon(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			chameleon.decodeFromXml(element);
			return chameleon;
		case Constants.Animal.Reptile.Cobra:
			Animal cobra = new Cobra(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			cobra.decodeFromXml(element);
			return cobra;
		case Constants.Animal.Reptile.Crocodile:
			Animal crocodile = new Crocodile(
					Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()),
					Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
			crocodile.decodeFromXml(element);
			return crocodile;
		default:
			break;

		}
		return null;
	}

	public static void addAnimal(Animal a, AnimalRepository aniRep, ArrayList<Animal> animal) {
		try {
			animal = aniRep.load();
			animal.add(a);
			aniRep.save(animal);
		} catch (Exception e) {

		}
	}
}
