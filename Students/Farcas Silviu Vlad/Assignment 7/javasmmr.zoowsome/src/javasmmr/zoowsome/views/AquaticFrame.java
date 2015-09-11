package javasmmr.zoowsome.views;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AquaticFrame extends ZooFrame {

	JButton btnDolphin;
	JButton btnFrog;
	JButton btnOrca;
	JTextField text;

	public AquaticFrame(String title) {
		super(title);

		text = new JTextField("Enter name");
		contentPanel.add(text);

		btnDolphin = new JButton("Dolphin");
		contentPanel.add(btnDolphin);

		btnFrog = new JButton("Frog");
		contentPanel.add(btnFrog);

		btnOrca = new JButton("Orca");
		contentPanel.add(btnOrca);

	}

	public String getNameEntered() {
		return text.getText();
	}

	public void setDolphinButtonActionListener(ActionListener a) {
		btnDolphin.addActionListener(a);
	}

	public void setFrogButtonActionListener(ActionListener a) {
		btnFrog.addActionListener(a);
	}

	public void setOrcaButtonActionListener(ActionListener a) {
		btnOrca.addActionListener(a);
	}
}
