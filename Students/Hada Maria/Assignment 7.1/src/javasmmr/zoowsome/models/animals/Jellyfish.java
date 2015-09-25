package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Jellyfish extends Aquatic {

	public Jellyfish(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Sting");
		setAvgSwimDepth(150);
		setIsDangerous(true);
	}

	public Jellyfish(String name, int swimDepth, double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setIsDangerous(true);
	}

	public double getPredisposition() {
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if ((dayOfWeek == 1) || (dayOfWeek == 4)) {
			return 0.25;
		}
		return 0;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Jellyfish);
	}
}
