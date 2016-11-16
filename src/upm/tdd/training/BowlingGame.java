package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame){
		frames.add(frame);	
	}
	
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		bonus = new Frame(firstThrow,secondThrow);
	}
	
	public int score(){
		int totScore = 0;
		int bonusThrowsNum = 0;
		for(Frame f : frames){			
			totScore += f.score();
			if(f.isSpare()) totScore += 
		}
		return totScore;
	}
	
	public boolean isNextFrameBonus(){
		
		return false;
	}
}
