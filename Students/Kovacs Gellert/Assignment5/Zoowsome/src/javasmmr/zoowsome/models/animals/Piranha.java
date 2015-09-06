package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Piranha extends Aquatic {
	public Piranha(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setAvgSwimDepth(avgSwimDepth);
		this.setWaterType(waterType);
	}
	
	public Piranha() {
		this.setName("Piri");
		this.setNrOfLegs(0);
		this.setAvgSwimDepth(5);
		this.setWaterType(WaterType.FRESHWATER);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Piranha);
	}
}
