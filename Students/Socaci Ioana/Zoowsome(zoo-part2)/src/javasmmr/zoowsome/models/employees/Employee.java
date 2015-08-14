package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

abstract public class Employee implements CareTaker_I{
	//instance variables 
	private String name;
	private final long id = (long)(Math.random() * Math.pow(10, 13));
	private boolean isDead = false;
	private BigDecimal salary;
	
	//constructors
	
	public Employee(){
		name = "";
		salary = new BigDecimal("0");
		isDead = false;
	}
	public Employee(String theName, BigDecimal theSalary, boolean ifDead){
		name = theName;
		salary = theSalary;
		isDead = ifDead;
	}
	
	//getters/setters
	
	public String getName(){
		return name;
	}
	
	public void setName(String theName){
		name = theName;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public void setIsDead(boolean ifDead){
		isDead = ifDead;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setSalary(BigDecimal theSalary){
		salary = theSalary;
	}
	
	public long getId(){
		return id;
	}
}
