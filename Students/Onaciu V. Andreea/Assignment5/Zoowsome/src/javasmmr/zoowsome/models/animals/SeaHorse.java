package javasmmr.zoowsome.models.animals;
import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;
import javasmmr.zoowsome.Constants;
import javasmmr.zoowsome.models.animals.WaterType.waterType;

public class SeaHorse extends Aquatic{
	public SeaHorse(double cost,double danger){
		super(cost,danger);
		setNrOfLegs(0);
		setName("SeaHorse");
		setAvgSwimDepth(73);
		setWaterType(WaterType.waterType.freshwater);
	}
	public SeaHorse(){
		super(3,0.1);
		setNrOfLegs(0);
		setName("SeaHorse");
		setAvgSwimDepth(73);
		setWaterType(WaterType.waterType.freshwater);
	}
	public SeaHorse(int nrOfLegs,String name,double cost,double danger,int swimDepth,waterType type){
		 super(nrOfLegs, name,cost,danger, swimDepth, type);
	 }
	 
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT,
		Constants.Animals.Aquatics.SeaHorse);
		}
}
