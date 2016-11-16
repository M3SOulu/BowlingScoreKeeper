package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	int points = 0;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		points += (firstThrow + secondThrow);
		return points;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10)
			return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(firstThrow >=0 && firstThrow <9 && secondThrow == (10 - firstThrow))
			return true;
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		
		return false;
	}

	//bonus throws (1=true,0=false)
	public int bonus(){
		if(isStrike() || isSpare())
			return 1;
		return 0;
	}


}
