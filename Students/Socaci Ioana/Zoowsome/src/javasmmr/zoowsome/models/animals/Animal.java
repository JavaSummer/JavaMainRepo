package javasmmr.zoowsome.models.animals;

abstract public class Animal {
	
	int nrOfLegs;
	String name;
	
	 abstract public int getNrOfLegs();
	 abstract public void setNrOfLegs();
	 abstract public String getName();
	 abstract public void setName();
	
}
