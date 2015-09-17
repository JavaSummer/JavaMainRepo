package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {

	public Tiger(double cost, double danger) {
		super(cost, danger);
		setNormalBodyTemperature(37);
		setPercBodyHair(90);
		setNrOfLegs(4);
		setName("Wally");
	}

	public Tiger(String name, double cost, double danger) {
		super(cost, danger);
		setNormalBodyTemperature(37);
		setPercBodyHair(90);
		setNrOfLegs(4);
		setName(name);
	}

	public double getPredisposition() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		if ((dayOfMonth >= 10) && (dayOfMonth <= 17)) {
			return 0.30;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
}
