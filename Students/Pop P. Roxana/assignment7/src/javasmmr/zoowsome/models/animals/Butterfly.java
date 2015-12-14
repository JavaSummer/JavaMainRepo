package javasmmr.zoowsome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javasmmr.zoowsome.services.factories.Constants;

public class Butterfly extends Insect {

	
	public Butterfly(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous, double maintenanceCost, double dangerPerc) {

		super( maintenanceCost, dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}
	
	public Butterfly() {
		this(new Integer(16), "butterfly",true, false, 2,0);
	}

	//for assignment5: writing to xml
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException  { 
		super.encodeToXml(eventWriter);  
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Butterfly); 
	}
}

