package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.time.LocalTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodile extends Reptile {
	public Crocodile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("CrocodileX");
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public Crocodile(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(4);
		setLaysEggs(true);
	}

	public double getPredisposition() {
		if (LocalTime.now().isAfter(LocalTime.of(8, 30)) && LocalTime.now().isBefore(LocalTime.of(11, 30))) {
			return 0.25;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Reptile.Crocodile);
	}
}
