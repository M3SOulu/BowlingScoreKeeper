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
		int frameScore = firstThrow + secondThrow;
		return 0;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		int thisFirstThrow = 10;
		int strike;
		boolean isStrike;
		if (isStrike = true){
			strike = thisFirstThrow + firstThrow + secondThrow;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		
		int spare;
		boolean isSpare;
		if (isSpare = true){
			spare =  firstThrow;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		int strikeBonus = firstThrow + secondThrow;
		int spareBonus =  firstThrow;
		return 0;
	}


}
