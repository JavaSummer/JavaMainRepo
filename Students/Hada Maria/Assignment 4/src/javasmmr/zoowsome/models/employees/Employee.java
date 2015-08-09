package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {

	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;

	public Employee(String employeeName, long ID, BigDecimal employeeSalary) {
		name = employeeName;
		id = ID;
		salary = employeeSalary;
		isDead = false;
	}

	public void setName(String employeeName) {
		name = employeeName;
	}

	public String getName() {
		return name;
	}

	public void setId(long ID) {
		id = ID;
	}

	public long getId() {
		return id;
	}

	public void setSalary(BigDecimal employeeSalary) {
		salary = employeeSalary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setIsDead(boolean dead) {
		isDead = dead;
	}

	public boolean getIsDead() {
		return isDead;
	}
}
