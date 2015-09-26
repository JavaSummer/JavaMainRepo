package javasmmr.zoowsome.views;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import javasmmr.zoowsome.controllers.ListController;

public class ListFrame extends ZooFrame {

	JScrollPane scrollPane;
	JTextArea textArea = new JTextArea(16, 58);
	JPanel panel = new JPanel();

	public ListFrame(String title) {
		super(title);
		
		contentPanel.setBackground(Color.white);
		contentPanel.setBorder(new TitledBorder(new EtchedBorder(), "Entities"));
		textArea.setEditable(false);
		textArea.setText(ListController.displayEntities());
		JScrollPane scrollPane = new JScrollPane(textArea);		
		contentPanel.add(scrollPane);

	}

}
