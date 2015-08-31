package javasmmr.zoowsome.views.animals.create;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;

public class CreateMFrame extends ZooFrame {
	/**
	 * 
	 */
	 private JTextField name  = new JTextField(10);
	 /**
	  * 
	  */
	 	    private JTextField nrOfLegs = new JTextField(10);
	 	    /**
	 	     * 
	 	     */
		    private JTextField normalBodyTemp = new JTextField(10);
		    /**
		     * 
		     */
		    private JTextField percBodyHair = new JTextField(10);
		    /**
		     * 
		     */
		    private JTextField dangerPerc = new JTextField(10);
		    /**
		     * 
		     */
		    private JTextField maintenanceCost=new JTextField(10);
		    /**
		     * 
		     */
		    private JButton createButton = new JButton("Create");
		    /**
			    * 
			    */
			   private JCheckBox cow = new JCheckBox("Cow");
			   /**
			    * 
			    */
			   private JCheckBox monkey = new JCheckBox("Monkey");
			   /**
				 * 
				 */
				private JCheckBox tiger= new JCheckBox("Tiger");
			   /**
			    * 
			    * @return 
			    */
			   public Boolean getCow() {
				return cow.isEnabled();
			}
			   /**
			    * 
			    * @return 
			    */
			public Boolean getMonkey() {
				return monkey.isEnabled();
			}
			/**
			 * 
			 * @return 
			 */
			public Boolean getTiger() {
				return tiger.isEnabled();
			}
		    public CreateMFrame(final String title) {
				super(title);
		    	         
		    		        // Sets up the view and adds the components
				contentPanel.setLayout(new GridLayout(2, 7, 0, 0));
		    		        JPanel calcPanel = new JPanel();
		    				contentPanel.add(calcPanel);
		    				SpringLayout slPanel = new SpringLayout(); 
		    				calcPanel.setLayout(slPanel);
		    		        JLabel l = new JLabel("Name:", JLabel.TRAILING);
		    		        calcPanel.add(l);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l, 25, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l, 0, SpringLayout.WEST, calcPanel);
		    		        l.setLabelFor(name);
		    		        calcPanel.add(name);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						name, 25, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						name,130, SpringLayout.WEST, calcPanel);
		    		        JLabel l1 = new JLabel("Number of legs:", JLabel.TRAILING);
		    		        calcPanel.add(l1);
		    		        l1.setLabelFor(nrOfLegs);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l1, 45, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l1, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(nrOfLegs);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						nrOfLegs, 45, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						nrOfLegs, 130, SpringLayout.WEST, calcPanel);
		    		        JLabel l2 = new JLabel("Percentage body hair:", JLabel.TRAILING);
		    		        calcPanel.add(l2);
		    		        l2.setLabelFor(percBodyHair);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l2, 65, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l2, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(percBodyHair);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						percBodyHair, 65, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						percBodyHair, 130, SpringLayout.WEST, calcPanel);
		    		        JLabel l3 = new JLabel("Normal body temp:", JLabel.TRAILING);
		    		        calcPanel.add(l3);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l3, 85, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l3, 0, SpringLayout.WEST, calcPanel);
		    		        l3.setLabelFor(normalBodyTemp);
		    		        calcPanel.add(normalBodyTemp);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						normalBodyTemp, 85, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						normalBodyTemp, 130, SpringLayout.WEST, calcPanel);
		    		        JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
		    		        calcPanel.add(l4);
		    		        l4.setLabelFor(dangerPerc);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l4, 105, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l4, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(dangerPerc);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						dangerPerc, 105, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						dangerPerc, 130, SpringLayout.WEST, calcPanel);
		    		        JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
		    		        calcPanel.add(l5);
		    		        l5.setLabelFor(maintenanceCost);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l5, 125, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l5, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(maintenanceCost);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						maintenanceCost, 125, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						maintenanceCost, 130, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(createButton);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						createButton, 165, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						createButton, 150, SpringLayout.WEST, calcPanel);
		    				JLabel l6 = new JLabel("Choose mammal:", JLabel.TRAILING);
		    		        calcPanel.add(l6);
		    		        l6.setLabelFor(cow);
		    		    
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l6, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l6, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(cow);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						cow, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						cow, 120, SpringLayout.WEST, calcPanel);
		    				calcPanel.add(monkey);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						monkey, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						monkey, 180, SpringLayout.WEST, calcPanel);
		    				calcPanel.add(tiger);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						tiger, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						tiger, 250, SpringLayout.WEST, calcPanel);
		    		         
		    	    
		    }
		    	  public String getName() {
		   				return name.toString();
		   			}


		   			public int getNrOfLegs() {
		   				return Integer.parseInt(nrOfLegs.getText());
		   			}


		   			public  float getPercBodyHair() {
		   				return Float.parseFloat(percBodyHair.getText());
		   			}


		   			public float getnormalBodyTemp() {
		   				return Float.parseFloat(normalBodyTemp.getText());
		   			}


		   			public double getDangerPerc() {
		   				return Double.parseDouble(dangerPerc.getText());
		   			}


		   			public final double getMaintenanceCost() {
		   				return Double.parseDouble(maintenanceCost.getText());
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
