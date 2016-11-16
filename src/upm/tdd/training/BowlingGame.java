package upm.tdd.training;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	
	public static final int MAX_SIZE_FRAMES = 10;
	
	// a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus = null;

	public List<Frame> getFrames() {
		return frames;
	}

	public Frame getBonus() {
		return bonus;
	}

	public BowlingGame() {}

	public void addFrame(Frame frame) throws BowlingException {
		if (isNextFrameBonus() && (frames.get(MAX_SIZE_FRAMES-1).isStrike() || frames.get(MAX_SIZE_FRAMES-1).isSpare())) {
			bonus = new Frame(frame, this);
		} else
			frames.add(new Frame(frame, this));
	}

	// set bonus for lastest frame ( frame bonus)
	public void setBonus(int firstThrow, int secondThrow) {
		// to be implemented
	}

	// score game
	public int score() throws BowlingException {
		if(frames.size() < MAX_SIZE_FRAMES)
			throw new BowlingException();
		else {
			if(bonus == null)
				throw new BowlingException();
		}
		
		int result = 0;
		for (Frame frameTemp : frames) {
			result += frameTemp.score();
			System.out.println(result);
		}
			
		return result + ((bonus != null)?bonus.score():0);
	}

	public boolean isNextFrameBonus() throws BowlingException {
		if (frames.size() == MAX_SIZE_FRAMES) {
			if (bonus != null)
				throw new BowlingException();
			else
				return true;
		}
		
		return false;
	}


	public Frame getNextFrame(Frame frame) {
		int indexFrames = frames.indexOf(frame)+1;
		Frame resultFrame = null;
		if(indexFrames < MAX_SIZE_FRAMES)
			resultFrame = frames.get(indexFrames);
		else {
			if(indexFrames == MAX_SIZE_FRAMES)
				resultFrame = bonus;
		}
		return resultFrame;
	}
}
