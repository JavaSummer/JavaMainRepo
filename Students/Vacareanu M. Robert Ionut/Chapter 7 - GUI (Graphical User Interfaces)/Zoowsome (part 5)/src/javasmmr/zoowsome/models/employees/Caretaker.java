package javasmmr.zoowsome.models.employees;

import static javasmmr.zoowsome.repositories.AnimalRepository.createNode;

import java.math.BigDecimal;
import java.util.List;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.Constants;

public class Caretaker extends Employee implements Caretaker_I {

	double workingHours;

	public Caretaker(List<String> attributes) {
		super(Long.valueOf(attributes.get(1)), attributes.get(2), BigDecimal.valueOf(Double.valueOf(attributes.get(3))),
				Boolean.valueOf(attributes.get(4)));
		this.workingHours = Double.valueOf(attributes.get(0));
	}

	public Caretaker() {
		super();
		this.setWorkingHours(8);
	}

	public double getWorkingHours() {
		return this.workingHours;
	}

	public void setWorkingHours(double workingHours) {
		this.workingHours = workingHours;
	}

	public String getAllAttributes() {
		String attributes = new String();

		attributes = attributes + super.getAllAttributes();
		attributes = attributes + "Working Hours: " + this.getWorkingHours() + "\n\n";

		return attributes;
	}

	@Override
	public String takeCareOf(Animal animal) throws Exception {
		if (animal.kill()) {
			return Constants.Employees.Caretakers.TCO_KILLED;
		}
		if (this.workingHours < animal.getMaintenanceCost()) {
			return Constants.Employees.Caretakers.TCO_NO_TIME;
		}
		animal.setTakenCareOf(true);
		this.setWorkingHours(this.getWorkingHours() - animal.getMaintenanceCost());
		return Constants.Employees.Caretakers.TCO_SUCCESS;
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Employees.Caretaker);
	}

}
