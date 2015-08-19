package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
public class Tuataras extends Reptile{
	public Tuataras(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(4);
		setName("tuataras");
		setLaysEggs(true);
	}
	public Tuataras(){
		super(5,0.7);
		setNrOfLegs(4);
		setName("tuataras");
		setLaysEggs(true);
	}
	public Tuataras(int nrOfLegs,String name,double cost,double danger,boolean eggs){
		super( nrOfLegs, name,cost,danger, eggs);
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Reptiles.Tuataras);
		}
}
