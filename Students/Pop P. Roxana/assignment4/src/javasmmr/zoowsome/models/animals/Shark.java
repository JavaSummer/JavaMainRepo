package javasmmr.zoowsome.models.animals;

public class Shark extends Aquatic {

	public Shark(Integer nrOfLegs, String name,Integer avgSwimDepth, Water waterType,double maintenanceCost, double dangerPerc) {

		super(maintenanceCost,dangerPerc);
		setNrOfLegs(nrOfLegs);
		setName(name);
		setAvgSwimDepth(avgSwimDepth);
		setWaterType(waterType);
	}
	
	public Shark() {
		this(new Integer(0), "shark", new Integer(100), Water.SALTWATER,5, 0.95);
	}
	
    public double getPredisposition(){
		
		DateAndTime time = new DateAndTime();

		if (time.getHour()>8&&time.getHour()<10){//say that's when the caretaker has to feed it 
			return 0.20;
		}
		else{
			return 0;
		}
	}

}

