package javasmmr.zoowsome.repositories;


import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.services.factories.Constants;

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
		case Constants.Animals.Insects.Scarabeus:
			Animal scarabeus = new Scarabeus();
			scarabeus.decodeFromXml(element);
			return scarabeus;
		case Constants.Animals.Birds.Eagle:
			Animal eagle = new Eagle();
			eagle.decodeFromXml(element);
			return eagle;
		case Constants.Animals.Birds.Mockingjay:
			Animal mockingjay = new Mockingjay();
			mockingjay.decodeFromXml(element);
			return mockingjay;
		case Constants.Animals.Birds.Pigeon:
			Animal pigeon = new Pigeon();
			pigeon.decodeFromXml(element);
			return pigeon;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow();
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger();
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Mammals.Wolf:
			Animal wolf = new Wolf();
			wolf.decodeFromXml(element);
			return wolf;
		case Constants.Animals.Reptiles.Crocodile:
			Animal crocodile = new Crocodile();
			crocodile.decodeFromXml(element);
			return crocodile;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle();
			turtle.decodeFromXml(element);
			return turtle;
		case Constants.Animals.Reptiles.Lizard:
			Animal lizard = new Lizard();
			lizard.decodeFromXml(element);
			return lizard;
		case Constants.Animals.Aquatics.Dolphin:
			Animal dolphin = new Dolphin();
			dolphin.decodeFromXml(element);
			return dolphin;
		case Constants.Animals.Aquatics.Piranha:
			Animal piranha = new Piranha();
			piranha.decodeFromXml(element);
			return piranha;
		case Constants.Animals.Aquatics.Sardine:
			Animal sardine = new Sardine();
			sardine.decodeFromXml(element);
			return sardine;
		default:
			break;
		}
		return null;
	}
}
