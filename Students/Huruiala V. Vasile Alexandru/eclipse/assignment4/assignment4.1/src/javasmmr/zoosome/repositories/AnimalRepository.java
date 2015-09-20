package javasmmr.zoosome.repositories;

import org.w3c.dom.Element;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Ballista;
import javasmmr.zoosome.models.animals.Bass;
import javasmmr.zoosome.models.animals.Bear;
import javasmmr.zoosome.models.animals.Beetle;
import javasmmr.zoosome.models.animals.Clownfish;
import javasmmr.zoosome.models.animals.Crocodile;
import javasmmr.zoosome.models.animals.Dove;
import javasmmr.zoosome.models.animals.Dragon;
import javasmmr.zoosome.models.animals.Dragonfly;
import javasmmr.zoosome.models.animals.Eagle;
import javasmmr.zoosome.models.animals.Hummingbird;
import javasmmr.zoosome.models.animals.Kangaroo;
import javasmmr.zoosome.models.animals.Lionfish;
import javasmmr.zoosome.models.animals.Lizard;
import javasmmr.zoosome.models.animals.Mangonel;
import javasmmr.zoosome.models.animals.Mantis;
import javasmmr.zoosome.models.animals.Ostrich;
import javasmmr.zoosome.models.animals.Ram;
import javasmmr.zoosome.models.animals.Rhinoceros;
import javasmmr.zoosome.models.animals.Scorpion;
import javasmmr.zoosome.models.animals.Surgeonfish;
import javasmmr.zoosome.models.animals.Trebuchet;
import javasmmr.zoosome.models.animals.Turtle;
import javasmmr.zoosome.models.animals.Whale;
import javasmmr.zoosome.services.factories.Constants;

public class AnimalRepository extends EntityRepository<Animal> {
	private static final String XML_FILENAME = "Animals.xml";

	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	@Override
	protected Animal getEntityFormXMLElement(Element element) {
		String discriminant = element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();

		Animal a;
		switch (discriminant) {
		case Constants.Animals.Mammal.BEAR:
			a = new Bear();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Mammal.KANGAROO:
			a = new Kangaroo();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Mammal.WHALE:
			a = new Whale();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Mammal.RHINOCEROS:
			a = new Rhinoceros();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Reptile.LIZARD:
			a = new Lizard();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Reptile.TURTLE:
			a = new Turtle();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Reptile.CROCODILE:
			a = new Crocodile();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Reptile.DRAGON:
			a = new Dragon();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Bird.DOVE:
			a = new Dove();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Bird.OSTRICH:
			a = new Ostrich();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Bird.EAGLE:
			a = new Eagle();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Bird.HUMMINGBIRD:
			a = new Hummingbird();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Aquatic.BASS:
			a = new Bass();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Aquatic.CLOWNFISH:
			a = new Clownfish();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Aquatic.SURGEONFISH:
			a = new Surgeonfish();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Aquatic.LIONFISH:
			a = new Lionfish();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Insect.BEETLE:
			a = new Beetle();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Insect.SCORPION:
			a = new Scorpion();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Insect.MANTIS:
			a = new Mantis();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Insect.DRAGONFLY:
			a = new Dragonfly();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Siege.RAM:
			a = new Ram();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Siege.MANGONEL:
			a = new Mangonel();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Siege.BALLISTA:
			a = new Ballista();
			a.decodeFromXML(element);
			return a;

		case Constants.Animals.Siege.TREBUCHET:
			a = new Trebuchet();
			a.decodeFromXML(element);
			return a;

		default:
			break;
		}

		return null;
	}
}
