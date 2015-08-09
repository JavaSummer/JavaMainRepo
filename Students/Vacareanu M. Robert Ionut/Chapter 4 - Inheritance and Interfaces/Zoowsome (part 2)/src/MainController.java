
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.services.factories.animals.AnimalFactory;
import javasmmr.zoowsome.services.factories.animals.SpeciesFactory;
import javasmmr.zoowsome.services.factories.employees.CaretakerFactory;

public class MainController {

	public static void main(String[] args) throws Exception {
		AnimalFactory abstractFactory = new AnimalFactory();
		SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Random);
		ArrayList<Animal> animals = new ArrayList<>();

		CaretakerFactory ctFactory = new CaretakerFactory();
		ArrayList<Caretaker> caretaker = new ArrayList<>();

		for (int i = 0; i < 50; i++) {
			caretaker.add(ctFactory.getEmployee(Constants.Employees.Caretaker));
			animals.add(speciesFactory1.getAnimal("RandomAttributes"));
		}

		// Taking care
		for (Caretaker c : caretaker) {
			for (Animal a : animals) {
				if (c.getIsDead() == false && a.getTakenCareOf() == false) {
					String result = c.takeCareOf(a);
					if (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
						c.setIsDead(true);
					} else if (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
						continue;
					} else {
						a.setTakenCareOf(true);
					}
				}
			}
		}
		boolean everythingFine = true;
		for (Animal a : animals) {
			if (a.getTakenCareOf() == false) {
				everythingFine = false;
			}
		}
		if (everythingFine == false) {
			System.out.println("Animals are not taken care of well");
		} else {
			System.out.println("Everything is fine");
		}
	}

	public static void arrayList() {
		ArrayList<String> list1 = new ArrayList<>();
		Collections.addAll(list1, "A", "B", "C", "D", "E", "F", "G");
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "A", "B", "C", "D", "E", "F", "G");
		Iterator<String> it = list2.iterator();
		System.out.println(list1);
		for (int i = 0; i < 3; i++) {
			list1.remove(i);
		}
		it = list2.iterator();
		for (int i = 0; i < 3; i++) {
			it.next();
			it.remove();
		}
		System.out.println(list1);
		System.out.println(list2);
		/**
		 * Output: 
		 * [A, B, C, D, E, F, G] 
		 * [B, D, F, G] 
		 * [D, E, F, G]
		 */
	}

}
