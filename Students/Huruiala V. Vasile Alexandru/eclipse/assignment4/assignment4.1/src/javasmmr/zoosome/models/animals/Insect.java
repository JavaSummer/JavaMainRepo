package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Insect extends Animal {
	private static final boolean DEFAULT_CAN_FLY = false;
	private static final boolean DEFAULT_IS_DANGEROUS = false;

	private boolean canFly;
	private boolean isDangerous;

	protected Insect() {
		super();
		this.canFly = DEFAULT_CAN_FLY;
		this.isDangerous = DEFAULT_IS_DANGEROUS;
	}

	protected Insect(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final boolean flyer, final boolean dangerous) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.canFly = flyer;
		this.isDangerous = dangerous;
	}

	public Insect(String[] values) {
		super(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]));
		this.canFly = Boolean.parseBoolean(values[4]);
		this.isDangerous = Boolean.parseBoolean(values[5]);
	}

	public boolean getCanFly() {
		return this.canFly;
	}

	public void setCanFly(final boolean flyer) {
		this.canFly = flyer;
	}

	public boolean getIsDangerous() {
		return this.isDangerous;
	}

	public void setIsDangerous(final boolean dangerous) {
		this.isDangerous = dangerous;
	}

	public String[] getFields() {
		return new String[] { super.getName(), "" + super.getNoOfLegs(), "" + super.getMaintenanceCost(),
				"" + super.getDangerPerc(), "" + this.getCanFly(), "" + this.getIsDangerous() };
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(this.getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(this.getIsDangerous()));
	}

	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}
}
