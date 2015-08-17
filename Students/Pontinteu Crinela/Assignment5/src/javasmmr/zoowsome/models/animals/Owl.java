package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Owl extends Bird{

	public Owl(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(2);
		setMigrates(false);
		setAvgFlightAltitude(40);
			
	}

	public Owl(String name, int nrLegs, boolean migrates, int avgAltitude,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setMigrates(migrates);
	    setAvgFlightAltitude(avgAltitude);
	    setTakenCareOf(takenCareof);
		
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Birds.Owl);
	}

}
