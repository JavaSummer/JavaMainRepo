package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

import java.util.Calendar;

public class Shark extends Aquatic {
	
	public Shark(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(0);
		setAvgSwimDepth(2000);
		setWaterType(TypesOfWater.saltwater);
			
	}
	
	public Shark(String name, int nrLegs, int avgDepth, TypesOfWater waterType,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
	    setTakenCareOf(takenCareof);
		
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}

	
	@Override
	public double getPredisposition() {
		 Calendar calObj = Calendar.getInstance();
		 int month = calObj.get(Calendar.MONTH);
		 int hour = calObj.get(Calendar.HOUR_OF_DAY);
		 if ((month > 1)&& (month<4)){
			 if ((hour>=4)&&(hour<=7)){
				 return 0.5;
			 }else
				 return 0.3;
		 }
		 return 0.2;
		 
	}

}
