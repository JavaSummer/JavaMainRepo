package javasmmr.zoowsome.models.animals;

public class Lizard extends Reptile {

	public Lizard(Integer nrOfLegs, String name, Boolean laysEggs, double maintenanceCost, double dangerPerc) {

		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setLaysEggs(laysEggs);
	}
	
	public Lizard() {
		this(new Integer(4), "lizard",true, 4, 0.3);
	}
	
    public double getPredisposition(){
		
		DateAndTime time = new DateAndTime();

		if (time.getDayOfTheWeek()==7&&time.getHour()==16&&time.getMinute()<30){//saturday between 18:00 and 18:30
			                                                                    //say thats when it has its cage cleaned
			return 0.15;
		}
		else{
			return 0;
		}
	}

}

