package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int bonusThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondThrow) {
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		return this.firstThrow + this.secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return this.firstThrow == 10;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return (this.firstThrow + this.secondThrow == 10) && this.secondThrow != 0;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		return this.score() + this.bonusThrow;
	}
}
