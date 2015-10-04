package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Reptile extends Animal {
	private static final boolean DEFAULT_LAYS_EGGS = false;

	private boolean laysEggs;

	protected Reptile() {
		super();
		this.laysEggs = DEFAULT_LAYS_EGGS;
	}

	protected Reptile(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.laysEggs = hasEggs;
	}

	public Reptile(String[] values) {
		super(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]));
		this.laysEggs = Boolean.parseBoolean(values[4]);
	}

	public boolean getLaysEggs() {
		return this.laysEggs;
	}

	public void setLaysEggs(final boolean hasEggs) {
		this.laysEggs = hasEggs;
	}

	public String[] getFields() {
		return new String[] { super.getName(), "" + super.getNoOfLegs(), "" + super.getMaintenanceCost(),
				"" + super.getDangerPerc(), "" + this.getLaysEggs() };
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(this.getLaysEggs()));
	}

	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
