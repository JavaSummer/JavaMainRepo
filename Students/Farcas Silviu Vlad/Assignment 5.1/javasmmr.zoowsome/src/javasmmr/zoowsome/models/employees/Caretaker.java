package javasmmr.zoowsome.models.employees;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import static javasmmr.zoowsome.repositories.EmployeeRepository.createNode;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private double workingHours;

	public Caretaker(String name, long id, BigDecimal salary) {
		super(name, id, salary);
	}

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String takeCareOf(Animal a) {
		if (a.kill()) {
			return Constants.Employee.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < a.getMaintenanceCost()) {
			return Constants.Employee.Caretakers.TCO_NO_TIME;
		}
		a.setTakenCareOf(true);
		setWorkingHours(getWorkingHours() - a.getMaintenanceCost());
		return Constants.Employee.Caretakers.TCO_SUCCESS;
	}
	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.workingHours));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employee.Caretaker);
	}
	public void decodeFromXml(Element element){
		super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
