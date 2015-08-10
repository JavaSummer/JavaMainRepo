package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {

	float normalBodyTemperature;
	float percBodyHair;

	public Mammal(double cost, double danger) {
		super(cost, danger);
	}

	public void setNormalBodyTemperature(float temperature) {
		normalBodyTemperature = temperature;
	}

	public float getNormalBodyTemperature() {
		return normalBodyTemperature;
	}

	public void setPercBodyHair(float hairPerc) {
		percBodyHair = hairPerc;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemperature", String.valueOf(this.normalBodyTemperature));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.percBodyHair));
	}

	public void decodeFromXml(Element element) {
		setNormalBodyTemperature(Float.valueOf(element.getElementsByTagName("normalBodyTemperature").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
