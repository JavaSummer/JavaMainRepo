package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
public class Penguin extends Bird {
	public Penguin(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(2);
		setName("penguin");
		setMigrates(true);
		setAvgFlightAltitude(14);
	}
	public Penguin(){
		super(3.2,0.15);
		setNrOfLegs(2);
		setName("penguin");
		setMigrates(true);
		setAvgFlightAltitude(14);
	}
	public Penguin(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		super(nrOfLegs,name,cost,danger,flightAltitude,migrates);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Birds.Penguin);
		}
}
