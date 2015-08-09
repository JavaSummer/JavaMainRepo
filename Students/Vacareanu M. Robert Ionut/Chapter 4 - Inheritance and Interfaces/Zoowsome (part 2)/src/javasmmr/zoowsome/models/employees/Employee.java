package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;
import java.util.Random;

public abstract class Employee {
	Random randomGenerator = new Random();
	private long id;
	String name;
	BigDecimal salary;
	Boolean isDead;
	
	public long getId(){
		return this.id;
	}
	public void setId(long id){
		this.id = id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public BigDecimal getSalary(){
		return this.salary;
	}
	public void setSalary(BigDecimal salary){
		this.salary = salary;
	}
	public boolean getIsDead(){
		return this.isDead;
	}
	public void setIsDead(boolean isDead){
		this.isDead = isDead;
	}
	Employee(String name, long id, BigDecimal salary){
		this.setName(name);
		this.setId(id);
		this.setSalary(salary);
		setIsDead(false);
	}
	Employee(){
		this.setId((long) (randomGenerator.nextDouble() * 10000000000000L));
		this.setName("Employee" + id);
		this.setSalary(new BigDecimal(1000));
		this.setIsDead(false);
	}
}
