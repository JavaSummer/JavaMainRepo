package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;
abstract public class Mammal extends Animal {
	 private float normalBodyTemp;
	 private float percBodyHair;
	 
	 public float getNormalBodyTemp(){
		 return normalBodyTemp;
	 }
	 
	 public float getPercBodyHair(){
		 return percBodyHair;
	 }
	 
	 public void setNormalBodyTemp(float bodyTemp){
		 this.normalBodyTemp=bodyTemp;
	 }
	 
	 public void setPercBodyHair(float bodyHair){
		 this.percBodyHair=bodyHair;
	 }
	 
	 public Mammal(int nrOfLegs,String name,double cost,double danger,float bodyTemp,float bodyHair){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setNormalBodyTemp(bodyTemp);
		 setPercBodyHair(bodyHair);
	 }
	 public Mammal(double cost,double danger){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setNormalBodyTemp(normalBodyTemp);
		 setPercBodyHair(percBodyHair);	
	 }
	 
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		 super.encodeToXml(eventWriter);
		 createNode(eventWriter, "normalBodyTemp", String.valueOf(getNormalBodyTemp()));
		 createNode(eventWriter, "percBodyHair", String.valueOf(getPercBodyHair()));
		 }
	 public void decodeFromXml(Element element) {
	     setNormalBodyTemp(Float.valueOf(element.getElementsByTagName("normalBodyTemp").item(0).getTextContent()));
		 setPercBodyHair(Float.valueOf(element.getElementsByTagName("percBodyHair").item(0).getTextContent()));
	 }
}
