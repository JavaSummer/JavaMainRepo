package javasmmr.zoowsome.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;
import javasmmr.zoowsome.views.FormFrame;

public class FormController extends AbstractController {

	public FormController(FormFrame formFrame, boolean hasBackButton) {
		super(formFrame, hasBackButton);
	}

	String buttonPressed;

	// Animal or Employee
	String entityType;

	String path1 = Constants.PATHS.animalPath;
	String path2 = Constants.PATHS.employeePath;

//	Class<?> entity = getFormClass(buttonPressed);
	Class<?> entity;

	String[] formFrameAttributes;
	FormFrame formFrame;

	public FormController(FormFrame formFrame, boolean hasBackButton, String buttonPressed) {
		super(formFrame, hasBackButton);
		this.formFrame = formFrame;
		this.buttonPressed = buttonPressed;
		
		
		//Fix the possible path
		path1 = path1 + buttonPressed;
		path2 = path2 + buttonPressed;
		
		formFrame.setSubmitButtonActionListener(new SubmitButtonActionListener());
		formFrame.recieveFieldsName(getStringFromFields(getAllFields(getFormClass(buttonPressed))));
		formFrame.recieveClass(getFormClass(buttonPressed));
		formFrame.recieveButtonPressed(buttonPressed);
		formFrame.recieveEntityType(entityType);
		formFrame.buildFormFrame();
		

	}

	/**
	 * Set the form for creating a new entity
	 * 
	 * Creates the path of the possible class Set the class object Get all1 its
	 * fields
	 * 
	 */
	public Class<?> getFormClass(String buttonPressed) {

		Boolean flag = false;

		Class<?> entity = null;
		try {
			entity = Class.forName(path1);
			this.entityType = "Animal";
		} catch (ClassNotFoundException e) {
			flag = true;
		}
		if (flag) {
			try {
				entity = Class.forName(path2);
				this.entityType = "Employee";
			} catch (ClassNotFoundException e) {
			}
		}
//		List<Field> fields = null;
//		fields = getAllFields(entity);
		return entity;
	}

	/**
	 * Get fields from class and superclass
	 */
	public List<Field> getAllFields(Class<?> entity) {
		List<Field> fields = new ArrayList<Field>();

		for (Class<?> c = entity; c != null; c = c.getSuperclass()) {
			fields.addAll(Arrays.asList(c.getDeclaredFields()));
		}

		return fields;
	}

	/**
	 * Delete anything up to the last . (dot)
	 * 
	 * Example: 
	 * Input: private static long javasmmr.zoowsome.models.animals.Cow.counter
	 * Output: counter
	 */
	public String[] getStringFromFields(List<Field> fields) {
		String[] fieldsString = new String[fields.size()];
		for (int i = 0; i < fields.size(); i++) {
			Field f = fields.get(i);
			fieldsString[i] = f.toString();
			fieldsString[i] = fieldsString[i].replaceAll("\\w+(\\s+|\\.+)", "");
		}
		return fieldsString;
	}
	
	
	// Set the functionality of the submit button
	private class SubmitButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			entity = getFormClass(buttonPressed);
			// Flag used for displaying if the creation succeeded
			String creationFlag = "Successful";

			// List to keep attributes
			List<String> submittedForm = new LinkedList<String>();

			// Add all attributes from the input
			Collections.addAll(submittedForm, formFrame.getInput());

			// Create the constructor that takes a list as an argument
			Constructor<?> constr = null;
			try {
				constr = entity.getConstructor(List.class);
			} catch (NoSuchMethodException | SecurityException e) {
				creationFlag = "Unsuccessful";
				e.printStackTrace();
			}

			// Check if the user chose an animal or an employee to create
			// It is needed because that entity must be added to it's
			// list(animal or employee) in EntityController
			if (entityType == "Animal") {
				Animal animal = null;
				try {
					animal = (Animal) constr.newInstance(submittedForm);
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					creationFlag = "Unsuccessful";
					e.printStackTrace();
				}
				EntityController.getInstance().addAnimal(animal);
			} else if (entityType == "Employee") {
				Employee employee = null;
				try {
					employee = (Employee) constr.newInstance(submittedForm);
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					creationFlag = "Unsuccessful";
					e.printStackTrace();
				}
				EntityController.getInstance().addEmployee(employee);
			}
			
			

			// Dialog to show if the creation was a success or not
			JOptionPane dialog = new JOptionPane();
			JOptionPane.showMessageDialog(dialog, creationFlag, "Status", JOptionPane.INFORMATION_MESSAGE);

		}
		
		

	}
	
	
	
}
