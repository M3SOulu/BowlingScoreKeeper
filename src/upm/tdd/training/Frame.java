package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	
	//the score of a single frame
	public int score(){
		return firstThrow + secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return (this.firstThrow == 10);
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return(this.firstThrow != 10 && this.score() == 10);
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		return false;
	}

	//bonus throws
	public int bonus(){
		return this.firstThrow;
	}

}
