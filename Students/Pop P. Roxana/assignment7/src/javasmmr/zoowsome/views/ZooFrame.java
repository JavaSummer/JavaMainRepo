package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javasmmr.zoowsome.services.factories.Constants.Frames;
import javasmmr.zoowsome.views.utilities.FrameStack;

public abstract class ZooFrame extends JFrame implements ZooFrame_I{
	
	protected JPanel contentPanel;
	
	/*public void goBack(){
		????????what about it?
	}*/
	
	//constructor
	public ZooFrame(String title){
		
		FrameStack.getInstance().push(this);//pushing this frame to the stack
		setTitle(title);//set the title for the frame
		setSize(Frames.WIDTH, Frames.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);//place the window at the center of the screen
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//enable the X button
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.red);
		add(contentPanel,BorderLayout.CENTER);
		
	}
	
	public void setBackButtonActionListener(ActionListener a){
		//creating backButton + its behavior
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton backButton = new JButton("Back");
	    buttonPanel.add(backButton);//add the back button to its panel
	    this.add(buttonPanel,BorderLayout.NORTH);//add the panel to the frame
	    backButton.addActionListener(a);
	}
	
}
