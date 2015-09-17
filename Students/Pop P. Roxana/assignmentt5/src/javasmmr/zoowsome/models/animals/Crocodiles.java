package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Crocodiles extends Reptile {

	public Crocodiles(Integer nrOfLegs, String name, boolean laysEggs, double maintenanceCost, double dangerPerc) {

		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Crocodiles() {
		this(new Integer(4), "croco ",true, 5, 0.70);
	}
	
    public double getPredisposition(){
		
		DateAndTime time = new DateAndTime();
		double predisposition = 0;
	
		if (time.getHour()>8||time.getHour()<20){
			
			predisposition =  0.10;
		
		}	
		if (time.getMonth()>4&&time.getMonth()<8){//between May and September
			
			predisposition+=0.15;
		}
		return predisposition;
	}
    
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException  { 
		super.encodeToXml(eventWriter);  
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Crocodiles); 
	} 
}

