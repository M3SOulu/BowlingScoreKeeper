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
			// add new frame to the game
			frames.add(new Frame(frame.getFirstThrow(), frame.getSecondThrow()));

			/*
			 * if frame before the actual was a spare, add to the previous frame
			 * the point of the actual frames' first throw
			 */

			if (frames.get(frames.size() - 1).isSpare()) {
				
			}

		}
	}

	public void setBonus(int firstThrow, int secondThrow) {
		// to be implemented
	}

	// the score of entire game
	public int score() throws BowlingException {
		if (frames.size() != MAX_FRAMES_SIZE) {
			throw new BowlingException();
		} else {
			return frames.get(MAX_FRAMES_SIZE).score();
		}
	}

	public boolean isNextFrameBonus() {
		// to be implemented
		return false;
	}
}
