package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class MainMenuFrame extends ZooFrame {
	private JButton btnAdd;
	private JButton btnList;
	private JButton btnSaveAndExit;

	public MainMenuFrame(String title) {
		super(title);
		
		contentPanel.setLayout(new GridLayout(0, 3, 0, 0));
		JPanel panel = new JPanel();
		
		// adding empty panel to fill grid layout
		
		contentPanel.add(panel);
		JPanel pan = new JPanel();
		contentPanel.add(pan);
		SpringLayout slPanel = new SpringLayout();
		pan.setLayout(slPanel);
		
		btnAdd = new JButton("Add");
		slPanel.putConstraint(SpringLayout.NORTH, btnAdd, 65, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnAdd, 93, SpringLayout.WEST, pan);
		pan.add(btnAdd);
		
		btnList = new JButton("List");
		slPanel.putConstraint(SpringLayout.NORTH, btnList, 150, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnList, 94, SpringLayout.WEST, pan);
		pan.add(btnList);
		
		btnSaveAndExit = new JButton("Save and Exit");
		slPanel.putConstraint(SpringLayout.NORTH, btnSaveAndExit, 264, SpringLayout.NORTH, pan);
		slPanel.putConstraint(SpringLayout.WEST, btnSaveAndExit, 69, SpringLayout.WEST, pan);
		pan.add(btnSaveAndExit);
		
		JPanel panel_2 = new JPanel();
		contentPanel.add(panel_2);
		setVisible(true);
	}

	public void setAddButtonActionListener(ActionListener a) {
		btnAdd.addActionListener(a);
	}

	public void setListButtonActionListener(ActionListener a) {
		btnList.addActionListener(a);
	}

	public void setSaveAndExitButtonActionListener(ActionListener a) {
		btnSaveAndExit.addActionListener(a);
	}
}
