package javasmmr.zoowsome.views.animals.create;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.views.ZooFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class AnimalListFrame extends ZooFrame {
		
	/**
		 * 
		 * @param animal
		 *            An array of animals.
		 * @throws IOException 
		 * @throws SAXException 
		 * @throws ParserConfigurationException 
		 * @return A JFrame with a JTable.
		 */
		private static JFrame printAnimals(final ArrayList<Animal> animal)
				throws ParserConfigurationException, SAXException, IOException {
			TableModel model = new TableModel(animal);
			JTable table = new JTable(model);
			JPanel panel = new JPanel();
			JFrame frame = new JFrame("Animals");
	        panel.setLayout(new BorderLayout());
           JScrollPane tableContainer = new JScrollPane(table);
           tableContainer.getViewport().add(table);
	        panel.add(tableContainer);
	        frame.getContentPane().add(panel);
	        frame.pack();
	        frame.setVisible(true);
	        return frame;
		}
	
	/**
	 * 
	 * @param title Title of the jFrame.
	 * @throws Exception .
	 */
	public AnimalListFrame(final String title) throws Exception {
		super(title);
		AnimalRepository abstractAnimalRepository = new AnimalRepository();
		ArrayList<Animal> animals = abstractAnimalRepository.load();
		printAnimals(animals);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}
}