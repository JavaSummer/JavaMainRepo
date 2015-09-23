package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	
	public Aquatic(double maintenanceCost, double dangerPerc){//do I need this?
		super(maintenanceCost,dangerPerc);
	}
	
	//attributes
	private Integer avgSwimDepth;
    private Water waterType;
    
    //encoding to xml
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
		 
		 super.encodeToXml(eventWriter);  
		 createNode(eventWriter, "avgSwimDepth", String.valueOf(getAvgSwimDepth())); 
		 createNode(eventWriter, "waterType", String.valueOf(getWaterType()));  
    } 
	 
	 //decoding from xml
	 public void decodeFromXml(Element element) {
		 
		 super.decodeFromXml(element);//should I put it here? :?
		 setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent())); 
		 //setWaterType(Water.valueOf(element.getElementsByTagName("isDangerous").item(0).getTextContent()));
	}

	 //setters and getters
	public Integer getAvgSwimDepth() {
		return avgSwimDepth;
	}

	public void setAvgSwimDepth(Integer avgSwimDepth) {
		this.avgSwimDepth = avgSwimDepth;
	}

	public Water getWaterType() {
		return waterType;
	}

	public void setWaterType(Water waterType) {
		this.waterType = waterType;
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Aquatic ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println("Its average swim depth is: "+getAvgSwimDepth());
		System.out.println("It lives in "+getWaterType());
		System.out.println();
	}

	@Override
	public String toString() {
		
		String s ="Species: Aquatic <br>";
		s=s+"Name: "+getName()+"<br>";
		s=s+"Number of legs: "+getNrOfLegs()+"<br>";
		s=s+"Maintenance cost: "+super.maintenanceCost+"<br>";
		s=s+"Danger: "+(super.dangerPerc*100)+"%<br>";
		s=s+"Extra details:<br>";
		s=s+"Its average swim depth is: "+getAvgSwimDepth()+"<br>";
		s=s+"It lives in "+getWaterType()+"<br>";
		return s;
	}

}
