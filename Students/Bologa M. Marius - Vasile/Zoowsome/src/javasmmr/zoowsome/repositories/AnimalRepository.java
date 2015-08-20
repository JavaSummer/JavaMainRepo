package javasmmr.zoowsome.repositories;

import org.w3c.dom.Element;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.services.factories.animal.Constants;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AnimalRepository extends EntityRepository<Animal> {
	/**
	 * 
	 */
	private static final String XML_FILENAME = "Animals.xml";

	/**
	 * 
	 */
	public AnimalRepository() {
		super(XML_FILENAME, Constants.XML_TAGS.ANIMAL);
	}

	/**
	 * @param element
	 *            Type of the animal.
	 * @return The animals to be created.
	 */
	protected final Animal getEntityFromXmlElement(final Element element) {
		String discriminant = element.getElementsByTagName(
				Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
		switch (discriminant) {
		case Constants.Animals.Insects.Butterfly:
			Animal butterfly = new Butterfly(4.0, 0.0);
			butterfly.decodeFromXml(element);
			return butterfly;
		case Constants.Animals.Insects.Cockroach:
			Animal cockroach = new Cockroach(0.2, 0.43);
			cockroach.decodeFromXml(element);
			return cockroach;
		case Constants.Animals.Insects.Spider:
			Animal spider = new Spider(1.9, 0.65);
			spider.decodeFromXml(element);
			return spider;
		case Constants.Animals.Mammals.Tiger:
			Animal tiger = new Tiger(4.5, 0.957);
			tiger.decodeFromXml(element);
			return tiger;
		case Constants.Animals.Mammals.Cow:
			Animal cow = new Cow(5.6, 0.32);
			cow.decodeFromXml(element);
			return cow;
		case Constants.Animals.Mammals.Monkey:
			Animal monkey = new Monkey(2.9, 0.174);
			monkey.decodeFromXml(element);
			return monkey;
		case Constants.Animals.Aquatic.NorthernPike:
			Animal northernPike = new NorthernPike(2.3, 0.15);
			northernPike.decodeFromXml(element);
			return northernPike;
		case Constants.Animals.Aquatic.Shark:
			Animal shark = new Shark(7.1, 0.97);
			shark.decodeFromXml(element);
			return shark;
		case Constants.Animals.Aquatic.Tuna:
			Animal tuna = new Tuna(4.3, 0.10);
			tuna.decodeFromXml(element);
			return tuna;
		case Constants.Animals.Birds.Eagle:
			Animal eagle = new Eagle(2.3, 0.42);
			eagle.decodeFromXml(element);
			return eagle;
		case Constants.Animals.Birds.Pelican:
			Animal pelican = new Pelican(2.3, 0.103);
			pelican.decodeFromXml(element);
			return pelican;
		case Constants.Animals.Birds.WhiteStork:
			Animal whiteStork = new WhiteStork(4.0, 0.205);
			whiteStork.decodeFromXml(element);
			return whiteStork;
		case Constants.Animals.Reptiles.Tuatara:
			Animal tuatara = new Tuatara(3.8, 0.22);
			tuatara.decodeFromXml(element);
			return tuatara;
		case Constants.Animals.Reptiles.Turtle:
			Animal turtle = new Turtle(5.2, 0.02);
			turtle.decodeFromXml(element);
			return turtle;
		case Constants.Animals.Reptiles.Boomslang:
			Animal boomslang = new Boomslang(6.4, 0.999);
			boomslang.decodeFromXml(element);
			return boomslang;
		default:
			break;
		}
		return null;
	}

}