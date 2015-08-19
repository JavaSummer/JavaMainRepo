package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {

	private String name;
	private long id = (long) Math.floor(Math.random() * 9000000000000L) + 1000000000000L; //generates a pseudo-random 13 digit nr
	private BigDecimal salary;
	private boolean isDead;

	//default constructor; each employee is alive
	public Employee(){
		isDead = false;
	}
	// constructor with all 3 fields as parameters
	public Employee(String thisName, BigDecimal thisSalary, boolean dead) {
		name = thisName;
		salary = thisSalary;
		isDead = dead;
	}

	public String getName() {
		return name;
	}

	public void setName(String thisName) {
		name = thisName;
	}

	public long getId() {
		return id;
	}

	public void setId(long ThisId) {
		id = ThisId;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal ThisSalary) {
		salary = ThisSalary;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean dead) {
		isDead = dead;
	}
}
