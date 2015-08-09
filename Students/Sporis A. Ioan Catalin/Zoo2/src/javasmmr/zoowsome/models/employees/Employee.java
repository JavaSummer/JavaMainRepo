package javasmmr.zoowsome.models.employees;
import java.math.*;
public class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead = false;
	
	public Employee(String name, BigDecimal salary,boolean isDead){
		this.name = name;
		this.isDead = isDead;
		this.salary = salary;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setId(){
		id = (long) (Math.random() * 1000000000);
	}
	public long getId(){
		return id;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public BigDecimal getSalary(){
		return salary;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
	public boolean getIsDead(){
		return isDead;
	}
	public static String [] employeeName = {"Richard", "Michael","Ross","Monica","Joey","Pheebe","Tag",
			"Chandler","John","Bill","Addison","Kaarina","Bob","Nick","Dana","Laura"};
}
