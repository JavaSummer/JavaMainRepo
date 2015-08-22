package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class MoonJellyfish extends Aquatic {

	public enum colourType {
		BLUE, RED, GREEN, GRAY, PINK
	}

	colourType colour;

	public MoonJellyfish() {
		super(7, 0.3);
		setNrOfLegs(9);
		setName("Nigel");
		setAvgSwimDepth(21);
		setWt(waterType.FRESHWATER);
		setColour(colourType.BLUE);
	}

	public MoonJellyfish(String name, int swimDepth, waterType waterType, colourType colourT, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
		setColour(colourT); // or simply setColour(getCoulur()) ?
	}

	private void setColour(colourType colour) {
		this.colour = colour;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Aquatics.MoonJellyfish);
	}

}
