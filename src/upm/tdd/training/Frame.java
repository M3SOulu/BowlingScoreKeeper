package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	private boolean lastFrame=false;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow(){
		return firstThrow;
	}
	
	public int getSecondThrow(){
		return secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		return firstThrow+secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow==10)
			return true;
		else
			return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if((firstThrow!=10)&&((firstThrow+secondThrow)==10))
			return true;
		else
			return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		return lastFrame;
	}
	
	public void setlastFrame(boolean bl){
		lastFrame=bl;
	}

	//bonus throws
	public int bonus(){
		if(isStrike()){
			return 2;
		}
		else if(isSpare()){
			return 1;
		}
		else
			return 0;
		
	}


}
