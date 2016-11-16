package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	
	public int getFirstThrow(){
		return this.firstThrow;
	}
	
	public int getSecondThrow(){
		return this.secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		return firstThrow + secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		return (firstThrow == 10);
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		return this.score()==10;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		int bonus = 0;
		if(this.isSpare()){
			bonus = this.firstThrow;
		}else{
			if(this.isStrike())
				bonus = this.score();
		}
		return bonus;
	}


}
