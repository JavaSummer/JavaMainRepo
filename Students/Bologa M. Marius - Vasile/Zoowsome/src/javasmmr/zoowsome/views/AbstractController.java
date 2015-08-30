package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;
/**
 * 
 * @author Marius Bologa
 *
 */
public class AbstractController {
	/**
	 * 
	 */
	protected ZooFrame frame;
/**
 * 
 * @param frame The frame.
 * @param hasBackButton The back button.
 */
public AbstractController(final ZooFrame frame, final boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton) {
			frame.setBackButtonActionListener(new BackButtonListener());
		}
	}
/**
 * 
 * @author Marius Bologa
 *
 */
	private class BackButtonListener implements ActionListener {
		@Override
		public void actionPerformed(final ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}
}