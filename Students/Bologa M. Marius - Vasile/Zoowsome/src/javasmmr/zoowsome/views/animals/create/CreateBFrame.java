package javasmmr.zoowsome.views.animals.create;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.views.ZooFrame;
public class CreateBFrame extends ZooFrame {
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
			    private JTextField avgFlightAltitude = new JTextField(10);
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
			   private JCheckBox migrates = new JCheckBox("True");
			   /**
			    * 
			    */
			   private JCheckBox pelican = new JCheckBox("Pelican");
			   /**
			    * 
			    */
			   private JCheckBox whitestork = new JCheckBox("Whitestork");
			   /**
				 * 
				 */
				private JCheckBox eagle= new JCheckBox("Eagle");
			   /**
			    * 
			    * @return 
			    */
			   public Boolean getPelican() {
				return pelican.isEnabled();
			}
			   /**
			    * 
			    * @return 
			    */
			public Boolean getWhitestork() {
				return whitestork.isEnabled();
			}
			/**
			 * 
			 * @return 
			 */
			public Boolean getEagle() {
				return eagle.isEnabled();
			}
			    
			    public CreateBFrame(final String title) {
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
			    						name,127, SpringLayout.WEST, calcPanel);
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
			    						nrOfLegs, 127, SpringLayout.WEST, calcPanel);
			    		        JLabel l2 = new JLabel("Average flight altitude:", JLabel.TRAILING);
			    		        calcPanel.add(l2);
			    		        l2.setLabelFor(avgFlightAltitude);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						l2, 65, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						l2, 0, SpringLayout.WEST, calcPanel);
			    		        calcPanel.add(avgFlightAltitude);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						avgFlightAltitude, 65, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						avgFlightAltitude, 127, SpringLayout.WEST, calcPanel);
			    		        JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
			    		        calcPanel.add(l4);
			    		        l4.setLabelFor(dangerPerc);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						l4, 107, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						l4, 0, SpringLayout.WEST, calcPanel);
			    		        calcPanel.add(dangerPerc);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						dangerPerc, 110, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						dangerPerc, 127, SpringLayout.WEST, calcPanel);
			    		        JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
			    		        calcPanel.add(l5);
			    		        l5.setLabelFor(maintenanceCost);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						l5, 127, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						l5, 0, SpringLayout.WEST, calcPanel);
			    		        calcPanel.add(maintenanceCost);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						maintenanceCost, 127, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						maintenanceCost, 127, SpringLayout.WEST, calcPanel);
			    		        calcPanel.add(createButton);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						createButton, 155, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						createButton, 160, SpringLayout.WEST, calcPanel);
			    				JLabel l3 = new JLabel("Migrates:", JLabel.TRAILING);
			    		        calcPanel.add(l3);
			    		        l3.setLabelFor(migrates);
			    		    
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						l3, 85, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						l3, 0, SpringLayout.WEST, calcPanel);
			    		        calcPanel.add(migrates);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						migrates, 85, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						migrates, 127, SpringLayout.WEST, calcPanel);
			    				JLabel l6 = new JLabel("Choose bird:", JLabel.TRAILING);
			    		        calcPanel.add(l6);
			    		        l6.setLabelFor(pelican);
			    		    
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						l6, 0, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						l6, 0, SpringLayout.WEST, calcPanel);
			    		        calcPanel.add(pelican);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						pelican, 0, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						pelican, 120, SpringLayout.WEST, calcPanel);
			    				calcPanel.add(whitestork);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						whitestork, 0, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						whitestork, 190, SpringLayout.WEST, calcPanel);
			    				calcPanel.add(eagle);
			    		        slPanel.putConstraint(SpringLayout.NORTH,
			    						eagle, 0, SpringLayout.NORTH, calcPanel);
			    				slPanel.putConstraint(SpringLayout.WEST, 
			    						eagle, 280, SpringLayout.WEST, calcPanel);
			  
			    		         
			    	    
			    }
			    	  public String getName() {
			   				return name.toString();
			   			}


			   			public int getNrOfLegs() {
			   				return Integer.parseInt(nrOfLegs.getText());
			   			}


			   			public  int getAvgFlightAltitude() {
			   				return Integer.parseInt(avgFlightAltitude.getText());
			   			}


			   			public Boolean getMigrates() {
			   			return(migrates.isEnabled());
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

