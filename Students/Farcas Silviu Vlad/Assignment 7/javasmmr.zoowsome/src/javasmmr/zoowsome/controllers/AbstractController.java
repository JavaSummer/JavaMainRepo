package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javasmmr.zoowsome.repositories.*;
import javasmmr.zoowsome.views.ZooFrame;
import javasmmr.zoowsome.views.utilities.FrameStack;
import javasmmr.zoowsome.models.animals.*;
import javasmmr.zoowsome.models.employees.*;
import javasmmr.zoowsome.services.factories.*;

public class AbstractController {

	protected ZooFrame frame;
	public AnimalRepository aniRep = new AnimalRepository();
	public EmployeeRepository empRep = new EmployeeRepository();
	public ArrayList<Animal> animal = new ArrayList<>();
	public ArrayList<Employee> emp = new ArrayList<>();
	public AnimalFactory abstractFactory = new AnimalFactory();

	public AbstractController(ZooFrame frame, boolean hasBackButton) {
		this.frame = frame;
		if (hasBackButton)
			frame.setBackButtonActionListener(new BackButtonListener());
	}

	private class BackButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			FrameStack.getInstance().pop();
		}
	}

}
