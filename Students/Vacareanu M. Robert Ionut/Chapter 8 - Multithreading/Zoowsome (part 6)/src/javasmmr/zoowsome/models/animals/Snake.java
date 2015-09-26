package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Snake extends Reptile {
	private static long counter;
	private final long id = counter++;

	public Snake(Boolean layEggs, int nrOfLegs, String name, double maintenanceCost, double dangerPerc,
			boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, layEggs);
	}

	// Keep the order from above;
	public Snake(List<String> attributes) {
		super(Integer.valueOf(attributes.get(1)), attributes.get(2), Double.valueOf(attributes.get(3)),
				Double.valueOf(attributes.get(4)), Boolean.valueOf(attributes.get(5)),
				Boolean.valueOf(attributes.get(0)));
	}

	public Snake() {
		super(2.5, 0.45);
		setName("Snake" + id);
		setNrOfLegs(0);
		setLayEggs(true);
	}

	public Snake(String name) {
		super(2.5, 0.45);
		setName(name);
		setNrOfLegs(0);
		setLayEggs(true);
	}

	public Snake(int legs, Boolean eggs) {
		super(2.5, 0.45);
		setName("Snake" + id);
		setNrOfLegs(legs);
		setLayEggs(eggs);
	}

	@Override
	public double getPredisposition() throws Exception {

		String timeInterval1 = "13:00:00";
		Date time1 = new SimpleDateFormat("HH:mm:ss").parse(timeInterval1);
		Calendar calendar1 = GregorianCalendar.getInstance();
		calendar1.setTime(time1);

		String timeInterval2 = "15:00:00";
		Date time2 = new SimpleDateFormat("HH:mm:ss").parse(timeInterval2);
		Calendar calendar2 = GregorianCalendar.getInstance();
		calendar1.setTime(time2);

		Calendar currentDate = GregorianCalendar.getInstance();

		if (currentDate.get(Calendar.HOUR_OF_DAY) > calendar1.get(Calendar.HOUR_OF_DAY)
				&& currentDate.get(Calendar.HOUR_OF_DAY) < calendar2.get(Calendar.HOUR_OF_DAY)) {
			return 0.1;
		} else {
			return 0;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Snake);
	}
}
