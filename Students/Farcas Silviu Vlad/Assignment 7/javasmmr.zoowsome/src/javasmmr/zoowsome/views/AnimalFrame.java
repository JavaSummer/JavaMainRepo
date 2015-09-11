package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;

public class AnimalFrame extends ZooFrame {

	JButton btnAquatic;
	JButton btnBird;
	JButton btnInsect;
	JButton btnMammal;
	JButton btnReptile;

	public AnimalFrame(String title) {
		super(title);
		btnAquatic = new JButton("Aquatic");
		contentPanel.add(btnAquatic);

		btnBird = new JButton("Bird");
		contentPanel.add(btnBird);

		btnInsect = new JButton("Insect");
		contentPanel.add(btnInsect);

		btnMammal = new JButton("Mammal");
		contentPanel.add(btnMammal);

		btnReptile = new JButton("Reptile");
		contentPanel.add(btnReptile);
	}

	public void setAquaticButtonActionListener(ActionListener a) {
		btnAquatic.addActionListener(a);
	}

	public void setBirdButtonActionListener(ActionListener a) {
		btnBird.addActionListener(a);
	}

	public void setInsectButtonActionListener(ActionListener a) {
		btnInsect.addActionListener(a);
	}

	public void setMammalButtonActionListener(ActionListener a) {
		btnMammal.addActionListener(a);
	}

	public void setReptileButtonActionListener(ActionListener a) {
		btnReptile.addActionListener(a);
	}
}
