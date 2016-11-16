package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	private int frameIndex = -1;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frameIndex++;
		frames.add(frameIndex,frame);	
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus() throws BowlingException{
		if(frameIndex<9) throw new BowlingException();
		else{
			Frame tenthFrame = frames.get(10); 
			return tenthFrame.isSpare() || tenthFrame.isStrike();
		}
	}
}
