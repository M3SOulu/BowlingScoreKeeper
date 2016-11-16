package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private final int MAX_FRAMES = 10;
	
	public BowlingGame(){}
	
/*	public void setFrames(ArrayList<Frame> frames){
		this.frames = frames;
	}
*/	
	public void addFrame(Frame frame) throws BowlingException{
		if (frames.size() >= MAX_FRAMES)
			throw new BowlingException("Partita terminata.");
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		if (frames.get(frames.size()-1).isStrike())
			bonus = new Frame (firstThrow, secondThrow);
		if (frames.get(frames.size()-1).isSpare())
			bonus = new Frame (firstThrow, 0);
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
				result += frames.get(i).getFirstThrow();
		}
		
		if (isNextFrameBonus())
			result += bonus.score();
		
		return result;
	}
	
	public boolean isNextFrameBonus(){
		Frame lastPlayedFrame = frames.get(frames.size()-1);
		return (frames.size() == MAX_FRAMES && lastPlayedFrame.isStrike())
			|| (frames.size() == MAX_FRAMES && lastPlayedFrame.isSpare()) ? true : false;
	}
}
