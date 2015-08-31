package javasmmr.zoowsome.views.animals.create;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.models.animals.WaterType.TypeOfWater;
import javasmmr.zoowsome.views.ZooFrame;

public class CreateAFrame extends ZooFrame {
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
		    private JTextField dangerPerc = new JTextField(10);
		    /**
		     * 
		     */
		    private JTextField maintenanceCost=new JTextField(10);
		    /**
		     * 
		     */
		    private JTextField avgSwimDepth=new JTextField(10);
		    /**
		     * 
		     */
		    private JButton createButton = new JButton("Create");
		    /**
			    * 
			    */
			   private JCheckBox fwater = new JCheckBox("Fresh water");
			   /**
			    * 
			    */
			   private JRadioButton swater = new JRadioButton("Salt water");
		    /**
			    * 
			    */
			   private JRadioButton shark = new JRadioButton("Shark");
			   /**
			    * 
			    */
			   private JCheckBox northernPike = new JCheckBox("NorthernPike");
			   /**
				 * 
				 */
				private JCheckBox tuna= new JCheckBox("Tuna");
			   /**
			    * 
			    * @return   
			    */
			   public Boolean getShark() {
				return shark.isEnabled();
			}
			   /**
			    * 
			    * @return   
			    */
			public Boolean getNorthernPike() {
				return northernPike.isEnabled();
			}
			/**
			 * 
			 * @return  
			 */
			public Boolean getTuna() {
				return tuna.isEnabled();
			}
		    
		    public CreateAFrame(final String title) {
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
		    						name,120, SpringLayout.WEST, calcPanel);
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
		    						nrOfLegs, 120, SpringLayout.WEST, calcPanel);
		    		        JLabel l2 = new JLabel("Average swim depth:", JLabel.TRAILING);
		    		        calcPanel.add(l2);
		    		        l2.setLabelFor(avgSwimDepth);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l2, 65, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l2, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(avgSwimDepth);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						avgSwimDepth, 65, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						avgSwimDepth, 120, SpringLayout.WEST, calcPanel);
		    		        JLabel l3 = new JLabel("Water type:", JLabel.TRAILING);
		    		        calcPanel.add(l3);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l3, 89, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l3, 0, SpringLayout.WEST, calcPanel);
		    		        l3.setLabelFor(fwater);
		    		        calcPanel.add(fwater);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						fwater, 87, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						fwater, 120, SpringLayout.WEST, calcPanel);
		    				calcPanel.add(swater);
		    				slPanel.putConstraint(SpringLayout.NORTH,
		    						swater, 87, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						swater, 220, SpringLayout.WEST, calcPanel);
		    				 ButtonGroup group = new ButtonGroup();
		    				    group.add(fwater);
		    				    group.add(swater);
		    		        JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
		    		        calcPanel.add(l4);
		    		        l4.setLabelFor(dangerPerc);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l4, 115, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l4, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(dangerPerc);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						dangerPerc, 115, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						dangerPerc, 120, SpringLayout.WEST, calcPanel);
		    		        JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
		    		        calcPanel.add(l5);
		    		        l5.setLabelFor(maintenanceCost);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l5, 135, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l5, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(maintenanceCost);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						maintenanceCost, 135, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						maintenanceCost, 120, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(createButton);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						createButton, 160, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						createButton, 150, SpringLayout.WEST, calcPanel);
		    				JLabel l6 = new JLabel("Choose aquatic:", JLabel.TRAILING);
		    		        calcPanel.add(l6);
		    		        l6.setLabelFor(shark);
		    		    
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						l6, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						l6, 0, SpringLayout.WEST, calcPanel);
		    		        calcPanel.add(shark);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						shark, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						shark, 120, SpringLayout.WEST, calcPanel);
		    				calcPanel.add(northernPike);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						northernPike, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						northernPike, 183, SpringLayout.WEST, calcPanel);
		    				calcPanel.add(tuna);
		    		        slPanel.putConstraint(SpringLayout.NORTH,
		    						tuna, 0, SpringLayout.NORTH, calcPanel);
		    				slPanel.putConstraint(SpringLayout.WEST, 
		    						tuna, 280, SpringLayout.WEST, calcPanel);
		    		         
		    	    
		    }
		    	  public String getName() {
		   				return name.toString();
		   			}


		   			public int getNrOfLegs() {
		   				return Integer.parseInt(nrOfLegs.getText());
		   			}


		   			public  int getAvgSwimDepth() {
		   				return Integer.parseInt(avgSwimDepth.getText());
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

	public Boolean getFwater() {
		return fwater.isEnabled();
	}

	public boolean getSwater() {
		return swater.isEnabled();
	}

	public TypeOfWater getWaterType() {
		if (getFwater()) {
			return TypeOfWater.freshwater;
		} else if (getSwater()) {
			return TypeOfWater.saltwater;
		}
		return null;
	}

}
