package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
public class Cow extends Mammal{
	public Cow(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("cow");
		setPercBodyHair(97);
		setNormalBodyTemp(38);
		
	}
	public Cow(){
		super(6,0.2);
		setNrOfLegs(4);
		setName("cow");
		setPercBodyHair(97);
		setNormalBodyTemp(38);
		
	}
	public Cow(int nrOfLegs,String name,double cost,double danger,float bodyTemp,float bodyHair){
		super(nrOfLegs, name,cost,danger, bodyTemp, bodyHair);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Mammals.Cow);
		}
}
