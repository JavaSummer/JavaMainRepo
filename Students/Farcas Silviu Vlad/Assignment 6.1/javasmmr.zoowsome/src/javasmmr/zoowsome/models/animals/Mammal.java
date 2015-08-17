package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.*;

public abstract class Mammal extends Animal {
	private float normalBodyTemp;
	private float percBodyHair;

	public void setNormalBodyTemp(float normalBodyTemp) {
		this.normalBodyTemp = normalBodyTemp;
	}

	public float getNormalBodyTemp() {
		return normalBodyTemp;
	}

	public void setPercBodyHair(float percBodyHair) {
		this.percBodyHair = percBodyHair;
	}

	public float getPercBodyHair() {
		return percBodyHair;
	}

	public Mammal(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
	}

	public void decodeFomXml(Element element) {
		super.decodeFromXml(element);
		setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
