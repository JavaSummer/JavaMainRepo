package javasmmr.zoosome.controllers;

import javasmmr.zoosome.models.animals.Animal;
import javasmmr.zoosome.models.animals.Bear;
import javasmmr.zoosome.models.animals.Dragon;
import javasmmr.zoosome.views.MainMenuFrame;

public class MainController {

	public static void main(String[] args) {
		/*
		 * 
		 * final int populationPerSpeciesZoo = 5; final int populationZooLine =
		 * 20; final int staffSize = 6;
		 * 
		 * BigFactory big = new BigFactory();
		 * 
		 * BigFactory.nicePrint("One random zoo element");
		 * 
		 * Animal a = big.generateRandomAnimal(); BigFactory.printDetails(a);
		 * 
		 * BigFactory.nicePrint(
		 * "An entire random zoo with equal an equal amount of individuals in each species"
		 * );
		 * 
		 * Animal[][] zoo = big.generateZooEvenAmount(populationPerSpeciesZoo);
		 * for (int i = 0; i < zoo.length; i++) { for (int j = 0; j <
		 * zoo[i].length; j++) { BigFactory.printDetails(zoo[i][j]); }
		 * System.out.println(); }
		 * 
		 * BigFactory.nicePrint("An entire random zoo");
		 * 
		 * Animal[] zooLine = big.generateRandomAnimalAmount(populationZooLine);
		 * for (int i = 0; i < zooLine.length; i++) {
		 * BigFactory.printDetails(zooLine[i]); }
		 * 
		 * BigFactory.nicePrint("One caretaker");
		 * 
		 * Employee e =
		 * big.generateRandomEmployeeOfJob(Constants.Jobs.CARETAKER);
		 * BigFactory.printDetails(e);
		 * 
		 * BigFactory.nicePrint("The caretakers");
		 * 
		 * Employee[] staff = big.generateRandomeEmployeeTeamOfJob(staffSize,
		 * Constants.Jobs.CARETAKER); for (int i = 0; i < staffSize; i++) {
		 * BigFactory.printDetails(staff[i]); }
		 * 
		 * BigFactory.nicePrint("The Feast");
		 * 
		 * for (int i = 0; i < staffSize; i++) { Caretaker c = (Caretaker)
		 * staff[i]; for (int j = 0; j < populationZooLine; j++) { if
		 * ((!c.getIsDead()) && (!zooLine[j].getTakenCareOf())) { String result
		 * = c.takeCareOf(zooLine[j]); if
		 * (result.equals(Constants.Employees.Caretakers.TCO_SUCCESS)) {
		 * System.out.printf("%s just fed %s.\n", c.getName(),
		 * zooLine[j].getName()); } else if
		 * (result.equals(Constants.Employees.Caretakers.TCO_NO_TIME)) {
		 * System.out.printf("%s ain't got NO TIME to feed %s.\n", c.getName(),
		 * zooLine[j].getName()); } else if
		 * (result.equals(Constants.Employees.Caretakers.TCO_KILLED)) {
		 * System.out.printf("%s just got EATEN by %s!\n", c.getName(),
		 * zooLine[j].getName()); } } } }
		 * 
		 * BigFactory.nicePrint("Zoo status");
		 * 
		 * for (int i = 0; i < zooLine.length; i++) {
		 * BigFactory.printDetails(zooLine[i]); }
		 * 
		 * BigFactory.nicePrint("Staff status");
		 * 
		 * for (int i = 0; i < staffSize; i++) {
		 * BigFactory.printDetails(staff[i]); }
		 * 
		 * BigFactory.nicePrint("The End");
		 * 
		 * BigFactory.nicePrint("Zoo form file");
		 * 
		 * AnimalRepository anRes = new AnimalRepository(); ArrayList<Animal>
		 * animalList = BigFactory.convertAnimalArrayToArrayList(zooLine); try {
		 * anRes.save(animalList); } catch (FileNotFoundException fnf) {
		 * System.out.println(fnf.getMessage()); } catch (XMLStreamException
		 * xmls) { System.out.println(xmls.getMessage()); }
		 * 
		 * ArrayList<Animal> listFromFile = null; try { listFromFile =
		 * anRes.load(); } catch (ParserConfigurationException pc) {
		 * System.out.println(pc.getMessage()); } catch (SAXException sax) {
		 * System.out.println(sax.getMessage()); } catch (IOException io) {
		 * System.out.println(io.getMessage()); }
		 * 
		 * BigFactory.printArrayListAnimalDetails(listFromFile);
		 * 
		 * BigFactory.nicePrint("Staff from file");
		 * 
		 * EmployeeRepository emRes = new EmployeeRepository();
		 * ArrayList<Employee> employeeList =
		 * BigFactory.convertEmployeeArrayToArrayList(staff);
		 * 
		 * try { emRes.save(employeeList); } catch (FileNotFoundException fnf) {
		 * System.out.println(fnf.getMessage()); } catch (XMLStreamException
		 * xmls) { System.out.println(xmls.getMessage()); }
		 * 
		 * ArrayList<Employee> employeesFromFile = null; try { employeesFromFile
		 * = emRes.load(); } catch (ParserConfigurationException pc) {
		 * System.out.println(pc.getMessage()); } catch (SAXException sax) {
		 * System.out.println(sax.getMessage()); } catch (IOException io) {
		 * System.out.println(io.getMessage()); }
		 * 
		 * BigFactory.printArrayListEmployeeDetails(employeesFromFile);
		 * 
		 * LocalDateTime dt = LocalDateTime.now(); System.out.println(dt);
		 * 
		 * // Actual program //
		 */

		new MainMenuController(new MainMenuFrame("Main Menu"), false);
	}
}
