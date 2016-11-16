package upm.tdd.training;

public class Frame {
	private int firstThrow;
	private int secondThrow;

	public Frame(int firstThrow, int secondThrow) throws BowlingException{		
		if(firstThrow==10 && secondThrow>0)
			throw new BowlingException();
		else if (firstThrow<0 || secondThrow<0)
			throw new BowlingException();
		else if (firstThrow+secondThrow>10)
			throw new BowlingException();
		else {
			this.firstThrow = firstThrow;
			this.secondThrow = secondThrow;
		}
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}
	
	public int getSecondThrow() {
		return secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		int score;
		
		score=firstThrow+secondThrow;
		
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		boolean result;
		
		if (firstThrow==10)
			result=true;
		else
			result=false;
		
		return result;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		boolean result;
		
		if (firstThrow+secondThrow==10 && firstThrow!=10)
			result=true;
		else 
			result=false;
		
		return result;
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
