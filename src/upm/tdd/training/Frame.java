package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	private final int MAX_PINS = 10;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score() throws BowlingException{
		int result = firstThrow + secondThrow;
		if (result < 0 || result > 10)
			throw new BowlingException();
		return result;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return firstThrow == MAX_PINS ? true : false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return ((!isStrike()) && (firstThrow + secondThrow == MAX_PINS)) ? true : false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		
		return false;
	}

	//bonus throws
	public int bonus(){
		return 0;
	}


}