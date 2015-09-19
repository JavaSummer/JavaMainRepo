package javasmmr.zoowsome.views;

import java.awt.FlowLayout;

import javax.swing.*;

public class SaveAndExitFrame extends ZooFrame {

	public SaveAndExitFrame(String title) {
		super(title);
		contentPanel.setLayout(new FlowLayout());
		JPanel panel = new JPanel();

		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		FlowLayout slPanel = new FlowLayout();
		pan.setLayout(slPanel);
		JLabel sentence = new JLabel("The employees and animals have been succesfully saved !");
		pan.add(sentence);
		setVisible(true);
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub

	}

}
