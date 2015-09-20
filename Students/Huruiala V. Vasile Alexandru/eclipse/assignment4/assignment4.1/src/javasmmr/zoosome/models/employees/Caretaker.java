package javasmmr.zoosome.models.employees;

import static javasmmr.zoosome.repositories.EntityRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {
	private static final String DEFAULT_NAME = "Bob (caretaker)";
	private static final long DEFAULT_MAX_ID = 9999999999999L;
	private static final BigDecimal DEFAULT_SALARY = new BigDecimal(1000);
	private static final double DEFAULT_WORKING_HOURS = 0.0D;

	private double workingHours;

	public Caretaker() {
		super(DEFAULT_NAME, (long) (DEFAULT_MAX_ID * Math.random()), DEFAULT_SALARY);
		this.workingHours = DEFAULT_WORKING_HOURS;
	}

	public Caretaker(final String name, final long id, final double salary, final double wHours) {
		super(name, id, salary);
		this.workingHours = wHours;
	}

	public Caretaker(final String name, final long id, final BigDecimal salary, final double wHours) {
		super(name, id, salary);
		this.workingHours = wHours;
	}

	public String takeCareOf(Animal animal) {
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		if (animal.kill()) {
			this.setIsDead(true);
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		animal.setTakenCareOf(true);
		this.setWorkingHours(this.getWorkingHours() - animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double newWorkingHours) {
		this.workingHours = newWorkingHours;
	}

	public void encodeToXML(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXML(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(this.getWorkingHours()));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Jobs.CARETAKER);
	}

	public void decodeFromXML(Element element) {
		super.decodeFromXML(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));
	}
}
