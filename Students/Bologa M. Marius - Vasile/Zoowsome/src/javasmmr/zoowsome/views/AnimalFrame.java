package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

public class AnimalFrame extends ZooFrame {
	/**
	 * 
	 */
	private JButton Aquatic;
	/**
	 * 
	 */
	private JButton Bird;
	/**
	 * 
	 */
	private JButton Insect;
	/**
	 * 
	 */
	private JButton Mammal;
	/**
	 * 
	 */
	private JButton Reptile;
/**
 * 
 * @param title The title of the frame.
 */
	public AnimalFrame(final String title) {
		super(title);
		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		//JPanel panel = new JPanel();
		//contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		Aquatic = new JButton("Aquatic");
		slPanel.putConstraint(SpringLayout.NORTH,
				Aquatic, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, 
				Aquatic, 0, SpringLayout.WEST, pan);
		pan.add(Aquatic);
		Bird = new JButton("Bird");
		slPanel.putConstraint(SpringLayout.NORTH,
				Bird, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, 
				Bird, 78, SpringLayout.WEST, pan);
		pan.add(Bird);
		Insect = new JButton("Insect");
		slPanel.putConstraint(SpringLayout.NORTH, 
				Insect, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, 
				Insect, 136, SpringLayout.WEST, pan);
		pan.add(Insect);
		Mammal = new JButton("Mammal");
		slPanel.putConstraint(SpringLayout.NORTH, 
				Mammal, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, 
				Mammal, 206, SpringLayout.WEST, pan);
		pan.add(Mammal);
		Reptile = new JButton("Reptile");
		slPanel.putConstraint(SpringLayout.NORTH, 
				Reptile, 0, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, 
				Reptile, 290, SpringLayout.WEST, pan);
		pan.add(Reptile);
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}
	/**
	 * 
	 * @param a 
	 */
public  void setAquatic(final ActionListener a) {
	Aquatic.addActionListener(a);
}
/**
 * 
 * @param a 
 */
public  void setBird(final ActionListener a) {
	Bird.addActionListener(a);
}
/**
 * 
 * @param a 
 */
public  void setInsect(final ActionListener a) {
	Insect.addActionListener(a);
}
/**
 * 
 * @param a 
 */
public  void setMammal(final ActionListener a) {
	Mammal.addActionListener(a);;
}
/**
 * 
 * @param a 
 */
public  void setReptile(final ActionListener a) {
	Reptile.addActionListener(a);
}
@Override
public void goBack() {
	// TODO Auto-generated method stub
	
}

}