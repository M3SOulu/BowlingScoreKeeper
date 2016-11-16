package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int frameNumber = 0;
	
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frameNumber > 10){
			if(frameNumber == 10){
				if(frame.bonus() == 0) throw new BowlingException();
				else setBonus(frame);
			}
			else throw new BowlingException();
		}
		frames.add(frame);	
		frameNumber++;
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public void setBonus(Frame bonus) {
		this.bonus = bonus;
	}
	
	public int score() throws BowlingException{
		//if(frames.size() < 10) throw new BowlingException();
		
		int totScore = 0;
		
		int bonusThrowsNum = 0;
		
		for(Frame f : frames){
			switch(bonusThrowsNum){
			case 1: totScore += f.getFirstThrow();
			case 2: totScore += f.score();
			}
			totScore += f.score();
			bonusThrowsNum = f.bonus();
		}
		
		if(bonusThrowsNum > 0) {
			//if(bonus == null) throw new BowlingException();
			switch(bonusThrowsNum){
			case 1: totScore += bonus.getFirstThrow();
			case 2: totScore += bonus.score();
			}
		}
		
		return totScore;
	}
	
	public boolean isNextFrameBonus(){

		return false;
	}
}
