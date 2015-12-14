package javasmmr.zoowsome.views.utilities;

import java.util.ArrayList;

import javasmmr.zoowsome.views.ZooFrame;

public class FrameStack {

	private static FrameStack instance;
	private ArrayList<ZooFrame> stack;

	// constructor
	private FrameStack() {
		stack = new ArrayList<ZooFrame>();
	}

	// singleton pattern
	public static FrameStack getInstance() {

		if (instance == null) {
			instance = new FrameStack();
		}
		return instance;
	}

	// methods characteristic to the stack

	public ZooFrame peek() {

		return stack.get(0);

	}

	public void push(ZooFrame frame) {

		if (!stack.isEmpty()) {
			peek().setVisible(false);
		}
		stack.add(0, frame);

	}

	public void pop() {

		if (!stack.isEmpty()) {

			peek().dispose();// closes(deletes current window)
			stack.remove(0);// isn't this a slow operation? i thought ArrayLists
							// should be used when intending to add and remove
							// at the end :?
			if(!stack.isEmpty()){
				peek().setVisible(true);
			}
		}
	}

}
