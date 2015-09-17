package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {

	boolean canFly;
	boolean isDangerous;

	public Insect(double cost, double danger) {
		super(cost, danger);
	}

	public void setCanFly(boolean fly) {
		canFly = fly;
	}

	public boolean getCanFly() {
		return canFly;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.canFly));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}
	
	public void decodeFromXml(Element element) {
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
