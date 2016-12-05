package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		this.frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	//h
	public int score(){
		boolean isStrike = false;
		boolean isSpare = false;
		int score = frames.get(0).score();
		for(int i = 1; i < frames.size();i++){
			if(frames.get(i-1).isStrike()){
				score += (frames.get(i).score());
			}
			if(frames.get(i-1).isSpare()){
				score += frames.get(i).bonus();
			}
			score += frames.get(i).score();
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
	return true;
	}
}
