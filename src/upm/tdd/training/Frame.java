package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame( int firstThrow, int secondThrow ){
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
		
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		//to be implemented
		return 0;
	}


}
