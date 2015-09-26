package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.views.ListFrame;

public class ListController extends AbstractController {

	public ListController(ListFrame listFrame, boolean hasBackButton) {
		super(listFrame, hasBackButton);
	}
	
	public static String displayEntities(){
		String listEntities = new String();
		
		//Get from animals/employees all the attributes
		for(Animal a : EntityController.getInstance().getAnimals()){
			listEntities = listEntities + a.toString();
		}
		for(Employee e : EntityController.getInstance().getEmployees()){
			listEntities = listEntities + e.getAllAttributes();
		}
		
		return listEntities;
	}

}
