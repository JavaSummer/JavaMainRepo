package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Chameleon extends Reptile {

	public Chameleon(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("chameleon");
		setLaysEggs(true);
	}

	public Chameleon() {
		super(4, 0.4);
		setNrOfLegs(4);
		setName("chameleon");
		setLaysEggs(true);
	}

	public Chameleon(int nrOfLegs, String name, double cost, double danger, boolean eggs) {
		super(nrOfLegs, name, cost, danger, eggs);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Chameleon);
	}
}
