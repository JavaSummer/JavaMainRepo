package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
public abstract class Employee {

	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	Employee(){
		name = "Employee";
		id = (long) (Math.random() * 10000000000000L);
		salary = new BigDecimal(3200);
		isDead = false;
	}
	Employee(String name1, BigDecimal salary1, boolean dead){
		name = name1;
		id = (long) (Math.random() * 10000000000000L);
		salary = salary1;
		isDead = dead;
		
	}
	public void setName(String name1){
		name = name1;
	}
	public String getName(){
		return name;
	}
	public void setId(int Id1){
		id = Id1;
	}
	public long getId(){
		return id;
	}
	public void setSalary(BigDecimal sal){
		salary = sal;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public void setIsDead(boolean dead){
		isDead = dead;
	}
	public boolean getIsDead(){
		return isDead;
	}
}
