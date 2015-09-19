package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Cockroach extends Insect {
	public Cockroach(double cost, double danger) {
		super(cost, danger);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName("cockroach");

	}

	public Cockroach() {
		super(3.2, 0.1);
		setCanFly(true);
		setIsDangerous(false);
		setNrOfLegs(6);
		setName("cockroach");

	}

	public Cockroach(int nrOfLegs, String name, double cost, double danger, boolean canFly, boolean isDangerous) {
		super(nrOfLegs, name, cost, danger, canFly, isDangerous);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}
}
