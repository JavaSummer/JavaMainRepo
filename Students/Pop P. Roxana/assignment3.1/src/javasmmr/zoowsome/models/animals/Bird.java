package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal {

	private Boolean migrates;
	private Integer avgFlightAltitude;
	
	public Boolean getMigrates(){
		return migrates;
	}
	
	public void setMigrates(Boolean migrates){
		this.migrates = new Boolean(migrates);
	}
	
	public Integer getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
	
	public void setAvgFlightAltitude(Integer avgFlightAltitude){
		this.avgFlightAltitude = new Integer(avgFlightAltitude);
	}
	
	public void getAnimalAttributes(){
		System.out.println("Species: Bird ");
		System.out.println("Name: "+getName());
		System.out.println("Number of legs: "+getNrOfLegs());
		System.out.println("Extra details:");
		System.out.println((getMigrates())?"It does migrate":"It does not migrate");
		System.out.println("It has an average flight altitude of "+getAvgFlightAltitude());
		System.out.println();
	}
}
