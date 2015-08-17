package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import javasmmr.zoowsome.services.factories.animals.Constants;

public class Cockroach extends Insect {
	
	public Cockroach(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(6);
		setCanFly (false);
		setIsDangerous(true);
	}
	
	public Cockroach(String name, int nrLegs, boolean canFly, boolean isDangerous,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly (canFly);
		setIsDangerous(isDangerous);
		setTakenCareOf(takenCareof);
		
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Insects.Cockroach);
	}


}
