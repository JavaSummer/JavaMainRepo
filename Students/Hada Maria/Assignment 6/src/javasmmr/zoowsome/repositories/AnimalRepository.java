package javasmmr.zoowsome.repositories;

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
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly(2.0, 0.0);
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.Bee:
			Animal bee = new Bee(3.0, 0.6);
			bee.decodeFromXml(element);
			return bee;
		case Constants.Animals.Insects.Beetle:
			Animal beetle = new Beetle(2.0, 0.0);
			beetle.decodeFromXml(element);
			return beetle;
		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin(6.0, 0.25);
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Aquatics.Jellyfish:
			Animal jellyfish = new Jellyfish(3.0, 1.0);
			jellyfish.decodeFromXml(element);
			return jellyfish;
		case Constants.Animals.Aquatics.Swordfish:
			Animal swordfish = new Swordfish(4.0, 0.75);
			swordfish.decodeFromXml(element);
			return swordfish;
		case Constants.Animals.Birds.Flamingo:
			Animal flamingo = new Flamingo(4.0, 0.1);
			flamingo.decodeFromXml(element);
			return flamingo;
		case Constants.Animals.Birds.Hummingbird:
			Animal hummingbird = new Hummingbird(4.0, 0.0);
			hummingbird.decodeFromXml(element);
			return hummingbird;
		case Constants.Animals.Birds.Owl:
			Animal owl = new Owl(4.0, 0.0);
			owl.decodeFromXml(element);
			return owl;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow(5.0, 0.0);
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey(6.0, 0.2);
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger(7.0, 0.85);
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Reptiles.Iguana:
			Animal iguana = new Iguana(3.0, 0.1);
			iguana.decodeFromXml(element);
			return iguana;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle(5.0, 0.0);
			turtle.decodeFromXml(element);
			return turtle;
		case Constants.Animals.Reptiles.Viper:
			Animal viper = new Viper(3.0, 1.0);
			viper.decodeFromXml(element);
			return viper;

		default:
			break;
		}
		return null;

	}
}
