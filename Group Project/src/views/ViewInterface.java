package views;


/** 
 * @author Jamie Pascual
 * @author Amilcar Arellano  
 */

public interface ViewInterface {
    
    public void display();
    
    public String getInput();
    
    public boolean doAction(String value);
}