package upm.tdd.training;

public class CannotCreateAnotherFrame extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	CannotCreateAnotherFrame(){
		super("You have just created 10 Frame");
	}
	
}
