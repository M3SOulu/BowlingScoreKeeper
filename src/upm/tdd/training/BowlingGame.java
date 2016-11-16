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
	
	public void addFrame(Frame frame){
		if(frameNumber > 10){
			if(frameNumber == 10){
				if
			}
		}
		frames.add(frame);	
		frameNumber ++;
	}
	
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		bonus = new Frame(firstThrow,secondThrow);
	}
	
	public int score() throws BowlingException{
		if(frames.size()<10) throw new BowlingException();
		
		int totScore = 0;
		
		int bonusThrowsNum = 0;
		
		for(Frame f : frames){
			switch(bonusThrowsNum){
			case 1: totScore += f.getFirstThrow();
			case 2: totScore += f.score();
			}
			totScore += f.score();
			if(f.isSpare()) bonusThrowsNum = 1;
			else if(f.isStrike()) bonusThrowsNum = 2;
			else bonusThrowsNum = 0;
		}
		
		if(totScore>0 && bonus == null) throw new BowlingException();
		switch(bonusThrowsNum){
		case 1: totScore += bonus.getFirstThrow();
		case 2: totScore += bonus.score();
		}
		
		return totScore;
	}
	
	public boolean isNextFrameBonus(){

		return false;
	}
}
