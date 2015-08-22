package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Nightingale extends Bird {

	public Nightingale() {
		super(7.5, 0.5);
		setName("Zazu"); // ..from Lion King
		setNrOfLegs(2);
		setAvgFlightAltitude(100);
		setMigrates(true);
	}

	public Nightingale(String name, int avgFlightAltit, boolean migrates, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setName(name);
		setNrOfLegs(2);
		setAvgFlightAltitude(avgFlightAltit);
		setMigrates(migrates);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Nightingale);
	}
}
