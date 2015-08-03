package javasmmr.zoowsome.models.animals;


public class MoonJellyfish extends Aquatics {

	public enum colourType {
		BLUE, RED, GREEN, GRAY, PINK
	}

	colourType colour;

	public MoonJellyfish() {
		setMammal(false);
		setNrOfLegs(16); 
		setName("Nigel");
		setAvgSwimDepth(20);
		setWt(waterType.FRESHWATER);
		setColour(colourType.BLUE);
	}

	public MoonJellyfish(String name, int swimDepth, waterType waterType, colourType colourT) {
		setMammal(false);
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
