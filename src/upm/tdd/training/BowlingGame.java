package upm.tdd.training;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {

	// a bowling game is made of (at least) 10 frames
	private static final int MAX_FRAMES_SIZE = 10;
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame() {
	}

	public void addFrame(Frame frame) throws BowlingException {
		if (frames.size() == MAX_FRAMES_SIZE) {
			throw new BowlingException();
		} else {
			frames.add(new Frame(frame.getFirstThrow(), frame.getSecondThrow()));
		}
	}

	public void setBonus(int firstThrow, int secondThrow) {
		// to be implemented
	}

	public int score() {
		// to be implemented
		return 0;
	}

	public boolean isNextFrameBonus() {
		// to be implemented
		return false;
	}
}
