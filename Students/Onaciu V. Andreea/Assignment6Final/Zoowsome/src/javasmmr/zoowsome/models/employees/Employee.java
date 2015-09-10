package javasmmr.zoowsome.models.employees;
import java.math.BigDecimal;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;
import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;
abstract public class Employee implements XML_Parsable {
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
	
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "id", String.valueOf(this.id));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "salary", String.valueOf(this.salary));
		createNode(eventWriter, "isDead", String.valueOf(this.isDead));
		}
	
	public void decodeFromXml(Element element) {
		setId(Long.valueOf(element.getElementsByTagName("id").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setSalary(BigDecimal.valueOf(Double.valueOf(element.getElementsByTagName("salary").item(0).getTextContent())));
		setIsDead(Boolean.valueOf(element.getElementsByTagName("isDead").item(0).getTextContent()));
				}
}
