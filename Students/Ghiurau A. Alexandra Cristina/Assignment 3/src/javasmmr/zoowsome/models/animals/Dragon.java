package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

//import java.time.LocalTime;
import java.util.Calendar;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Dragon extends Reptile {

	public Dragon() {
		super(8, 1);
		setNrOfLegs(4);
		setName("Viserion");
		setLaysEggs(true);
	}

	public Dragon(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setLaysEggs(true);
	}

	public double getPredisposition() {

		Calendar calendar = Calendar.getInstance();
		int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY);
		// if(LocalTime.now() > 11 )
		if (hourOfDay > 23 || hourOfDay < 6) {
			return 0.2;
		} else
			return 0.4;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Dragon);
	}
}
