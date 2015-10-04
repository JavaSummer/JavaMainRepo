package javasmmr.zoosome.repositories;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import javasmmr.zoosome.models.animals.Animal;

public class ZooData {

	private static LinkedList<Animal> animalList = new LinkedList<Animal>();
	private static String[] animalListNames;

	public static void setAnimalList(Animal[] zoo) {
		for (int i = 0; i < zoo.length; i++) {
			animalList.addLast(zoo[i]);
		}
		ZooData.populateAnimalNames();
	}

	public static void addAnimal(Animal animal) {
		animalList.addLast(animal);
		ZooData.populateAnimalNames();
	}

	public static void addAnimal(Animal[] animals) {
		for (Animal a : animals) {
			addAnimal(a);
		}
	}

	public static void addAnimal(ArrayList<Animal> animals) {
		Iterator<Animal> it = animals.iterator();
		while (it.hasNext()) {
			addAnimal(it.next());
		}
	}

	public static void removeAnimal(Animal animal) {
		animalList.remove(animal);
		ZooData.populateAnimalNames();
	}

	public static void removeAllAnimals() {
		while (animalList.size() > 0) {
			animalList.removeLast();
		}
		ZooData.populateAnimalNames();
	}

	public static int getAnimalListSize() {
		if (animalList == null) {
			return -1;
		}
		return animalList.size();
	}

	public static void populateAnimalNames() {

		if (animalList.size() == 0) {
			return;
		}

		animalListNames = new String[animalList.size()];
		int i = 0;

		Iterator<Animal> it = animalList.iterator();
		while (it.hasNext()) {
			Animal an = it.next();
			animalListNames[i++] = an.getName();
		}
	}

	public static LinkedList<Animal> getAnimalList() {
		return animalList;
	}

	public static ArrayList<Animal> getArrayListAnimalList() {
		Iterator<Animal> it = animalList.iterator();
		ArrayList<Animal> al = new ArrayList<Animal>();
		while (it.hasNext()) {
			al.add(it.next());
		}

		return al;
	}

	public static Animal getAnimalFromAnimalList(int index) {
		return animalList.get(index);
	}

	public static String[] getAnimalListNames() {
		return animalListNames;
	}
}
