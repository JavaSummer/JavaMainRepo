package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {

	int avgSwimDepth;
	boolean isDangerous;

	public Aquatic(double cost, double danger) {
		super(cost, danger);
	}

	public void setAvgSwimDepth(int depth) {
		avgSwimDepth = depth;
	}

	public int getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setIsDangerous(boolean dangerous) {
		isDangerous = dangerous;
	}

	public boolean getIsDangerous() {
		return isDangerous;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.avgSwimDepth));
		createNode(eventWriter, "isDangerous", String.valueOf(this.isDangerous));
	}

	public void decodeFromXml(Element element) {
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
