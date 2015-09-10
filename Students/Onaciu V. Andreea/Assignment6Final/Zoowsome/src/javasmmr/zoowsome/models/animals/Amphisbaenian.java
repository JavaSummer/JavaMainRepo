package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Amphisbaenian extends Reptile {
	public Amphisbaenian(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("Amphisbaenian");
		setLaysEggs(true);
	}

	public Amphisbaenian() {
		super(4, 0.3);
		setNrOfLegs(4);
		setName("Amphisbaenian");
		setLaysEggs(true);
	}

	public Amphisbaenian(int nrOfLegs, String name, double cost, double danger, boolean eggs) {
		super(nrOfLegs, name, cost, danger, eggs);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Amphisbaenian);
	}
}
