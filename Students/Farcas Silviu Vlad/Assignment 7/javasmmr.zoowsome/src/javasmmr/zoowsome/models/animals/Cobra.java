package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.time.LocalTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Cobra extends Reptile {
	public Cobra(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("CobraX");
		setNrOfLegs(0);
		setLaysEggs(true);
	}

	public Cobra(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(0);
		setLaysEggs(true);
	}

	public double getPredisposition() {
		if (LocalTime.now().isAfter(LocalTime.of(2, 0)) && LocalTime.now().isBefore(LocalTime.of(22, 0))) {
			return 0.2;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Reptile.Cobra);
	}
}
