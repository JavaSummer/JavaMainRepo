package javasmmr.zoowsome.models.animals;

abstract public class Reptile extends Animal {

	private boolean laysEggs;
	
	public boolean getLaysEggs(){
		return laysEggs;
	}
	public void setLaysEggs(boolean laysEggs){
		this.laysEggs = laysEggs;
	}
}
