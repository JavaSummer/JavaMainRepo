package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class Salmon extends Aquatic {

	public Salmon(int nrOfLegs, String name, double cost, double danger, int swimDepth, waterType type) {
		super(nrOfLegs, name, cost, danger, swimDepth, type);
	}

	public Salmon(double cost, double danger) {
		super(cost, danger);
		setNrOfLegs(0);
		setName("Salmon");
		setAvgSwimDepth(14);
		setWaterType(waterType.saltwater);
	}

	public Salmon() {
		super(0.5, 0);
		setNrOfLegs(0);
		setName("Salmon");
		setAvgSwimDepth(14);
		setWaterType(waterType.saltwater);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.Salmon);
	}
}
