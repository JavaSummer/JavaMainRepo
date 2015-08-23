package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import java.math.BigDecimal;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class CareTaker extends Employee implements CareTaker_I {

	public CareTaker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CareTaker(String thisName, BigDecimal thisSalary, boolean dead) {
		super(thisName, thisSalary, dead);
		// TODO Auto-generated constructor stub
	}

	double workingHours;

	public double getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(double theseWorkingHours) {
		workingHours = theseWorkingHours;
	}

	public String takeCareOf(Animal animal) {

		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;

		}
		/*
		 * pseudo-code: set the animal takenCareOf flag to true Subtract the
		 * maintenance cost from the caretakers working hours return
		 * Constants.Employees.Caretakers.TCO_SUCCESS;
		 */
		animal.setTakenCareOf(false);
		setWorkingHours(getWorkingHours() - animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;

	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, "workingHours", String.valueOf(getWorkingHours()));
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretaker);

	}

	public void decodeFromXml(Element element) {
		//super.decodeFromXml(element);
		setWorkingHours(Double.valueOf(element.getElementsByTagName("workingHours").item(0).getTextContent()));

	}

}
