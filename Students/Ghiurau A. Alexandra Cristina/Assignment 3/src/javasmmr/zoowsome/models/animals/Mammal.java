package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {
	public Mammal(double dangerPerc, double maintenanceCost) {
		super(dangerPerc, maintenanceCost);
		// TODO Auto-generated constructor stub
	}

	float normalBodyTemp;
	float percbodyHair;

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getPercBodyTemp() {
		return percbodyHair;
	}

	public void setPercBodyTemp(float percBodyTemp) {
		this.percbodyHair = percBodyTemp;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percbodyHair", String.valueOf(getPercBodyTemp()));
	}

	public void decodeFromXml(Element element) {
		//super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyTemp(Float.valueOf(element.getElementsByTagName("percbodyHair").item(0).getTextContent()));
	}
}
