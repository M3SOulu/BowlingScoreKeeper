package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int nFrame;
	private int bonusPoints;

	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	
	//the score of a single frame
	public int score(){
		return firstThrow + secondThrow + bonusPoints;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(firstThrow == 10) {
			return true;
		}
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(firstThrow != 10 && firstThrow + secondThrow == 10) {
			return true;
		}		
		return false;
	}

	//return whether this is the last frame of the match
	public boolean isLastFrame(){
		if(nFrame == 10) {
			return true;
		}
	
		return false;
	}

	//bonus throws
	public int bonus(){
		if(this.isLastFrame()) {
			
		}
		return 0;
	}

	public int getFirstThrow() {
		return this.firstThrow;
	}
	
	public int getSecondThrow() {
		return this.secondThrow;
	}
	
	public void setNFrame(int n) {
		n = this.nFrame;
	}
	
	public void setBonusPoints(int bonus) {
		bonus = this.bonusPoints;
	}

}
