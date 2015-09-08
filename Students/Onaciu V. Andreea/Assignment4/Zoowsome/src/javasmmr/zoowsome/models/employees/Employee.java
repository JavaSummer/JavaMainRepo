package javasmmr.zoowsome.models.employees;
import java.math.*;
abstract public class Employee {
	private String name;
	private Long id;
	private BigDecimal salary;
	private boolean isDead;
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(Long id){
		this.id=id;
	}
	
	public Long getId(){
		return id;
	}
	
	public void setSalary(BigDecimal salary){
		this.salary=salary;
	}
	
	public BigDecimal getSalary(){
		return salary;
	}
	
	public void setIsDead(boolean isDead){
		this.isDead=isDead;
	}
	
	public boolean getIsDead(){
		return isDead;
	}
	
	public Employee(String name,Long id,BigDecimal salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.isDead=false;
		
	}
}
