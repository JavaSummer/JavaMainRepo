package javasmmr.zoosome.models.animals;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

public abstract class Aquatic extends Animal {
	private static final int DEFAULT_AVG_SWIM_DEPTH = 0;
	private static final WaterType DEFAULT_WATER_TYPE = WaterType.getWater(0);

	private int avgSwimDepth;
	private WaterType waterType;

	protected Aquatic() {
		super();
		this.avgSwimDepth = DEFAULT_AVG_SWIM_DEPTH;
		this.waterType = DEFAULT_WATER_TYPE;
	}

	protected Aquatic(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final int swimDepth, final WaterType wType) {
		super(animalName, numberOfLegs, maintenanceCost, dangerPerc);
		this.avgSwimDepth = swimDepth;
		this.waterType = wType;
	}

	protected Aquatic(final String animalName, final int numberOfLegs, final double maintenanceCost,
			final double dangerPerc, final int swimDepth, final int waterCode) {
		this(animalName, numberOfLegs, maintenanceCost, dangerPerc, swimDepth, WaterType.getWater(waterCode));
	}

	public Aquatic(String[] values) {
		super(values[0], Integer.parseInt(values[1]), Double.parseDouble(values[2]), Double.parseDouble(values[3]));
		this.avgSwimDepth = Integer.parseInt(values[4]);
		this.waterType = WaterType.getWater(Integer.parseInt(values[5]));
	}

	public int getAvgSwimDepth() {
		return this.avgSwimDepth;
	}

	public void setAvgSwimDepth(final int swimDepth) {
		this.avgSwimDepth = swimDepth;
	}

	public WaterType getWaterType() {
		return this.waterType;
	}

	public void setWaterType(final WaterType wType) {
		this.waterType = wType;
	}

	public String[] getFields() {
		return new String[] { super.getName(), "" + super.getNoOfLegs(), "" + super.getMaintenanceCost(),
				"" + super.getDangerPerc(), "" + this.getAvgSwimDepth(), "" + this.getWaterType() };
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "avgSwimDepth", String.valueOf(this.getAvgSwimDepth()));
		createNode(eventWriter, "waterType", String.valueOf(this.getWaterType()));
	}

	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setAvgSwimDepth(Integer.valueOf(element.getElementsByTagName("avgSwimDepth").item(0).getTextContent()));
		setWaterType(WaterType.getWater(element.getElementsByTagName("waterType").item(0).getTextContent()));
	}
}
