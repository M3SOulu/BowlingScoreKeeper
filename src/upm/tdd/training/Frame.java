package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return this.firstThrow;
	}
	
	public int getSecondThrow() {
		return this.secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		//to be implemented
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		boolean result = false;
		
		if(firstThrow == 10) {
			result = true;
		}
		
		return result;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		boolean result = false;
		
		if((firstThrow + secondThrow) == 10) {
			result = true;
		}
		
		return result;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		
		return 0;
	}

}
