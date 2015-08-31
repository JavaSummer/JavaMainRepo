package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

//The secret 6th class the pdf doesn't tell you about
public abstract class Siege extends Animal {
	private static final int DEFAULT_RANGE = 0;
	private static final boolean DEFAULT_IS_MOBILE = false;
	
	private int range;
	private boolean isMobile;
	
	protected Siege() {
		super();
		this.range = DEFAULT_RANGE;
		this.isMobile = DEFAULT_IS_MOBILE;
	}
	
	protected Siege(final String animalName, final int numberOfLegs, final double maintenanceCost, final double dangerPerc, final int firingRange, final boolean mobile) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.range = firingRange;
		this.isMobile = mobile;
	}
	
	public int getRange() {
		return this.range;
	}
	
	public void setRange(final int firingRange) {
		this.range = firingRange;
	}
	
	public boolean getIsMobile() {
		return this.isMobile;
	}
	
	public void setIsMobile(final boolean mobile) {
		this.isMobile = mobile;
	}
	
	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "range", String.valueOf(this.getRange()));
		createNode(eventWriter, "isMobile", String.valueOf(this.getIsMobile()));
	}
	

	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setRange(Integer.valueOf(element.getElementsByTagName("range").item(0).getTextContent()));
		setIsMobile(Boolean.valueOf(element.getElementsByTagName("isMobile").item(0).getTextContent()));
	}
}
