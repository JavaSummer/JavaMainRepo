package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Reptile extends Animal {
	private boolean laysEggs;

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean eggs) {
		this.laysEggs = eggs;
	}

	public Reptile(int nrOfLegs, String name, double cost, double danger, boolean eggs) {
		super(cost, danger);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(eggs);
	}

	public Reptile(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
	}

	public void decodeFromXml(Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));

	}
}
