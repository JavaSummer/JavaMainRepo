package javasmmr.zoowsome.views;

import javasmmr.zoowsome.models.interfaces.ZooFrame_I;
import javasmmr.zoowsome.services.factories.Constants.Frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javasmmr.zoowsome.views.utilities.FrameStack;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

	@Override
	public void goBack() {
	}

	protected JPanel contentPanel;

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.DARK_GRAY);
		add(contentPanel, BorderLayout.CENTER);
	}

	public void setBackButtonActionListener(ActionListener a) {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back");
		buttonPanel.add(backButton);
		this.add(buttonPanel, BorderLayout.NORTH);
		backButton.addActionListener(a);
	}
}
