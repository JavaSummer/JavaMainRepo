package javasmmr.zoowsome.views;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javasmmr.zoowsome.services.factories.animal.Constants.Frames;
import javasmmr.zoowsome.views.utilities.FrameStack;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
/**
 * 
 * @author Marius Bologa
 *
 */
public abstract class ZooFrame extends JFrame implements ZooFrame_I {
	/**
	 * 
	 */
	protected JPanel contentPanel;
/**
 * 
 * @param title Title of the frame.
 */
	public ZooFrame(final String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.green);
		add(contentPanel, BorderLayout.CENTER);
	}
/**
 * 
 * @param a 
 */
	public void setBackButtonActionListener(final ActionListener a) {
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back");
		buttonPanel.add(backButton);
		this.add(buttonPanel, BorderLayout.NORTH);
		backButton.addActionListener(a);
	}
}