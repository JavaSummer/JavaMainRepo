package javasmmr.zoowsome.models.animals;

public abstract class Bird extends Animal{

	private boolean migrates;
	private Integer avgFlightAltitude;	
	public boolean getMigrates(){
		return migrates;
	}
	
	Bird(double maintananceCost, double dangerPerc){
		super(maintananceCost, dangerPerc);
	}
	
	public void setMigrates(boolean m){
		migrates = m;
	}
	public Integer getAvgFlightAltitude(){
		return avgFlightAltitude;
	}
	public void setAvgFlightAltitude(Integer avg){
		avgFlightAltitude = avg;
		
	}
}
