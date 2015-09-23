package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Bird extends Animal {

	//attributes
	private boolean migrates;
	private int avgFlightAltitude;
	

	public Bird(double maintenanceCost, double dangerPerc){
		super(maintenanceCost,dangerPerc);
	}
	
	//encoding to xml
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {  
			 
			 super.encodeToXml(eventWriter);  
			 createNode(eventWriter, "migrates", String.valueOf(getMigrates())); 
			 createNode(eventWriter, "avgFlightAltitude", String.valueOf(getAvgFlightAltitude()));  
	 } 
		 
	//decoding from xml
		public void decodeFromXml(Element element) { 
			 
			 setMigrates(Boolean.valueOf(element.getElementsByTagName("migrates").item(0).getTextContent())); 
			 setAvgFlightAltitude(Integer.valueOf(element.getElementsByTagName("avgFlightAltitude").item(0).getTextContent()));
	}		

	//getters and setters
	
	public boolean getMigrates(){
		return migrates;
	}
	
	public void setMigrates(boolean migrates){
		this.migrates = migrates;
	}
	
	public int getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(int avgFlightAltitude){
		this.avgFlightAltitude =  avgFlightAltitude;
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Bird ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Maintenance cost: "+super.maintenanceCost);
		System.out.println("Danger: "+(super.dangerPerc*100)+"%");
		System.out.println("Extra details:");
		System.out.println((getMigrates())?"It does migrate":"It does not migrate");
		System.out.println("It has an average flight altitude of "+getAvgFlightAltitude());
		System.out.println();
	}
	@Override
	public String toString() {
		
		//it's actually a html format :?
		String s ="Species: Bird <br>";
		s=s+"Name: "+getName()+"<br>";
		s=s+"Number of legs: "+getNrOfLegs()+"<br>";
		s=s+"Maintenance cost: "+super.maintenanceCost+"<br>";
		s=s+"Danger: "+(super.dangerPerc*100)+"%<br>";
		s=s+"Extra details:<br>";
		s=s+((getMigrates())?"It does migrate":"It does not migrate")+"<br>";
		s=s+"It has an average flight altitude of "+getAvgFlightAltitude()+"<br>";
		return s;
	}
	

}
