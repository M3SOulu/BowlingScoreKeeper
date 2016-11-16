package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow) throws BowlingException{
		if(this.firstThrow > 10 || this.secondThrow > 10 || this.firstThrow < 0 ||
			this.secondThrow < 0){
			throw new BowlingException();
		}
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		int score = 0;
		if(isStrike()){
			score = 10 + bonus();
		}
		else if(isSpare()){
			score = this.firstThrow + this.secondThrow;
		}
		else{
			score = this.firstThrow + this.secondThrow;
		}
		
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		boolean res = false;
		if(this.firstThrow == 10){
			res = true;
		}
		return res;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		boolean res = false;
		int tot = 0;
		if(!isStrike()){
			tot = this.firstThrow + this.secondThrow;
		}
		if(tot == 10){
			res = true;
		}
		return res;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		//to be implemented
		return false;
	}

	//bonus throws
	public int bonus(){
		int bonus = 0;
		if(isStrike()){
			bonus = this.secondThrow;
		}
		return bonus;
	}


}
