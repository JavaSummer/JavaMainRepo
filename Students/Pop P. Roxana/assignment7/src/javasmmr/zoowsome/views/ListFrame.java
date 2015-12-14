package javasmmr.zoowsome.views;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.repositories.AnimalRepository;
import javasmmr.zoowsome.repositories.EmployeeRepository;

public class ListFrame extends ZooFrame{
	
	JLabel animalsText;
	JLabel employeesText;

	public ListFrame(String title) {
		super(title);
		setVisible(true);

		contentPanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		/** ANIMALS **/
		//creating the animal-related text
		String animalsTextString = "<html>ANIMALS<br><br>";
		
		ArrayList<Animal> animals = AnimalRepository.getAnimalsToBeListed();
		for(Animal a: animals){
			String s = a.toString();
			animalsTextString = animalsTextString + s + "<br>";
		}
		
		animalsTextString = animalsTextString + "</html>";
		animalsText = new JLabel(animalsTextString);
		
		//put the animal-related text on a JScrollPane
		JScrollPane scroller1 = new JScrollPane(animalsText);
		scroller1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroller1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		contentPanel.add(scroller1);


		/** EMPLOYEES **/
		//creating the animal-related text
		String employeesTextString = "<html>EMPLOYEES<br><br>";
		
		ArrayList<Employee> employees = EmployeeRepository.getEmployeesToBeListed();
		for(Employee e: employees){
			String s = e.toString();
			employeesTextString = employeesTextString + s + "<br>";
		}
		
		employeesTextString = employeesTextString +"</html>";
		employeesText = new JLabel(employeesTextString);
		
		//put the employee-related text on a JScrollPane
		JScrollPane scroller2 = new JScrollPane(employeesText);
		scroller2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroller2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        contentPanel.add(scroller2);	
		
	}

	@Override
	public void goBack() {
		// TODO Auto-generated method stub
		
	}

}
