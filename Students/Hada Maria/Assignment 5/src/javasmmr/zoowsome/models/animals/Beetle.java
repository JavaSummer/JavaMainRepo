package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.animal.Constants;

public class Beetle extends Insect {

	public Beetle(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(6);
		setName("Heracross");
		setCanFly(true);
		setIsDangerous(false);
		
	}

	public Beetle(String name, boolean dangerous, boolean fly, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(6);
		setName(name);
		setCanFly(fly);
		setIsDangerous(dangerous);
	
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Beetle);
	}
}
