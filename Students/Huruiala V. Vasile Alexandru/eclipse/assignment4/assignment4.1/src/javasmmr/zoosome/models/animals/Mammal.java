package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Mammal extends Animal {
	private static final double DEFAULT_NORMAL_BODY_TEMPERATURE = 0.0D;
	private static final double DEFAULT_PERCENTAGE_BODY_HAIR = 0.0D;

	private double normalBodyTemp;
	private double percBodyHair;

	protected Mammal() {
		super();
		this.normalBodyTemp = DEFAULT_NORMAL_BODY_TEMPERATURE;
		this.percBodyHair = DEFAULT_PERCENTAGE_BODY_HAIR;
	}

	protected Mammal(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final double normalTemp, final double muchHair) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.normalBodyTemp = normalTemp;
		this.percBodyHair = muchHair;
	}

	public Mammal(String[] values) {
		super(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]));
		this.normalBodyTemp = Double.parseDouble(values[4]);
		this.percBodyHair = Double.parseDouble(values[5]);
	}

	public double getNormalBodyTemp() {
		return this.normalBodyTemp;
	}

	public void setNormalBodyTemp(final double normalTemp) {
		this.normalBodyTemp = normalTemp;
	}

	public double getPercBodyHair() {
		return this.percBodyHair;
	}

	public void setPercBodyHair(final double muchHair) {
		this.percBodyHair = muchHair;
	}

	public String[] getFields() {
		return new String[] { super.getName(), "" + super.getNoOfLegs(), "" + super.getMaintenanceCost(),
				"" + super.getDangerPerc(), "" + this.getNormalBodyTemp(), "" + this.getPercBodyHair() };
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "normalBodyTemp", String.valueOf(this.getNormalBodyTemp()));
		createNode(eventWriter, "percBodyHair", String.valueOf(this.getPercBodyHair()));
	}

	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setNormalBodyTemp(Double.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		setPercBodyHair(Double.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	}
}
