package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JList;

import javasmmr.zoowsome.controllers.Data;

public class ListFrame extends ZooFrame {
	
	private JList<String> list;
	private JButton btnShowInfo;
	
	public ListFrame(String title) {
		super(title);
		
		contentPanel.setLayout(new BorderLayout());
		
		String[] animalNameList = Data.getAnimalNameList();
		list = new JList<String>(animalNameList);
		contentPanel.add(list, BorderLayout.CENTER);
		
		btnShowInfo = new JButton("Show detailed info on selected animal");
		contentPanel.add(btnShowInfo, BorderLayout.PAGE_END);
	}
	
	public void setShowInfoButtonActionListener(ActionListener a) {
		btnShowInfo.addActionListener(a);
	}
	
	public String getSelectedName() {
		return list.getSelectedValue();
	}
}
