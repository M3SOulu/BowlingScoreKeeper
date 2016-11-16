package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private final int MAX_FRAMES = 11;
	
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
		if (frames.size() < MAX_FRAMES-1)
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
		
		if (isNextFrameBonus()){
			setBonus(frames.get(MAX_FRAMES).getFirstThrow(), frames.get(MAX_FRAMES).getSecondThrow());
			result += bonus.score();
		}
		
		return result;
	}
	
	public boolean isNextFrameBonus(){
		return (frames.get(MAX_FRAMES-1).isStrike() || frames.get(MAX_FRAMES-1).isSpare()) ? true : false;
	}
}
