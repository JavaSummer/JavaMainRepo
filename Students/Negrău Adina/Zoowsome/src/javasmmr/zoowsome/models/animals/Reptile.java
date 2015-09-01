package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import org.w3c.dom.Element;

public abstract class Reptile extends Animal{
	private boolean laysEggs;
	
	Reptile(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	public boolean getLaysEggs(){
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "laysEggs", String.valueOf(getLaysEggs()));
	}
	public void decodeFromXml(Element element){
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}
}
