package javasmmr.zoowsome.models.animals;

import java.util.Calendar;

public class Spider extends Insect {
	
	public Spider(double cost, double danger) {
		super (cost, danger);
		setNrOfLegs(8);
		setCanFly (false);
		setIsDangerous(true);
			
	}
	
	public Spider(String name, int nrLegs, boolean canFly, boolean isDangerous,double cost, double danger,
			boolean takenCareof){
		super (cost, danger);
		setName(name);
		setNrOfLegs(nrLegs);
		setCanFly (canFly);
		setIsDangerous(isDangerous);	
		setTakenCareOf(takenCareof);
		
	}
	
	@Override
	public double getPredisposition() {
		 Calendar calObj = Calendar.getInstance();
		 int dayOfMonth = calObj.get(Calendar.DAY_OF_MONTH);
		 int hour = calObj.get(Calendar.HOUR_OF_DAY);
		 if ((dayOfMonth > 20)&& (dayOfMonth<27)){
			 if ((hour>=2)&&(hour<=5)){
				 return 0.25;
			 }else
				 return 0.15;
		 }
		 return 0.28;
		 
	}


}
