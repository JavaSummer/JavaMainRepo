package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.time.LocalTime;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.WaterType.water;
import javasmmr.zoowsome.services.factories.Constants;

public class Orca extends Aquatic {
	public Orca(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName("OrcaX");
		setNrOfLegs(0);
		setAvgSwimDepth(20);
		setWaterType(water.SALTWATER);
	}

	public Orca(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(0);
		setAvgSwimDepth(20);
		setWaterType(water.SALTWATER);

	}

	public double getPredisposition() {
		if (LocalTime.now().isAfter(LocalTime.of(12, 0)) && LocalTime.now().isBefore(LocalTime.of(22, 0))) {
			return 0.4;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animal.Aquatic.Orca);
	}
}
