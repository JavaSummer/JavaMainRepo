package javasmmr.zoowsome.models.animals;

import static javasmmr.zoowsome.repositories.EntityRepository.createNode;

import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.services.factories.Constants;

public class Tiger extends Mammal {

	/**
	 * 'default' constructor for setting the attributes to some predefined
	 * values
	 */
	public Tiger() {
		super(7.5, 0.5);
		setNrOfLegs(4);
		setNormalBodyTemp(37); // (? not sure how should I write this)
								// normalBodyTemp = 37;
		setName("Crookshanks");
		percbodyHair = 100 / 100;

	}

	/**
	 * constructor with arguments
	 * 
	 * @param name
	 *            - the name of the tiger the rest of the attributes are the
	 *            'default' ones (e.g. all tigers normally have 4 legs etc)
	 */

	public Tiger(String name, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		setNrOfLegs(4);
		setNormalBodyTemp(37);
		setPercBodyTemp(100 / 100);
	}

	public void encodeToXml(XMLEventWriter eventWriter) throws XMLStreamException {
		super.encodeToXml(eventWriter);
		createNode(eventWriter, Constants.XML_TAGS.DISCRIMINANT, Constants.Animals.Mammals.Tiger);
	}
}
