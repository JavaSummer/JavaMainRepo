package javasmmr.zoowsome.models.animals;



abstract public class Bird extends Animal{

	private boolean migrates;
	private int avgFlightAltitude;
	 
	 public boolean getMigrates(){
		 return migrates;
	 }
	 
	 public int getAvgFlightAltitude(){
		 return avgFlightAltitude;
	 }
	 
	 public void setMigrates(boolean migrates){
		 this.migrates=migrates;
	 }
	 
	 public void setAvgFlightAltitude(int flightAltitude){
		 this.avgFlightAltitude=flightAltitude;
	 }
	 
	 public Bird(int nrOfLegs,String name,double cost,double danger,int flightAltitude,boolean migrates){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setAvgFlightAltitude(flightAltitude);
		 setMigrates(migrates);
	 }
	 public Bird(double cost,double danger){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setAvgFlightAltitude(avgFlightAltitude);
		 setMigrates(migrates);	
	 }
}