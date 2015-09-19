package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.ListEmployees;
import javasmmr.zoowsome.views.ListAnimals;

public class ListController extends AbstractController {
	public ListController(ListFrame listFrame, boolean hasBackButton) {
		super(listFrame, hasBackButton);

		listFrame.setAnimalButtonActionListener(new AnimalButtonActionListener());
		listFrame.setEmployeeButtonActionListener(new EmployeeButtonActionListener());

	}

	private class AnimalButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if (!animals.containsAll(animalRepo.load()))
					animals.addAll(animalRepo.load());
				new ListAnimalsController(new ListAnimals("Animal list", animals), true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

	private class EmployeeButtonActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			try {
				if (!employees.containsAll(employeeRepo.load()))
					employees.addAll(employeeRepo.load());
				new ListEmployeesController(new ListEmployees("Employee list", employees), true);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

}