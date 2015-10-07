package javasmmr.zoosome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javasmmr.zoosome.services.factories.Constants.Frames;
import javasmmr.zoosome.views.utilities.FrameStack;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

	private static final Color GREEN_$TUFF = new Color(32, 85, 12);

	protected JPanel contentPanel;
	private JPanel buttonPanel;
	private JButton backButton;

	private JPanel clockPanel;
	private JLabel clockLabel;

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(GREEN_$TUFF);
		add(contentPanel, BorderLayout.CENTER);
	}

	public void setBackButtonActionListener(ActionListener a) {
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new BorderLayout());
		buttonPanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		backButton = new JButton("Back");
		backButton.setFont(new Font(Font.SERIF, Font.PLAIN, 24));
		buttonPanel.add(backButton, BorderLayout.WEST);

		this.add(buttonPanel, BorderLayout.NORTH);
		backButton.addActionListener(a);

		// Clock display
		clockPanel = new JPanel(); 
		clockPanel.setToolTipText("Click to change time settings.");
		
		clockLabel = new JLabel();
		clockLabel.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
		clockPanel.add(clockLabel);
		
		clockPanel.setVisible(false);
		buttonPanel.add(clockPanel, BorderLayout.EAST);
	}
	
	public void setClockVisible(boolean b) {
		clockPanel.setVisible(b);
	}

	public void setClockLabel(String clock) {
		clockLabel.setText(clock);
	}
	
	
	public void setClockMouseListener(MouseListener a) {
		clockPanel.addMouseListener(a);
	}

	public void goBack() {
		FrameStack.getInstance().pop();
	}
}
