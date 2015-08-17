package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

import java.util.Calendar;

public class Snake extends Reptile {
	
	public Snake(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(0);
		setLaysEggs(true);
			
	}
	
	public Snake(String name, int nrLegs, boolean laysEggs,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
		setTakenCareOf(takenCareof);
	
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Reptiles.Snake);
	}
	
	@Override
	public double getPredisposition() {
		 Calendar calObj = Calendar.getInstance();
		 int month = calObj.get(Calendar.MONTH);
		 int hour = calObj.get(Calendar.HOUR_OF_DAY);
		 if ((month > 14)&& (month<19)){
			 if ((hour>=19)&&(hour<=21)){
				 return 0.7;
			 }else
				 return 0.4;
		 }
		 return 0.3;
		 
	}


}
