package javasmmr.zoowsome.views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import javasmmr.zoowsome.views.utilities.FrameStack;
import javasmmr.zoowsome.controllers.ClockController;
import javasmmr.zoowsome.services.factories.Constants.FRAMES;

public abstract class ZooFrame extends JFrame implements ZooFrame_I {

	protected JPanel contentPanel;

	public ZooFrame(String title) {
		FrameStack.getInstance().push(this);
		setTitle(title);
		setSize(FRAMES.WIDTH, FRAMES.HEIGHT);
		setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPanel = new JPanel();
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setBackground(Color.red);
		add(contentPanel, BorderLayout.CENTER);
	}

	public void setHeader(ActionListener a) {
		JMenuBar header = new JMenuBar();
		header.setLayout(new BorderLayout());
		setBackButtonActionListener(a, header);
		setClock(header);
		add(header, BorderLayout.NORTH);

	}

	public void setBackButtonActionListener(ActionListener a, JMenuBar panel) {
		JButton backButton = new JButton("Back");
		panel.add(backButton, BorderLayout.LINE_START);
		backButton.addActionListener(a);
	}

	public void setClock(JMenuBar panel) {

		JMenu clockMenu = new JMenu();

		// List of possible GMT
		JButton[] timeZones = new JButton[24];
		timeZones[0] = new JButton("GMT-12");
		timeZones[1] = new JButton("GMT-11");
		timeZones[2] = new JButton("GMT-10");
		timeZones[3] = new JButton("GMT-9");
		timeZones[4] = new JButton("GMT-8");
		timeZones[5] = new JButton("GMT-7");
		timeZones[6] = new JButton("GMT-6");
		timeZones[7] = new JButton("GMT-5");
		timeZones[8] = new JButton("GMT-4");
		timeZones[9] = new JButton("GMT-3");
		timeZones[10] = new JButton("GMT-2");
		timeZones[11] = new JButton("GMT-1");
		timeZones[12] = new JButton("GMT");
		timeZones[13] = new JButton("GMT+1");
		timeZones[14] = new JButton("GMT+2");
		timeZones[15] = new JButton("GMT+3");
		timeZones[16] = new JButton("GMT+4");
		timeZones[17] = new JButton("GMT+5");
		timeZones[18] = new JButton("GMT+6");
		timeZones[19] = new JButton("GMT+7");
		timeZones[20] = new JButton("GMT+8");
		timeZones[21] = new JButton("GMT+9");
		timeZones[22] = new JButton("GMT+10");
		timeZones[23] = new JButton("GMT+11");

		clockMenu.setFont(new Font(clockMenu.getFont().getName(), Font.PLAIN, 28));

		panel.add(clockMenu, BorderLayout.LINE_END);

		// Every button will have the same listener
		ClockController listener = new ClockController();

		for (int i = 0; i < timeZones.length; i++) {
			timeZones[i].addActionListener(listener);
			timeZones[i].setMargin(new Insets(0, 0, 0, 0));
			timeZones[i].setContentAreaFilled(false);
			timeZones[i].setBorderPainted(false);
			timeZones[i].setOpaque(false);
			clockMenu.add(timeZones[i]);
		}

		Thread clock = new Thread() {

			public void run() {
				String GMT;
				for (;;) {
					GMT = listener.getButtonPressedText();
					Calendar cal;
					if (GMT == null) {
						cal = Calendar.getInstance();
					} else {
						cal = Calendar.getInstance(TimeZone.getTimeZone(GMT));
					}
					int second = cal.get(Calendar.SECOND);
					int minute = cal.get(Calendar.MINUTE);
					int hours = cal.get(Calendar.HOUR_OF_DAY);

					clockMenu.setText(hours + ":" + minute + ":" + second);

					try {
						sleep(100);
					} catch (InterruptedException e) {

					}
				}
			}

		};
		clock.start();
	}

	@Override
	public void goBack() {

	}

}
