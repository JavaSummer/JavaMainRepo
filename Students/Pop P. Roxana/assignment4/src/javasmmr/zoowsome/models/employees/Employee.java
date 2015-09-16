package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	
	String name;
	Long id;
	BigDecimal salary;
    Boolean isDead = true;//here?
    
    public Employee(){//should i have this?
    }
    
    public Employee(String name, BigDecimal salary, boolean isDead){
    	
    	setName(name);
    	setId();//should i put it?
    	setSalary(salary);
    	setIsDead(isDead);
    	
    }
    
    public void setName(String name){
    	this.name = new String(name);
    }
	
	public String getName(){
		return name;
	}
	
	public void setId(){
		
		Random generator = new Random();
		String nr = "";
		for (int i=0;i<13;i++){
			nr =nr + String.format("%d", generator.nextInt(10));
		}
		id = Long.parseLong(nr);
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setSalary(BigDecimal salary){
		
		this.salary = salary;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setIsDead(boolean isDead){
		
		this.isDead = isDead;
	}
}
