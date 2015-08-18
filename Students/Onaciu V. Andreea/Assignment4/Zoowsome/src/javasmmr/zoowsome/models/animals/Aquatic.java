package javasmmr.zoowsome.models.animals;

import javasmmr.zoowsome.models.animals.WaterType.waterType;

abstract public class Aquatic extends Animal {
	private int avgSwimDepth;
	
	private waterType water;
	 
	 public  waterType getWaterType(){
		 return water;
	 }
	 
	 public int getAvgSwimDepth(){
		 return avgSwimDepth;
	 }
	 
	 public void setWaterType(waterType water){
		 this.water=water;
	 }
	 
	 public void setAvgSwimDepth(int avgSwimDepth){
		 this.avgSwimDepth=avgSwimDepth;
	 }
	 
	 public Aquatic(int nrOfLegs,String name,double cost,double danger,int swimDepth,waterType type){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setAvgSwimDepth(swimDepth);
		 setWaterType(type);
	 }
	 public Aquatic(double cost,double danger){
		 super(cost,danger);
		 setNrOfLegs(nrOfLegs);
		 setName(name);
		 setAvgSwimDepth(avgSwimDepth);
		 setWaterType(water);	
	 }
}
