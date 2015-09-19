package javasmmr.zoowsome.controllers.EmployeesControllers;

import javasmmr.zoowsome.views.EmployeesFrame.CaretakerFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javasmmr.zoowsome.models.employees.Caretaker;
import javax.swing.JOptionPane;
import javasmmr.zoowsome.controllers.AbstractController;
import javasmmr.zoowsome.controllers.MainMenuController;
import javasmmr.zoowsome.views.MainMenuFrame;
import java.math.BigDecimal;

public class CaretakerController extends AbstractController {
	public CaretakerFrame caretaker;

	public CaretakerController(CaretakerFrame caretakerFrame, boolean hasBackButton) {
		super(caretakerFrame, hasBackButton);
		caretakerFrame.setSaveButtonActionListener(new SaveButtonActionListener());
		this.caretaker = caretakerFrame;
	}

	private class SaveButtonActionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			if ((!caretaker.getName().equals("Enter the name here")) && (!caretaker.getID().equals("Enter the ID here"))
					&& (!caretaker.getSalary().equals("Enter the salary here"))
					&& (!caretaker.getHours().equals("Enter the working hours here"))) {

				if (JOptionPane.showConfirmDialog(caretaker, "Are you sure you want to save this employee ?") == 0) {

					try {
						String name = caretaker.getName();
						String id = caretaker.getID();
						String hours = caretaker.getHours();
						String salary = caretaker.getSalary();
						BigDecimal bd = new BigDecimal(salary);
						Caretaker c = new Caretaker(name, Long.parseLong(id), bd, Double.parseDouble(hours));
						employees.add(c);
						JOptionPane.showMessageDialog(caretaker, "Employee succesfully created !");
						new MainMenuController(new MainMenuFrame("Menu"), true);
					} catch (Exception ee) {
						JOptionPane.showMessageDialog(caretaker, "Entered data is wrong");
						new CaretakerController(new CaretakerFrame("Caretaker"), true);
					}

				} else
					new MainMenuController(new MainMenuFrame("Menu"), true);

			} else {
				JOptionPane.showMessageDialog(caretaker, "You must fill all the fields !");
				new CaretakerController(new CaretakerFrame("Caretaker"), true);
			}

		}
	}
}
