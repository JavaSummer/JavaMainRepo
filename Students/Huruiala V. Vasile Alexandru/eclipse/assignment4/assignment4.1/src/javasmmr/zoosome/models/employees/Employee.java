package javasmmr.zoosome.models.employees;

import java.math.BigDecimal;

public abstract class Employee {
	private static final String DEFAULT_NAME = null;
	private static final long DEFAULT_ID = 0;
	private static final BigDecimal DEFAULT_SALARY = null;
	private static final boolean DEFAULT_IS_DEAD = false;
	
	private String name;
	private long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public Employee() {
		this.name = DEFAULT_NAME;
		this.id = DEFAULT_ID;
		this.salary = DEFAULT_SALARY;
		this.isDead = DEFAULT_IS_DEAD;
	}

	public Employee(final String employeeName, final long employeeId, final BigDecimal employeeSalary) {
		this.name = new String(employeeName);
		this.id = employeeId;
		this.salary = employeeSalary;
		this.isDead = DEFAULT_IS_DEAD;
	}
	
	public Employee(final String employeeName, final long employeeId, final double employeeSalary) {
		this(employeeName, employeeId, new BigDecimal(employeeSalary));
	}
	
	public String getName() {
		return new String(this.name);
	}
	
	public void setName(String newName) {
		this.name = new String(newName);
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setId(long newId) {
		this.id = newId;
	}
	
	public BigDecimal getSalary() {
		return this.salary;
	}
	
	public void setSalary(BigDecimal newSalary) {
		this.salary = newSalary;
	}
	
	public boolean getIsDead() {
		return this.isDead;
	}
	
	public void setIsDead(boolean newIsDead) {
		this.isDead = newIsDead;
	}
}
