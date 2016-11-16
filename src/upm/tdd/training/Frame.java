package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		if(firstThrow < 0 || firstThrow>10 || secondThrow<0 ||secondThrow > 10)
			throw new BowlingException();
		if((firstThrow+secondThrow)>10)
			//throw new BowlingException();
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return firstThrow==10;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return score()==10;
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
