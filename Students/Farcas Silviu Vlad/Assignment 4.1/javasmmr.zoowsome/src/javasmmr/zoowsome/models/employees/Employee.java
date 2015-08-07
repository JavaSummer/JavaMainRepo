package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}
	public Employee(String name, long id, BigDecimal salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.isDead=false;
		
	}
}
