package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Viper extends Reptile {

	public Viper(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Nagini");
		setLaysEggs(true);
	}

	public Viper(String name, boolean eggs, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setLaysEggs(eggs);
	}

	public double getPredisposition() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		if ((hourOfDay >= 15) && (hourOfDay <= 22)) {
			return 0.15;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Viper);
	}
}
