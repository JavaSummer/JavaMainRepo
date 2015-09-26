package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {
	private static long counter;
	private final long id = counter++;

	public Spider(Boolean canFly, Boolean isDangerous, int nrOfLegs, String name, double maintenanceCost,
			double dangerPerc, boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, canFly, isDangerous);
	}

	// Keep the order from above;
	public Spider(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)),
				Boolean.valueOf(attributes.get(0)), Boolean.valueOf(attributes.get(1)));
	}

	public Spider() {
		super(1, 0.15);
		setName("Spider" + id);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}

	public Spider(String name) {
		super(1, 0.15);
		setName(name);
		setNrOfLegs(8);
		setCanFly(false);
		setIsDangerous(true);
	}

	public Spider(int legs, Boolean fly, Boolean dangerous) {
		super(1, 0.15);
		setName("Spider" + id);
		setNrOfLegs(legs);
		setCanFly(fly);
		setIsDangerous(dangerous);
	}

	@Override
	public double getPredisposition() throws Exception {

		Calendar date = GregorianCalendar.getInstance();
		if (date.get(Calendar.DAY_OF_WEEK) == Calendar.MONDAY) {
			return 0.3;
		} else {
			return 0;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider);
	}
}
