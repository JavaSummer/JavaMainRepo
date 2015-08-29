package javasmmr.zoowsome.models.animals;
import java.util.Date;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.services.animalfactories.*;
import javasmmr.zoowsome.services.animalfactories.Constants;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Boa extends Reptile{


	public Boa(){
		super(3, 0.7);
		setNrOfLegs(0);
		setName("Boa");
		setLaysEggs(true);
		setTakenCareOf(false);

	}
	
	public Boa(double maintananceCost, double dangerPerc, Integer nrLegs, String n, boolean eggs, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setNrOfLegs(nrLegs);
		setName(n);
		setLaysEggs(eggs);
		setTakenCareOf(takeCare);
	}
	
	/*public double getPredisposition(){
		 DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	     Date dateobj = new Date();
	     String n = df.format(dateobj);
	     int nr = Integer.parseInt(n);
	     if(nr > 14 && nr < 18){
	    	 return 0.25;
	    }
	     return 0;
	}
	*/
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptile.Boa);
	}
	
}
