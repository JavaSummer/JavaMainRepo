package javasmmr.zoowsome.views.animals.create;

import java.awt.FlowLayout;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EntityRepository;
import javasmmr.zoowsome.services.factories.animal.AnimalFactory;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.Constants.Frames;
import javasmmr.zoowsome.services.factories.animal.SpeciesFactory;
import javasmmr.zoowsome.views.ZooFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AnimalListFrame extends ZooFrame {
	/**
	 * 
	 * @return Print the animals.
	 * @throws TransformerException 
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	private static JFrame printAnimals()
			throws TransformerException, 
			ParserConfigurationException, SAXException, IOException {
		JFrame someFrame = new JFrame();
		someFrame.setSize(Frames.WIDTH, Frames.HEIGHT);
		someFrame.setVisible(true);
		try {
			DocumentBuilderFactory documentBuilderFactory 
			= DocumentBuilderFactory.newInstance();
			InputStream inputStream = new FileInputStream(
					new File("Animals.xml"));
			org.w3c.dom.Document doc = documentBuilderFactory.
					newDocumentBuilder().parse(inputStream);
			StringWriter stw = new StringWriter();
			Transformer serializer = TransformerFactory
					.newInstance().newTransformer();
			serializer.setOutputProperty(OutputKeys.
					OMIT_XML_DECLARATION, "yes");
			serializer.setOutputProperty(OutputKeys.
					METHOD, "xml");
			serializer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			serializer.transform(new DOMSource(doc)
					, new StreamResult(stw));
			JTextArea textArea = new JTextArea(stw.toString());
			textArea.setFont(new Font("Serif", Font.ITALIC, 12));
			JScrollPane areaScrollPane = new JScrollPane(textArea);
			areaScrollPane.setVerticalScrollBarPolicy(
					JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
			textArea.setWrapStyleWord(true);
			someFrame.add(textArea);
			someFrame.getContentPane().add(areaScrollPane);
			areaScrollPane.setViewportView(textArea);
			return someFrame;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @param title Title of the jFrame.
	 * @throws Exception .
	 */
	public AnimalListFrame(final String title) throws Exception {
		super(title);
		printAnimals();
		JLabel label = new JLabel("Animals");
		new JFrame();
		getContentPane().setLayout(new FlowLayout());
		getContentPane().add(label);
		setSize(230, 230);
		setLocationRelativeTo(null);
		setVisible(true); // Sets up the view and adds the components

	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}