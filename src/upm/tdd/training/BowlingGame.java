package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private final int MAX_FRAMES = 10;
	private final int 
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		if (frames.size() >= MAX_FRAMES)
			throw new BowlingException();
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		Frame lastPlayedFrame = frames.get(frames.size()-1); 
		if (lastPlayedFrame.isStrike())
			bonus = new Frame(firstThrow, secondThrow);
		if (lastPlayedFrame.isSpare())
			bonus = new Frame (firstThrow, 0);
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
