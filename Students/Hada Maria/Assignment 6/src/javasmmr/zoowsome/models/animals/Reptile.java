package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {

	boolean laysEggs;

	public Reptile(double cost, double danger) {
		super(cost, danger);
	}

	public void setLaysEggs(boolean eggs) {
		laysEggs = eggs;
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.laysEggs));
	}
	
	public void decodeFromXml(Element element) {
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
