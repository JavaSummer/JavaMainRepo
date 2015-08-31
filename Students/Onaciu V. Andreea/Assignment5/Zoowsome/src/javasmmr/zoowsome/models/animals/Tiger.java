package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
public class Tiger extends Mammal{

	public Tiger(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("tiger");
		setPercBodyHair(98);
		setNormalBodyTemp(37);
		
	}
	public Tiger(){
		super(4,0.7);
		setNrOfLegs(4);
		setName("tiger");
		setPercBodyHair(98);
		setNormalBodyTemp(37);
		
	}
	public Tiger(int nrOfLegs,String name,double cost,double danger,float bodyTemp,float bodyHair){
		super( nrOfLegs, name, cost,danger,bodyTemp, bodyHair);
	}
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Mammals.Tiger);
		}
}
