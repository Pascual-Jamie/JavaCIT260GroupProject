package views;

/**
 * @author Jamie Pascual 
 * @author Amilcar Arellano  
 */

import java.util.Scanner;

// import ViewInterface;

public abstract class View implements ViewInterface {
	    protected String displayMessage;
	    Scanner input = new Scanner(System.in);
	    
	    public View() {
	    }
	   
	    public View(String message){
	        this.displayMessage = message;
	    }
	   
	    @Override
	    public void display(){
	        boolean done = false; //set flag to not done
	        
	        do { //prompt for and get a menu option
	        	System.out.println("\n" + this.displayMessage);
	            String value = this.getInput();
	            if (value.toUpperCase().equals("E"))  //user wants to exit
	              return; //exit the library
	            
	           
	        
	        //this will select the action and advance to the next menu
	        
	         done = this.doAction(value);
	         
	         
	        } while(!done);
	    }
	 
	    @Override
	    public String getInput() {
	    	
	        String value = ""; //value to be returned
	        boolean valid = false; //initialize to not valid
	        try {
	        while (!valid) { //loop while an invalid value is entered
	            
	            
	            
	            value = input.nextLine(); //get next line typed on keyboard
	            value = value.trim(); //trim off leading and trailing blanks
	            
	            if (value.length() < 1) { //value is blank
	            	System.out.printf(this.getClass().getName(),"\nNot a valid response: value cannot be blank");
	                continue;
	            }
	            break; //end the loop
	        }
	        } catch (Exception e) {
	        	System.out.printf(this.getClass().getName(),"Error reading input: " + e.getMessage());
	        }
	        return value; //return the value entered
	    }
}