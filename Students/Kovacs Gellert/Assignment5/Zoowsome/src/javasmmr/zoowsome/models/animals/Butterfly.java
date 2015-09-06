package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

public class Butterfly extends Insect {
	public Butterfly(String name, int nrOfLegs, boolean canFly, boolean isDangerous, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setCanFly(canFly);
		this.setDangerous(isDangerous);
	}

	public Butterfly() {
		this.setName("Mr Butter");
		this.setNrOfLegs(6);
		this.setCanFly(true);
		this.setDangerous(false);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly);
	}
}
