package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.animalfactories.Constants;

public class Butterfly extends Insect{

	public Butterfly(){
		super(1, 0);
		setNrOfLegs(6);
		setName("Butterfly");
		setCanFly(true);
		setIsDangerous(false);
		setTakenCareOf(false);
	}
	public Butterfly(double maintananceCost, double dangerPerc, Integer legs, String n, boolean fly, boolean dangerous, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(legs);
		setName(n);
		setCanFly(fly);
		setIsDangerous(dangerous);
		setTakenCareOf(takeCare);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insect.Butterfly);
	}
	
	
	
}
