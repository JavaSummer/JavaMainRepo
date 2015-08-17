package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.time.LocalTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {
	public Spider(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("SpiderX");
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}

	public Spider(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}

	public double getPredisposition() {
		if (LocalTime.now().isAfter(LocalTime.of(23, 0)) && LocalTime.now().isBefore(LocalTime.of(6, 0))) {
			return 0.25;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Insect.Spider);
	}
}
