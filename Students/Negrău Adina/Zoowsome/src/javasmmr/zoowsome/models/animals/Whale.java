package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.animalfactories.Constants;

public class Whale extends Aquatic{

	public Whale(){
		super(4, 0.1);
		setName("Whale");
		setNrOfLegs(0);
		setAvgSwimDepth(3000);
		setWaterType(waterType.freshwater);
		setTakenCareOf(false);
		}
	
	public Whale(double maintananceCost, double dangerPerc, String name, Integer nrLegs, Integer depth, waterType wt, boolean takeCare){
		super(maintananceCost, dangerPerc);
		setName(name);
		setNrOfLegs(nrLegs);
		setAvgSwimDepth(depth);
		setWaterType(wt);
		setTakenCareOf(takeCare);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatic.Whale);
	}
}
