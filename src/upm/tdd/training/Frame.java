package upm.tdd.training;


public class Frame {
	private static int count = 0;
	private int id;

	private static final int MAX_NUMBER_OF_PINS = 10;
	private static final int MAX_NUMBER_OF_FRAMES = 10;

	private int firstThrow;
	private int secondThrow;
	private int bonus = 0;

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
			throw new BowlingException();
		}

		count++;
		id = count;

		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}


	/**
	 * the score of a single frame with bonus
	 * @return
	 */
	public int score(){
		return getScoreWithoutBonus() + bonus;
	}
	
	/**
	 * the score of a single frame without bonus
	 * @return
	 */
	public int getScoreWithoutBonus()
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
		if( isSpare() ){
			return 2;
		}
		else if( isStrike() ){
			return 1;
		}
		else{
			return 0;
		}
	}

	/**
	 * 
	 * @param firstThrow
	 * @param secondThrow
	 */
	public void setBonus( int firstThrow, int secondThrow )
	{
		if( isSpare() ){
			bonus = firstThrow;
		}
		else if( isStrike() ){
			bonus = ( firstThrow + secondThrow );
		}
	}





}
