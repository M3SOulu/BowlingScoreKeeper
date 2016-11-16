package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() <= 10) {
			frames.add(frame);
		} else {
			throw new BowlingException();
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		for()
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		boolean result = false;
		Frame previous = frames.get(index)
		
		for(Frame bowl: this.frames) {
			if(bowl.isSpare() || bowl.isStrike()) {
				
			}
		}
		return false;
	}
	
	public Frame getPreviousFrame() {
		Frame previous = null;
		
		for(Frame frame: frames) {
			if(frame.equals(this)) {
				previous = frames.get()
			}
		}
		
	}
	
	public List<Frame> getFrameList() {
		return this.frames;
	}
}
