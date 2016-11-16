package upm.tdd.training;


public class Frame {
	private int firstThrow;
	private int secondThrow;
	private int thirdThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getThirdThrow() {
		return this.thirdThrow;
	}
	
	public void setThirdThrow(int thirdThrow) {
		this.thirdThrow = thirdThrow;
	}
	
	public int getFirstThrow() {
		return this.firstThrow;
	}
	
	public int getSecondThrow() {
		return this.secondThrow;
	}
	
	//the score of a single frame
	public int score(){
		int score = 0;
		
		if(this.isSpare()) {
			score = (this.firstThrow + this.secondThrow + this.bonus());
		} else if(this.isStrike()) {
			score = (this.firstThrow + this.bonus());
		} else {
			score = (this.firstThrow + this.secondThrow);
		}
		
		return score;
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
		boolean result = false;
		
		
		return result;
	}

	//bonus throws
	public int bonus(){
		int result = 0;
		BowlingGame bowlingGame = new BowlingGame();
		
		if(this.isSpare()) {
			result = 
		}
		
		return 0;
	}

}
