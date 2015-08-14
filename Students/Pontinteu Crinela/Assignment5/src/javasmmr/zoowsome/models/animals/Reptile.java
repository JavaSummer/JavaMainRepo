package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.*;

import org.w3c.dom.Element;

abstract public class Reptile extends Animal {
	
	private boolean laysEggs;
	
	public Reptile(double cost, double danger) {
		super(cost, danger);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
		}
	
	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	
		}
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}
}
