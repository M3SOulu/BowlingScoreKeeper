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
	public boolean isStrike(){   //10 pins in one throws
		int strike, nextOneThrows = 0, nextSecondThrow = 0;
		boolean isStrike;
		firstThrow = 10;
		if (isStrike = true){
			strike = firstThrow + nextOneThrows + nextSecondThrow;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){   //10 pins in two throws
		int spare, nextOneThrows = 0;
		boolean isSpare;
		if (isSpare = true){
			spare =  firstThrow + secondThrow + nextOneThrows;
		}
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		
		return false;
	}

	//bonus throws
	public int bonus(){
		int strikeBonus;
		if( isStrike() = true){
			strikeBonus = firstThrow + secondThrow;
		}
		int spareBonus =  firstThrow;
		return 0;
	}


}
