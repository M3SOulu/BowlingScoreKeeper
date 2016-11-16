package upm.tdd.training;

public class BowlingException extends Exception {

	/**
	 * serial version
	 */
	private static final long serialVersionUID = 1L;
	
	public BowlingException()
	{
		super( "Bowling Game exception" );
	}
	
	public BowlingException( String msg )
	{
		super( msg );
	}
	

}
