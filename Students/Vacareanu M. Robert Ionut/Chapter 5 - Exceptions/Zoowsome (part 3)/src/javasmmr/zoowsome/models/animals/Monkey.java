package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Monkey extends Mammal {
	private static long counter;
	private final long id = counter++;

	public Monkey() {
		super(3, 0.25);
		setName("Monkey" + id);
		setNrOfLegs(2);
		setNormalBodyTemp(37);
		setPercBodyHair(0.99f);
	}

	public Monkey(String name) {
		super(3, 0.25);
		setName(name);
		setNrOfLegs(2);
		setNormalBodyTemp(37);
		setPercBodyHair(0.99f);
	}

	public Monkey(int legs, float bodyTemp, float bodyHair) {
		super(3, 0.25);
		setName("Monkey" + id);
		setNrOfLegs(legs);
		setNormalBodyTemp(bodyTemp);
		setPercBodyHair(bodyHair);
	}

	@Override
	public double getPredisposition() {

		Calendar date = GregorianCalendar.getInstance();
		if (date.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
			return 0.2;
		} else {
			return 0;
		}
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Monkey);
	}
}
