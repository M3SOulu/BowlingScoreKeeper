package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	private static int count = 0;
	private int id;
	
	private static final int MAX_NUMBER_OF_PINS = 10;
	
	/**
	 * create a new Bowling Frame
	 * @param firstThrow
	 * @param secondThrow
	 * @throws BowlingException
	 */
	public Frame( int firstThrow, int secondThrow ) throws BowlingException{
		if( firstThrow > 10 || secondThrow > 10 || (firstThrow + secondThrow) > 10 ){
			throw new BowlingException();
		}
		
		count++;
		id = count;
		
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		return 0;
	}

	/**
	 * returns whether the frame is a strike or not
	 * @return true if is a Strike
	 */
	public boolean isStrike(){
		if( firstThrow == 10 ){
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
		if( (firstThrow + secondThrow) == 10 ){
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
		if( id == 10 ){
			return true;
		}
		else{
			return false;
		}
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}


}
