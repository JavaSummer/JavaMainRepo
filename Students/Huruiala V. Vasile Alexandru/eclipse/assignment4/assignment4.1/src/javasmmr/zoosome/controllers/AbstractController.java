package javasmmr.zoosome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

import javax.swing.JOptionPane;

import javasmmr.zoosome.views.ZooFrame;
import javasmmr.zoosome.views.utilities.FrameStack;

public class AbstractController {

	protected ZooFrame frame;

	private ClockThread clockThread;
	private ZoneId timezone = ZoneOffset.systemDefault();

	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;

		if (hasBackButton) {
			// Add the back button panel
			frame.setBackButtonActionListener(new BackButtonListener());
			// Create the thread and start it
			frame.setClockVisible(true);
			frame.setClockMouseListener(new ClockMouseListener());
			this.clockThread = new ClockThread();
			this.clockThread.start();
		}
	}

	// Back button
	private class BackButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// Stop the clock thread
			clockThread.shutdown();
			try {
				clockThread.join();
			} catch (InterruptedException e1) {
			} finally {
				// Close the frame
				FrameStack.getInstance().pop();
			}
		}
	}

	// Listener for clockPanel
	private class ClockMouseListener implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// Dialog popup
			String answer = (String) JOptionPane.showInputDialog(frame,
					"Set the time zone of the clock: \n (Cancel for default)", "Time settings",
					JOptionPane.INFORMATION_MESSAGE, null, ZoneId.getAvailableZoneIds().toArray(), null);

			// Set the new time zone
			if (answer != null) {
				timezone = ZoneId.of(answer);
			} else {
				timezone = ZoneId.systemDefault();
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
		}

		@Override
		public void mouseExited(MouseEvent e) {
		}

		@Override
		public void mousePressed(MouseEvent e) {
		}

		@Override
		public void mouseReleased(MouseEvent e) {
		}
	}

	private void updateTime() {

		LocalTime lt = LocalTime.now(timezone);

		this.frame.setClockLabel(String.format("%02d:%02d:%02d", lt.getHour(), lt.getMinute(), lt.getSecond()));
	}

	// Clock thread class
	private class ClockThread extends Thread {

		private volatile boolean clockIsOn = true;

		@Override
		public void run() {
			while (clockIsOn) {
				updateTime();
			}
		}

		public void shutdown() {
			clockIsOn = false;
		}
	}
}
