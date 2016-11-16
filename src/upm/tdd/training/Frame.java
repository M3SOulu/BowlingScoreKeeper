package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int frameNumber = 0;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		frameNumber++;		
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return firstThrow == 10;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return (firstThrow + secondThrow) == 10;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus() throws BowlingException{
		if(!isLastFrame()) throw new BowlingException();
		else{
			if(isStrike()) return 2;
			else if(isSpare()) return 1;
			else return 0;
		}
	}


}
