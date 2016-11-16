package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	private int frameIndex = 0;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);	
		frameIndex++;
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public int score(){
		int totScore = 0;
		for(Frame f : frames){
			
		}
		return totScore;
	}
	
	public boolean isNextFrameBonus(){
		
		return false;
	}
}
