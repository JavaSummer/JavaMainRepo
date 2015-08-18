package javasmmr.zoowsome;
import java.util.Random;
import java.math.*;
public class DataGenerator {
	public String nameGenerator(){
		String[] names={"Jane","Bill","Mary","Jon","Kevin","Joey","Lilly","Cristal","Susan","Michael","Beny","Ted",
				"Jackson","Aiden","Liam","Lucas","Noah","Mason","Ethan","Caden","Jacob","Logan","Jayden","Elijah",
				"Jack","Luke","Benjamin","Alexander","James","Jayce","Caleb","Connor","William","Carter","Ryan","Oliver",
				"Matthew","Daniel"}; 
		Random randomGenerator=new Random();
		return names[randomGenerator.nextInt(38)];
	}
	
	public Long idGenerator(){
		 long minimum=1_000_000_000_000L;
		 Random randomGenerator=new Random();
		 long randomNum = minimum + Math.abs(randomGenerator.nextInt(999_999_999)); 
		 return randomNum;
	}
	
	public BigDecimal salaryGenerator(){
		BigDecimal salary=new BigDecimal(1500);
		return salary;
	}
	
    public double workingHoursGenerator(){
    	final double hours=40;
		return hours;
    }
	
}
