package javasmmr.zoowsome.views.animals.create;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.services.factories.animal.Constants;
import javasmmr.zoowsome.services.factories.animal.Constants.Frames;
import javasmmr.zoowsome.services.factories.employee.CaretakerFactory;
import javasmmr.zoowsome.views.ZooFrame;
/**
 * 
 * @author Marius Bologa
 *
 */
public class EmployeeListFrame extends ZooFrame {
	/**
	 * 
	 * @param careTaker An array of caretakers.
	 */
	private static JFrame printCaretakers(final Caretaker[] careTaker) {
		JFrame someFrame = new JFrame();
	    someFrame.setSize(Frames.WIDTH, Frames.HEIGHT);
	    someFrame.setVisible(true);
	    new SpringLayout(); 
		someFrame.setLayout(new GridLayout(careTaker.length, careTaker.length, -10, -10));
		for (int i = 0; i < careTaker.length; i++) {
			JLabel l = new JLabel("Name:");
	        someFrame.add(l);
			JLabel l4 = new JLabel(careTaker[i].getName());
			someFrame.add(l4);
			JLabel l1 = new JLabel("Salary:");
			 someFrame.add(l1);
				JLabel l5 = new JLabel(careTaker[i].getSalary().toString());
				 someFrame.add(l5);
			JLabel l2 = new JLabel("ID:");
			 someFrame.add(l2);
				JLabel l6 = new JLabel(careTaker[i].getId().toString());
				 someFrame.add(l6);
			JLabel l3 = new JLabel("Workinghours:");
			 someFrame.add(l3);
			 double hours=careTaker[i].getWorkingHours();
				JLabel l7 = new JLabel(String.valueOf((double)Math.round(hours * 10) / 10));
				 someFrame.add(l7);
		}
		return someFrame;

	}
/**
 * 
 * @return An array of Caretakers.
 * @throws Exception .
 */
	private static Caretaker[] randomCaretaker() throws Exception {
		int n = 10;
		CaretakerFactory caretakerFactory = new CaretakerFactory();
				Caretaker[] c = new Caretaker[n];
				for (int i = 0; i < n; i++) {
				c[i] = caretakerFactory.getEmployee(
						Constants.Employees.Caretaker);
				c[i].setWorkingHours(new Double(Math.random() * 8));
				}
				return c;
			}
	/**
	 * 
	 * @param title 
	 * @throws Exception 
	 */
		    public EmployeeListFrame(final String title) throws Exception {
				super(title);
				Caretaker[] careTakerEmployee = randomCaretaker(); 
				JLabel label = new JLabel("Employees");
				printCaretakers(careTakerEmployee);
				new JFrame();
				getContentPane().setLayout(new FlowLayout());
			    getContentPane().add(label);
			    setSize(230, 230 ); 
			    setLocationRelativeTo(null);  
			    setVisible(true);	        // Sets up the view and adds the components
			
		    		         
		    	    
		    }



			@Override
			public void goBack() {
				// TODO Auto-generated method stub
				
			}
}