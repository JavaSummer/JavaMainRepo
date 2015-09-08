package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
public class Spider extends Insect{
	 public Spider(double cost,double danger){
		 super(cost,danger);
		 setCanFly(false);
		 setIsDangerous(true);
		 setNrOfLegs(6);
		 setName("spider");
		 
	 }
	 public Spider(){
		 super(2,0.4);
		 setCanFly(false);
		 setIsDangerous(true);
		 setNrOfLegs(6);
		 setName("spider");
		 
	 }
	 
	 public Spider(int nrOfLegs,String name,double cost,double danger,boolean canFly,boolean isDangerous){
		 super(nrOfLegs,name,cost,danger,canFly,isDangerous);
	 }
	 
	 public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
			super.encodeToXml(eventWriter);
			createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
			Constants.Animals.Insects.Spider);
			}
}
