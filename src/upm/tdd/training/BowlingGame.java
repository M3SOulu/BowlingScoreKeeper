package upm.tdd.training;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	// a bowling game is made of (at least) 10 frames
	private static final int MAX_PINS = 10;
	private static final int MAX_FRAMES = 10;
	private Frame ScoreFornextFrameForStrike;

	private List<Frame> frames = new ArrayList<Frame>(MAX_FRAMES);
	private Frame bonus=null;

	public BowlingGame() {

	}

	public void addFrame(Frame frame) throws BowlingException {
		if (frames.size() == 10)
			throw new BowlingException();
		frames.add(frame);
	}

	public void setBonus(int firstThrow, int secondThrow) {
		bonus=new Frame(firstThrow,secondThrow);
	}

	public int score(){
		int score = 0;
		for(int i=0;i<10;i++){
			
			
			if(!(frames.get(i).isFirstFrame())&&frames.get(i).isSpare()){
				score+=frames.get(i-1).score()+frames.get(i).score();
			}else if(frames.get(i).isStrike()){
				score+=frames.get(i).score();
				bonus=frames.get(i);
			}else{
				score+=frames.get(i).score();
			}
		}
		
		return score;
	}

	public boolean isNextFrameBonus() {
		// to be implemented
		return false;
	}
}
