package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ClockController implements ActionListener {
	private JButton lastButtonPressed;
	private String buttonPressedText;

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
		if (lastButtonPressed == buttonPressed) {
			buttonPressedText = buttonPressed.getText();
		}
		lastButtonPressed = buttonPressed;
	}

	public String getButtonPressedText() {
		return this.buttonPressedText;
	}

}
