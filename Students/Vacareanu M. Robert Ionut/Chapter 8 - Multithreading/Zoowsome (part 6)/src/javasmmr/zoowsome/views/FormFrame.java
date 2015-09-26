package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JTextField;


public class FormFrame extends ZooFrame {

	JButton submit = new JButton("Submit");

	String[] fieldsName;

	String entityType;

	String buttonPressed;

	JTextField[] attributesTextField;

	Class<?> entity = null;

	public FormFrame(String title) {
		super(title);
	}

	// Tell which is the entity( Cow, Butterfly, Caretaker etc)
	// Used for getting the constructor
	public void recieveEntityType(String entityType) {
		this.entityType = entityType;
	}

	// Tell which radioButton was pressed(selected)
	public void recieveButtonPressed(String buttonPressed) {
		this.buttonPressed = buttonPressed;
	}

	// Receive the fields name
	// Such as canFly, workingHours etc.
	public void recieveFieldsName(String[] fieldsName) {
		this.fieldsName = fieldsName;
		attributesTextField = new JTextField[this.fieldsName.length];

	}

	/**
	 * Receive Class type from FrameController
	 * 
	 */
	public void recieveClass(Class<?> entity) {
		this.entity = entity;

	}

	/**
	 * Set initial text and set hint
	 */
	public void buildTextFieldsAttributes() {
		for (int i = 0; i < fieldsName.length; i++) {
			attributesTextField[i] = new JTextField(fieldsName[i]);
			attributesTextField[i].setToolTipText(fieldsName[i]);

		}
		for (JTextField jtf : attributesTextField) {

			jtf.addFocusListener(new FocusListener() {

				@Override
				public void focusGained(FocusEvent e) {
					jtf.setText("");
				}

				@Override
				public void focusLost(FocusEvent e) {

				}
			});
		}
	}

	// I kept id and counter ( for animal ) and randomGenerator ( for employee )
	// because, if needed they can be easily added
	public String[] getInput() {
		String[] input = new String[fieldsName.length];

		for (int i = 0; i < attributesTextField.length; i++) {
			input[i] = attributesTextField[i].getText();
		}

		// No id or counter
		if (entityType == "Animal") {
			for (int i = 0; i < attributesTextField.length - 2; i++) {
				input[i] = attributesTextField[i + 2].getText();
			}
		} else if (entityType == "Employee") {
			for (int i = 0, j = 0; i < attributesTextField.length;) {
				// No randomGenerator
				if (i == 1) {
					i++;
				} else {
					input[j] = attributesTextField[i].getText();
					i++;
					j++;
				}
			}
		}

		return input;
	}

	public void buildFormFrame() {

		contentPanel.setLayout(new GridLayout(0, 1));
		buildTextFieldsAttributes();

		// Not adding: counter and id because they are not really attributes,
		// but utilities that
		// I used to keep track of how many animals are created and to name them
		// in an easy way
		// However those attributes that are not used are not deleted because
		// if needed, they are easy to add as options
		
		if (entityType == "Animal") {
			for (int i = 2; i < this.fieldsName.length; i++) {
				contentPanel.add(attributesTextField[i]);
			}
		} else if (entityType == "Employee") {
			for (int i = 0; i < this.fieldsName.length;) {
				// Not adding randomGenerator
				if (i == 1) {
					i++;
				} else {
					contentPanel.add(attributesTextField[i]);
					i++;
				}
			}
		}
		contentPanel.add(submit);
	}
	public void setSubmitButtonActionListener(ActionListener a) {
		submit.addActionListener(a);
	}
}
