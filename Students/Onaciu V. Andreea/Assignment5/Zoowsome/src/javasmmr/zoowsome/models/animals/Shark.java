package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class Shark extends Aquatic {
	public Shark(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(waterType.freshwater);
	}

	public Shark() {
		super(4, 0.7);
		setNrOfLegs(0);
		setName("Shark");
		setAvgSwimDepth(2000);
		setWaterType(waterType.freshwater);
	}

	public Shark(int nrOfLegs, String name, double cost, double danger, int swimDepth, waterType type) {
		super(nrOfLegs, name, cost, danger, swimDepth, type);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Shark);
	}
}
