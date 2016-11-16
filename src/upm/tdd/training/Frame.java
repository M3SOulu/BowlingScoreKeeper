package upm.tdd.training;


public class Frame {
	private static int count = 0;
	private int id;

	private static final int MAX_NUMBER_OF_PINS = 10;
	private static final int MAX_NUMBER_OF_FRAMES = 10;

	private int firstThrow;
	private int secondThrow;

	/**
	 * reset the counting of id
	 * (the purpose of this method is only for tests)
	 */
	public static void resetIdCounting()
	{
		count = 0;
	}
	
	/**
	 * create a new Bowling Frame
	 * @param firstThrow
	 * @param secondThrow
	 * @throws BowlingException
	 */
	public Frame( int firstThrow, int secondThrow ) throws BowlingException{
		if( firstThrow > MAX_NUMBER_OF_PINS || 
				secondThrow > MAX_NUMBER_OF_PINS || 
				(firstThrow + secondThrow) > MAX_NUMBER_OF_PINS ){
			throw new BowlingException( "Invalid Bowling throws" );
		}

		count++;
		id = count;

		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	/**
	 * the score of a single frame 
	 * @return
	 */
	public int score()
	{
		return firstThrow + secondThrow;
	}

	/**
	 * returns whether the frame is a strike or not
	 * @return true if is a Strike
	 */
	public boolean isStrike(){
		if( firstThrow == MAX_NUMBER_OF_PINS ){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * return whether a frame is a spare or not
	 * @return true if is a Spare
	 */
	public boolean isSpare(){
		if( (firstThrow + secondThrow) == MAX_NUMBER_OF_PINS ){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * return whether this is the last frame of the match
	 * @return if is the last frame
	 */
	public boolean isLastFrame(){
		if( id == MAX_NUMBER_OF_FRAMES ){
			return true;
		}
		else{
			return false;
		}
	}

	/**
	 * bonus throws
	 * @return
	 */
	public int bonus(){
		if( isStrike() ){
			return 2;
		}
		else if( isSpare() ){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	

}
