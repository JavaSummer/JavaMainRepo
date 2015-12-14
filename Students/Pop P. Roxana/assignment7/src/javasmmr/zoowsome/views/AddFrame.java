package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.services.factories.Constants.EmployeesType;
import javasmmr.zoowsome.services.factories.Constants.Species;

public class AddFrame extends ZooFrame {

	private class Listener implements MouseListener {
		// I used MouseListener as I wanted to get a different result
		// from what I have now. (I didn't succeed but at least
		// I now have a hint of how to use it :) )

		boolean visibility;
		ArrayList<JButton> buttons;

		Listener(ArrayList<JButton> buttons, boolean visibility) {

			this.buttons = buttons;
			this.visibility = visibility;
			setButtonsVisibility(buttons, visibility);

		}

		// boolean mousePressed = false;

		@Override
		public void mouseReleased(MouseEvent e) {

			/*
			 * mousePressed = false; visibility = false;
			 * setButtonsVisibility(buttons,visibility);
			 */

		}

		@Override
		public void mousePressed(MouseEvent e) {

			/*
			 * mousePressed = true; visibility = true;
			 * setButtonsVisibility(buttons,visibility);
			 */
		}

		@Override
		public void mouseExited(MouseEvent e) {

			/*
			 * if(!mousePressed){ visibility = false;
			 * setButtonsVisibility(buttons,visibility); }
			 */
		}

		@Override
		public void mouseEntered(MouseEvent e) {

			/*
			 * visibility = true; setButtonsVisibility(buttons,visibility);
			 */
		}

		@Override
		public void mouseClicked(MouseEvent e) {

			visibility = !visibility;
			setButtonsVisibility(buttons, visibility);

		}

	}

	// I will have the option of choosing between
	// animals and employees
	private JButton animalsButton;
	private JButton employeesButton;
	ArrayList<JButton> typesOfAnimalsButtons = new ArrayList<>();
	ArrayList<JButton> typesOfEmployeesButtons = new ArrayList<>();

	private boolean animalsButtonVisibility;
	private boolean employeesButtonVisibility;

	public AddFrame(String title) {
		super(title);

		contentPanel.setLayout(new GridLayout(0, 1, 1, 0));

		JPanel panel = new JPanel();
		contentPanel.add(panel);

		SpringLayout slPanel = new SpringLayout();
		panel.setLayout(slPanel);

		/** ANIMALS **/
		animalsButton = new JButton("Animals");
		slPanel.putConstraint(SpringLayout.NORTH, animalsButton, 60, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, animalsButton, 200, SpringLayout.WEST, panel);
		panel.add(animalsButton);

		// creating buttons with types of animals
		String animalNames[] = Species.getAllConstants();
		int count = 0;
		for (String typeOfAnimal : animalNames) {
			JButton typeOfAnimalButton = new JButton(typeOfAnimal);
			typesOfAnimalsButtons.add(typeOfAnimalButton);
			slPanel.putConstraint(SpringLayout.NORTH, typeOfAnimalButton, 100 + count * 40, SpringLayout.NORTH, panel);
			slPanel.putConstraint(SpringLayout.WEST, typeOfAnimalButton, 250, SpringLayout.WEST, panel);
			panel.add(typeOfAnimalButton);
			count++;
		}
		animalsButtonVisibility = false;
		addMouseListener(animalsButton, typesOfAnimalsButtons, animalsButtonVisibility);

		/** EMPLOYEES **/
		employeesButton = new JButton("Employees");
		slPanel.putConstraint(SpringLayout.NORTH, employeesButton, 60, SpringLayout.NORTH, panel);
		slPanel.putConstraint(SpringLayout.WEST, employeesButton, 350, SpringLayout.WEST, panel);
		panel.add(employeesButton);

		// creating buttons with types of employees
		String employeeTypes[] = EmployeesType.getAllConstants();
		count = 0;
		for (String typeOfEmployee : employeeTypes) {
			JButton typeOfEmployeeButton = new JButton(typeOfEmployee);
			typesOfEmployeesButtons.add(typeOfEmployeeButton);
			slPanel.putConstraint(SpringLayout.NORTH, typeOfEmployeeButton, 100 + count * 40, SpringLayout.NORTH,
					panel);
			slPanel.putConstraint(SpringLayout.WEST, typeOfEmployeeButton, 400, SpringLayout.WEST, panel);
			panel.add(typeOfEmployeeButton);
			count++;
		}
		employeesButtonVisibility = false;
		addMouseListener(employeesButton, typesOfEmployeesButtons, employeesButtonVisibility);

		setVisible(true);
	}

	public void setButtonsVisibility(ArrayList<JButton> typesOfButtons, boolean visibility) {

		for (JButton b : typesOfButtons) {
			b.setVisible(visibility);
		}

	}

	public void addMouseListener(JButton button, ArrayList<JButton> buttons, boolean visibility) {

		button.addMouseListener(new Listener(buttons, visibility));

	}

	public void setAquaticButtonActionListener(ActionListener a) {

		for (JButton b : typesOfAnimalsButtons) {
			if (b.getText() == Species.Aquatics) {
				b.addActionListener(a);
			}
		}
	}

	public void setBirdButtonActionListener(ActionListener a) {

		for (JButton b : typesOfAnimalsButtons) {
			if (b.getText() == Species.Birds) {
				b.addActionListener(a);
			}
		}
	}

	public void setInsectButtonActionListener(ActionListener a) {

		for (JButton b : typesOfAnimalsButtons) {
			if (b.getText() == Species.Insects) {
				b.addActionListener(a);
			}
		}
	}

	public void setMammalButtonActionListener(ActionListener a) {

		for (JButton b : typesOfAnimalsButtons) {
			if (b.getText() == Species.Mammals) {
				b.addActionListener(a);
			}
		}
	}

	public void setReptileButtonActionListener(ActionListener a) {

		for (JButton b : typesOfAnimalsButtons) {
			if (b.getText() == Species.Reptiles) {
				b.addActionListener(a);
			}
		}
	}
	
	public void setCaretakerButtonActionListener(ActionListener a) {

		for (JButton b : typesOfEmployeesButtons) {
			if (b.getText() == EmployeesType.Caretakers) {
				b.addActionListener(a);
			}
		}
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		// what's the point of this???????????
	}

}
