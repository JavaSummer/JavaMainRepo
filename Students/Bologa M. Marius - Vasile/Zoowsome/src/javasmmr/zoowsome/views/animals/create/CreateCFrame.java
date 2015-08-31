package javasmmr.zoowsome.views.animals.create;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.UUID;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class CreateCFrame extends ZooFrame {
	 private JTextField name  = new JTextField(10);
	 	    private JTextField id = new JTextField(10);
		    private JTextField salary = new JTextField(10);
		    private JCheckBox alive = new JCheckBox("*Alive(always)");
		    private JTextField workingHours = new JTextField(10);
		    private JButton createButton = new JButton("Create");
		    
		    public CreateCFrame(final String title) {
				super(title);
		    	         
		    		        // Sets up the view and adds the components
				contentPanel.setLayout(new GridLayout(2, 5, 0, 0));
		    		        JPanel calcPanel = new JPanel();
		    				contentPanel.add(calcPanel);
		    				SpringLayout slPanel = new SpringLayout(); 
		    				calcPanel.setLayout(slPanel);
		    		        JLabel l = new JLabel("Name:", JLabel.TRAILING);
		    		        calcPanel.add(l);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l, 0, SpringLayout.WEST, calcPanel);
		    		        l.setLabelFor(name);
		    		        calcPanel.add(name);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						name, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						name,90, SpringLayout.WEST, calcPanel);
		    		        JLabel l1 = new JLabel("ID:", JLabel.TRAILING);
		    		        calcPanel.add(l1);
		    		        l1.setLabelFor(id);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l1, 20, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l1, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(id);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						id, 20, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						id, 90, SpringLayout.WEST, calcPanel);
		    				id.setText(UUID.randomUUID().toString());
		    		        JLabel l4 = new JLabel("Salary:", JLabel.TRAILING);
		    		        calcPanel.add(l4);
		    		        l4.setLabelFor(salary);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l4, 40, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l4, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(salary);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						salary, 40, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						salary, 90, SpringLayout.WEST, calcPanel);
		    		        JLabel l5 = new JLabel("Working hours:", JLabel.TRAILING);
		    		        calcPanel.add(l5);
		    		        l5.setLabelFor(workingHours);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l5, 60, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l5, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(workingHours);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						workingHours, 60, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						workingHours, 90, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(createButton);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						createButton, 105, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						createButton, 150, SpringLayout.WEST, calcPanel);
		    				JLabel l3 = new JLabel("Alive?:", JLabel.TRAILING);
		    		        calcPanel.add(l3);
		    		        l3.setLabelFor(alive);
		    		        alive.setSelected(true);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l3, 80, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l3, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(alive);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						alive, 80, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						alive, 90, SpringLayout.WEST, calcPanel);
		    		         
		    	    
		    }
		    	  public String getTheName() {
		   				return name.toString();
		   			}


		   			public UUID getId() {
		   				return UUID.fromString(id.getText());
		   			}


		   			public  boolean getAlive() {
		   				return(alive.isEnabled());
		   			}


		   			public BigDecimal getSalary() throws ParseException {
		   				DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		   				symbols.setGroupingSeparator(',');
		   				symbols.setDecimalSeparator('.');
		   				String pattern = "#,##0.0#";
		   				DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
		   				decimalFormat.setParseBigDecimal(true);
		   				BigDecimal bigDecimal = (BigDecimal) decimalFormat.parse(salary.getText());
		   				return bigDecimal;
		   			}


		   			public final double getWorkingHours() {
		   				return Double.parseDouble(workingHours.getText());
		   			}

		    	 	     
		    	  	    // If the calculateButton is clicked execute a method
		    	  	    // in the Controller named actionPerformed
		    	  	     
		    	 	    void setCreateButtonActionListener(ActionListener listenForCalcButton){
		    	          
		   	        createButton.addActionListener(listenForCalcButton);
		    		         
		    		    }
						@Override
						public void goBack() {
							// TODO Auto-generated method stub
							
						}
		    	

}
