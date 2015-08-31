package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;

public class Albatross extends Bird {

	public Albatross(){
		super(2,0.1);
		setNrOfLegs(2);
		setName("albatross");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	public Albatross(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(2);
		setName("albatross");
		setMigrates(true);
		setAvgFlightAltitude(100);
	}
	public Albatross(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,cost,danger,flightAltitude,migrates);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.Albatross);
		}
}
