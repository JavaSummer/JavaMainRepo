package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Spider extends Insect {

	public Spider(Integer nrOfLegs, String name, boolean canFly, boolean isDangerous,double maintenanceCost, double dangerPerc) {

		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Spider() {
		this(new Integer(16), "spider",false, true,5,0.7);
	}
	
	public double getPredisposition(){
		
		DateAndTime time = new DateAndTime();
	
		if (time.getHour()>23||time.getHour()<6){
			
			return 0.25;
			
		}
		else{
			
			return 0;
		}
	
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException  { 
		super.encodeToXml(eventWriter);  
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Spider); 
	} 

}


