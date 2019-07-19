package views;

/**
 * @author Jamie Pascual
 * @author Amilcar Arellano
 */
public class MainMenuView extends View {

	public MainMenuView() {
		super("\n---------------------------------------------------"
				+ "\n|   Main Menu                                      |"
				+ "\n---------------------------------------------------" 
				+ "\nC - Create New Library        "
				+ "\nL - Load Existing Library" 
				+ "\nE - Exit" 
				+ "\n---------------------------------------------------"
				+ "\n" 
				+ "\n" 
				+ "\nPlease choose among the list: ");
	}

	@Override
	public boolean doAction(String choose) {
		choose = choose.toUpperCase();

		switch (choose) {
		case "C": // create a new library name
			this.startNewLibrary();
			break;
		case "L": // Start an existing Library
			this.startExistingLibrary();
			break;

		default:
			System.out.printf(this.getClass().getName() + "\n***not a valid selection. Please try again.");
			break;
		}
		return false;
	}

	private void startNewLibrary() {
		System.out.printf("You selected startNewLibrary");
	}

	private void startExistingLibrary() {
		System.out.printf("You selected startExistingLibrary");
	}

}
