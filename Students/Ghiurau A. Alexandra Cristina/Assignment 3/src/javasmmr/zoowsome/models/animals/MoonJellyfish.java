package javasmmr.zoowsome.models.animals;

public class MoonJellyfish extends Aquatic {

	public enum colourType {
		BLUE, RED, GREEN, GRAY, PINK
	}

	colourType colour;

	public MoonJellyfish() {
		super(7.5, 0.5);
		setNrOfLegs(16);
		setName("Nigel");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
		setColour(colourType.BLUE);
	}

	public MoonJellyfish(String name, int swimDepth, waterType waterType, colourType colourT, double maintenanceCost,
			double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setName(name);
		setAvgSwimDepth(swimDepth);
		setWt(waterType);
		setColour(colourT); // or simply setColour(getCoulur()) ?
	}

	private colourType getCoulur() {
		return colour;
	}

	private void setColour(colourType colour) {
		this.colour = colour;
	}

}
