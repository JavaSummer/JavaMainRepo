package javasmmr.zoosome.models.animals;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoosome.repositories.AnimalRepository.createNode;

public abstract class Reptile extends Animal {
	private static final boolean DEFAULT_LAYS_EGGS = false;
	
	private boolean laysEggs;
	
	protected Reptile() {
		super();
		this.laysEggs = DEFAULT_LAYS_EGGS;
	}
	
	protected Reptile(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final boolean hasEggs) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.laysEggs = hasEggs;
	}
	
	public boolean getLaysEggs() {
		return this.laysEggs;
	}
	
	public void setLaysEggs(final boolean hasEggs) {
		this.laysEggs = hasEggs;
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
