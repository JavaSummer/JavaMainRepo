package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

abstract public class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;

	public boolean getCanFly() {
		return canFly;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

	public void setIsDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}

	public Insect(int nrOfLegs, String name, double cost, double danger, boolean canFly, boolean isDangerous) {
		super(danger, cost);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Insect(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}

	public void decodeFromXml(Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}

}
