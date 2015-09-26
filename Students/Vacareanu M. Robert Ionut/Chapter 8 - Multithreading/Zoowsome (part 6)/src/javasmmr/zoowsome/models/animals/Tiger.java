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

public class Tiger extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Tiger(float normalBodyTemp, float percBodyHair, int nrOfLegs, String name, double maintenanceCost,
			double dangerPerc, boolean takenCareOf) {
		super(nrOfLegs, name, maintenanceCost, dangerPerc, takenCareOf, normalBodyTemp, percBodyHair);
	}

	// Keep the order from above;
	public Tiger(List<String> attributes) {
		super(Integer.valueOf(attributes.get(2)), attributes.get(3), Double.valueOf(attributes.get(4)),
				Double.valueOf(attributes.get(5)), Boolean.valueOf(attributes.get(6)), Float.valueOf(attributes.get(0)),
				Float.valueOf(attributes.get(1)));
	}

	public Tiger() {
		super(6, 0.85);
		setName("Tiger" + id);
		setNrOfLegs(4);
		setNormalBodyTemp(37.5f);
		setPercBodyHair(1);
	}

	public Tiger(String name) {
		super(6, 0.85);
		setName(name);
		setNrOfLegs(4);
		setNormalBodyTemp(37.5f);
		setPercBodyHair(1);
	}

	public Tiger(int legs, float bodyTemp, float bodyHair) {
		super(6, 0.85);
		setName("Tiger" + id);
		setNrOfLegs(legs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

	@Override
	public double getPredisposition() throws Exception {

		String timeInterval1 = "14:50:00";
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
			return 0.12;
		} else {
			return 0;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
}
