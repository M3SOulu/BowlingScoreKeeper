package upm.tdd.training;


public class Frame {
	private static final int MAX_FRAME_SCORE = 10;
	
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return this.firstThrow == MAX_FRAME_SCORE;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return (this.firstThrow + this.secondThrow) == MAX_FRAME_SCORE;
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
