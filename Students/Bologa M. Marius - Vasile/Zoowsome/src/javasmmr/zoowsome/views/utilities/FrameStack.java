package javasmmr.zoowsome.views.utilities;

import java.util.ArrayList;

import javasmmr.zoowsome.views.ZooFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public final class FrameStack {
	/**
	 * 
	 */
	private static FrameStack instance;
	/**
	 * 
	 */
	private ArrayList<ZooFrame> stack;

	/**
	 * 
	 */
	private FrameStack() {
		stack = new ArrayList<ZooFrame>();
	}

	/**
	 * 
	 * @return A new frame stack.
	 */
	public static FrameStack getInstance() {
		if (instance == null) {
			instance = new FrameStack();
		}
		return instance;
	}

	/**
	 * 
	 * @return The first element of the stack.
	 */
	public ZooFrame peek() {
		return stack.get(0);
	}

	/**
	 * 
	 * @param frame
	 *            A frame of the stack.
	 */
	public void push(final ZooFrame frame) {
		if (!stack.isEmpty()) {
			peek().setVisible(false);
		}
		frame.setVisible(true);
		stack.add(0, frame);
	}

	/**
	 * 
	 */
	public void pop() {
		if (!stack.isEmpty()) {
			peek().dispose();
			stack.remove(0);
			if (!stack.isEmpty()) {
				peek().setVisible(true);
			}
		}
	}
}
