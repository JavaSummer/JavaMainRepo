package javasmmr.zoowsome.models.animals;

public abstract class Animal {
	
	private Integer nrOfLegs;
	private String name;
	
	public Integer getNrOfLegs(){
		return nrOfLegs;
	}
	
	public void setNrOfLegs(Integer nrOfLegs){
		this.nrOfLegs = new Integer(nrOfLegs);//still don't quite get it ... int and Integer
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String s){
		name = new String(s);
	}
	
	public abstract void getAnimalAttributes();
}
