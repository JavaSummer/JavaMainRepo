package javasmmr.zoowsome.models.animals;

public class Spider extends Insect {

	public Spider(Integer nrOfLegs, String name, Boolean canFly, Boolean isDangerous,double maintenanceCost, double dangerPerc) {

		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setCanFly(canFly);
		setIsDangerous(isDangerous);
	}

	public Spider() {
		this(new Integer(16), "spider",false, true,5,0.7);
	}
	
	public double getPredisposition(){
		
		DateAndTime time = new DateAndTime();
	
		if (time.getHour()>23||time.getHour()<6){
			
			return 0.25;
			
		}
		else{
			
			return 0;
		}
	
	}

}


