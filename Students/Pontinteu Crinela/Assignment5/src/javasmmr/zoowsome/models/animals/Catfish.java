package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Catfish extends Aquatic{
	
	public Catfish(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(0);
		setAvgSwimDepth(1000);
		setWaterType(TypesOfWater.freshwater);
			
	}
	
	public Catfish(String name, int nrLegs, int avgDepth, TypesOfWater waterType, double cost, double danger,
			boolean takenCareof ){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
	    setAvgSwimDepth(avgDepth);
	    setWaterType(waterType);
	    setTakenCareOf(takenCareof);
	  
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Catfish);
	}

}
