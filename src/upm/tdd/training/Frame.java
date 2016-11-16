package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	int points = 0;
	
	public Frame(int firstThrow, int secondThrow){
		this.setFirstThrow(firstThrow);
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		points += (getFirstThrow() + secondThrow);
		return points;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(getFirstThrow() == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(getFirstThrow() >=0 && getFirstThrow() <9 && secondThrow == (10 - getFirstThrow()))
			return true;
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		
		return false;
	}

	//bonus throws (1=true,0=false)
	public int bonus(){
		if(isSpare())
			return 1;
		else if(isStrike() || isSpare())
			return 2;
		return 0;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public void setFirstThrow(int firstThrow) {
		this.firstThrow = firstThrow;
	}


}
