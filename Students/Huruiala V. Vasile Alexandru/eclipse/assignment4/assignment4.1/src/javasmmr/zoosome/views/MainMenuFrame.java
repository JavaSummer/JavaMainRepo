package javasmmr.zoosome.views;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

public class MainMenuFrame extends ZooFrame {
	private static final long serialVersionUID = 3436167091888130094L;

	private static final Font BUTTON_FONT = new Font(Font.SERIF, Font.BOLD, 72);
	private static final Color BUTTON_BACKGROUND = new Color(175, 255, 175);

	private JButton btnAdd;
	private JButton btnList;
	private JButton btnSaveAndExit;

	public MainMenuFrame(String title) {
		super(title);
		contentPanel.setBorder(new EmptyBorder(25, 25, 25, 25));
		contentPanel.setLayout(new GridLayout(3, 0, 0, 25));

		btnAdd = new JButton("Add");
		btnAdd.setFont(BUTTON_FONT);
		btnAdd.setBackground(BUTTON_BACKGROUND);
		btnAdd.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPanel.add(btnAdd);

		btnList = new JButton("List");
		btnList.setFont(BUTTON_FONT);
		btnList.setBackground(BUTTON_BACKGROUND);
		btnList.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPanel.add(btnList);

		btnSaveAndExit = new JButton("Save and Exit");
		btnSaveAndExit.setFont(BUTTON_FONT);
		btnSaveAndExit.setBackground(BUTTON_BACKGROUND);
		btnSaveAndExit.setBorder(BorderFactory.createRaisedBevelBorder());
		contentPanel.add(btnSaveAndExit);
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
