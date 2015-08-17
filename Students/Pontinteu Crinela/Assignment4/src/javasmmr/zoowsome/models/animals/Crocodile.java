package javasmmr.zoowsome.models.animals;


import java.util.Calendar;


public class Crocodile extends Reptile {

	public Crocodile(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(4);
		setLaysEggs(true);
			
	}
	
	public Crocodile(String name, int nrLegs, boolean laysEggs, double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setLaysEggs(laysEggs);
		setTakenCareOf(takenCareof);
	   
	}
	
	@Override
	public double getPredisposition() {
		 Calendar calObj = Calendar.getInstance();
		 int dayOfMonth = calObj.get(Calendar.DAY_OF_MONTH);
		 int hour = calObj.get(Calendar.HOUR_OF_DAY);
		 if ((dayOfMonth > 1)&& (dayOfMonth<9)){
			 if ((hour>=1)&&(hour<=7)){
				 return 0.6;
			 }else
				 return 0.4;
		 }
		 return 0.2;
		 
	}
	
}
