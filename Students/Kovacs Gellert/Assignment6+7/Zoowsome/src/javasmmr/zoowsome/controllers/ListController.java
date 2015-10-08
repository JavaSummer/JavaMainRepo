package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.views.ListFrame;

public class ListController extends AbstractController {
	
	ListFrame listFrame;
	public ListController(ListFrame listFrame, boolean hasBackButton) {
		super(listFrame, hasBackButton);
		listFrame.setShowInfoButtonActionListener(new ShowInfoButtonListener());
		this.listFrame = listFrame;
	}
	
	private class ShowInfoButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			String detailedInfo = Data.getDetailedInfo(listFrame.getSelectedName());
			JOptionPane.showMessageDialog(listFrame, detailedInfo, "Info on: " + listFrame.getSelectedName(), JOptionPane.INFORMATION_MESSAGE);
			
		}
		
	}
}
