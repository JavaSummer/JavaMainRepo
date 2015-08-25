package javasmmr.zoowsome.models.animals;

public abstract class Reptile extends Animal{
	private boolean laysEggs;
	
	Reptile(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	public boolean getLaysEggs(){
		return laysEggs;
	}
	public void setLaysEggs(boolean eggs){
		laysEggs = eggs;
	}

}
