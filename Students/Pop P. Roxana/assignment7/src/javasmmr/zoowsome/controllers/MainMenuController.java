package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamException;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;
import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.ListFrame;
import javasmmr.zoowsome.views.MainMenuFrame;
import javasmmr.zoowsome.views.ZooFrame;

public class MainMenuController extends AbstractController{

	public MainMenuController(ZooFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		((MainMenuFrame)frame).setAddButtonActionListener(new AddButtonActionListener());
		((MainMenuFrame)frame).setListButtonActionListener(new ListButtonActionListener());
		((MainMenuFrame)frame).setSaveAndExitButtonActionListener(new SaveAndExitButtonActionListener());

	}
	
	private class AddButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"),true);
		}
		
	}
	
	private class ListButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			new ListController(new ListFrame("List"),true);
		}
		
	}
	
	private class SaveAndExitButtonActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			//I did the saving in xml files
			
			//animals
			AnimalRepository repo1 = new AnimalRepository();
			ArrayList<Animal> animals = AnimalRepository.getAnimalsToBeListed();
			try {
				repo1.save(animals);
			} catch (FileNotFoundException | XMLStreamException e1) {
				e1.printStackTrace();
			}
			
			//employees
			EmployeeRepository repo2 = new EmployeeRepository();
			ArrayList<Employee> employees = EmployeeRepository.getEmployeesToBeListed();
			try {
				repo2.save(employees);
			} catch (FileNotFoundException | XMLStreamException e1) {
				// TODO Auto-generated catch block
				System.out.println("Couldn't save employees");
				e1.printStackTrace();
			}
			//terminate the program
			System.exit(0);
		}
		
	}

}
