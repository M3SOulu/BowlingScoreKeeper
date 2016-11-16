package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	//the number of this Frame in the Game
	private int frameNumber = 0;
	
	public int getFrameNumber() {
		return frameNumber;
	}
		

	//constructor
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
		if(frameNumber == 10) throw new BowlingException();
		else frameNumber++;
	}
	
	//the score of a single frame
	public int score(){
		return firstThrow + secondThrow;
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
		return frameNumber == 10;
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
