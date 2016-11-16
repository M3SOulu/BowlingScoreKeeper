package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private final int MAX_FRAMES = 10;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		if (frames.size() >= MAX_FRAMES)
			throw new BowlingException("Partita terminata.");
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		bonus = new Frame (firstThrow, secondThrow);
	}
	
	public int score() throws BowlingException{
		if (frames.size() < 10)
			throw new BowlingException("Partita non terminata.");
		int i = 0;
		int result = frames.get(i).score();
		for (i = 1; i < frames.size(); ++i){
			result += frames.get(i).score();
			if (frames.get(i-1).isStrike())
				result += frames.get(i).score();
			if (frames.get(i-1).isSpare())
				result += 
		}
		
		if (isNextFrameBonus())
			result += bonus.score();
		
		return result;
	}
	
	public boolean isNextFrameBonus(){
		Frame lastPlayedFrame = frames.get(frames.size()-1);
		return (frames.size() == 10 && lastPlayedFrame.isStrike())
			|| (frames.size() == 10 && lastPlayedFrame.isSpare()) ? true : false;
	}
}
