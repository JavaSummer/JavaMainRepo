package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Monkey extends Mammal {
	public Monkey(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(4);
		setName("monkey");
		setPercBodyHair(99);
		setNormalBodyTemp(37);

	}

	public Monkey() {
		super(6.1, 0.4);
		setNrOfLegs(4);
		setName("monkey");
		setPercBodyHair(99);
		setNormalBodyTemp(37);

	}

	public Monkey(int nrOfLegs, String name, double cost, double danger, float bodyTemp, float bodyHair) {
		super(nrOfLegs, name, cost, danger, bodyTemp, bodyHair);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
	}
}
