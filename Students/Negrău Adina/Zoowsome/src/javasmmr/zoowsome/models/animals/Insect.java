package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;


import org.w3c.dom.Element;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

public abstract class Insect extends Animal {
	private boolean canFly;
	private boolean isDangerous;
	
	Insect(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	public void setCanFly(boolean canFly){
		this.canFly = canFly;
	}
	public boolean getCanFly(){
		return canFly;
	}
	public void setIsDangerous(boolean isDangerous){
		this.isDangerous = isDangerous;
	}
	public boolean getIsDangerous(){
		return isDangerous;
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "canFly", String.valueOf(getCanFly()));
		createNode(eventWriter, "isDangerous", String.valueOf(getIsDangerous()));
	}
	
	public void decodeFromXml(Element element){
		setIsDangerous(Boolean.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
		setCanFly(Boolean.valueOf(element.getElementsByTagName("canFly").item(0).getTextContent()));
	}
	

}
