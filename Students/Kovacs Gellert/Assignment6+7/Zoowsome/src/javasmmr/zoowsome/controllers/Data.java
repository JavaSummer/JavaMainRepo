package javasmmr.zoowsome.controllers;

import java.util.ArrayList;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.animals.Aquatic;
import javasmmr.zoowsome.models.animals.Bird;
import javasmmr.zoowsome.models.animals.Insect;
import javasmmr.zoowsome.models.animals.Mammal;
import javasmmr.zoowsome.models.animals.Reptile;

public class Data {
	private static ArrayList<Animal> animalList = new ArrayList<Animal>();

	public static ArrayList<Animal> getAnimalList() {
		return animalList;
	}

	public static void setAnimalList(ArrayList<Animal> animalList) {
		Data.animalList = animalList;
	}

	public static void addAnimalToList(Animal a) {
		animalList.add(a);
	}

	public static String[] getAnimalNameList() {
		String[] animalNameList = new String[Data.getAnimalList().size()];
		for (int i = 0; i < animalList.size(); i++) {
			animalNameList[i] = animalList.get(i).getName();
		}
		return animalNameList;
	}

	private static Animal searchByName(String name) {
		for (int i = 0; i <= animalList.size(); i++) {
			if (animalList.get(i).getName().equals(name))
				return animalList.get(i);
		}
		return animalList.get(0);
	}

	public static String getDetailedInfo(String name) {
		Animal a = searchByName(name);
		StringBuilder sb = new StringBuilder();
		sb.append("Class: " + a.getClass().getSimpleName() + "\n");
		sb.append("Name: " + a.getName() + "\n");
		sb.append("Number of legs: " + a.getNrOfLegs() + "\n");
		sb.append("Maintenance cost: " + a.getMaintenanceCost() + "\n");
		sb.append("Danger percentage: " + a.getDangerPerc() + "\n");
		sb.append("Taken care of: " + a.getTakenCareOf() + "\n");

		switch (a.getClass().getSuperclass().getSimpleName()) {
		case "Aquatic":
			sb.append("Average swim depth: " + ((Aquatic) a).getAvgSwimDepth() + "\n");
			sb.append("Water Type: " + ((Aquatic) a).getWaterType() + "\n");
			break;
		case "Bird":
			sb.append("Average flight altitude: " + ((Bird) a).getAvgFlightAltitude() + "\n");
			sb.append("Migrates: " + ((Bird) a).getMigrates() + "\n");
			break;
		case "Insect":
			sb.append("Can fly: " + ((Insect) a).getCanFly() + "\n");
			sb.append("Danger percentage: " + ((Insect) a).getDangerPerc() + "\n");
			break;
		case "Mammal":
			sb.append("Body hair percentage: " + ((Mammal) a).getPercBodyHair() + "\n");
			sb.append("Normal body temperature: " + ((Mammal) a).getNormalBodyTemp() + "\n");
			break;
		case "Reptile":
			sb.append("Average swim depth: " + ((Reptile) a).getLaysEggs() + "\n");
			break;
		}

		return sb.toString();
	}
}
