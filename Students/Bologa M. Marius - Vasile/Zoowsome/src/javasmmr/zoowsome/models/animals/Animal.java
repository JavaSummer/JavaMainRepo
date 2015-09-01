package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import org.w3c.dom.Element;

import javasmmr.zoowsome.models.interfaces.XML_Parsable;

/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class Animal implements Killer, XML_Parsable {
	/**
	 * 
	 * @return If the animal is dangerous.
	 */
	public boolean kill() {
		double danger = Math.random();
		return (danger < dangerPerc + getDangerPerc());
	}

	/**
	 * 
	 */
	final double maintenanceCost;

	/**
	 * 
	 * @return Maintenance costs.
	 */
	public final double getMaintenanceCost() {
		return maintenanceCost;
	}

	/**
	 * 
	 * @return Danger percent.
	 */
	public final double getDangerPerc() {
		return dangerPerc + getPredisposition();
	}

	/**
	 * 
	 */
	final double dangerPerc;

	/**
	 * 
	 * @param maintenanceCost
	 *            How many hours per week will this animal require attention.
	 * @param dangerPerc
	 *            How dangerous an animal is.
	 */
	public Animal(final double maintenanceCost, final double dangerPerc) {
		super();
		this.maintenanceCost = maintenanceCost;
		this.dangerPerc = dangerPerc;
	}

	/**
	 * 
	 */
	private int nrOfLegs;
	/**
	 * 
	 */
	private String name;
	/**
	 * 
	 */
	private boolean takenCareOf = false;

	/**
	 * 
	 * @return .
	 */
	public final boolean isTakenCareOf() {
		return takenCareOf;
	}

	/**
	 * 
	 * @param takenCareOf
	 *            .
	 */
	public final void setTakenCareOf(final boolean takenCareOf) {
		this.takenCareOf = takenCareOf;
	}

	/**
	 * 
	 * @return The number of legs of the animal.
	 */
	public final int getNrOfLegs() {
		return nrOfLegs;
	}

	/**
	 * 
	 * @param nrOfLegs
	 *            The number of legs of the animal.
	 */
	public final void setNrOfLegs(final int nrOfLegs) {
		this.nrOfLegs = nrOfLegs;
	}

	/**
	 * 
	 * @return The name of the animal.
	 */
	public final String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name of the animal.
	 */
	public final void setName(final String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return Predisposition of an animal to kill.
	 * 
	 */
	public double getPredisposition() {
		return 0;
	}

	/**
	 * @param eventWriter
	 *            Element to encode to XML.
	 * @throws XMLStreamException
	 *             .
	 */
	public void encodeToXml(final XMLEventWriter eventWriter) throws XMLStreamException {
		createNode(eventWriter, "nrOfLegs", String.valueOf(this.nrOfLegs));
		createNode(eventWriter, "name", String.valueOf(this.name));
		createNode(eventWriter, "maintenanceCost", String.valueOf(this.maintenanceCost));
		createNode(eventWriter, "dangerPerc", String.valueOf(this.dangerPerc));
		createNode(eventWriter, "takenCareOf", String.valueOf(this.takenCareOf));
	}

	/**
	 * 
	 * @param element
	 *            Element taht is decoded from XML.
	 */
	public void decodeFromXml(final Element element) {
		setNrOfLegs(Integer.valueOf(element.getElementsByTagName("nrOfLegs").item(0).getTextContent()));
		setName(element.getElementsByTagName("name").item(0).getTextContent());
		setMaintenanceCost(Double.valueOf(element.getElementsByTagName("maintenanceCost").item(0).getTextContent()));
		setDangerPerc(Double.valueOf(element.getElementsByTagName("dangerPerc").item(0).getTextContent()));
		setTakenCareOf(Boolean.valueOf(element.getElementsByTagName("takenCareOf").item(0).getTextContent()));
	}

	/**
	 * 
	 * @param valueOf
	 *            Value of danger percent.
	 */
	private void setDangerPerc(final Double valueOf) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @param valueOf
	 *            Value of maintenance costs.
	 */
	private void setMaintenanceCost(final Double valueOf) {
		// TODO Auto-generated method stub

	}
	// I'm not sure if this 2 methods should or not be here
	// but without them I get an error-"The method setDangerPerc(Double)
	// is undefined for the type Animal".
}