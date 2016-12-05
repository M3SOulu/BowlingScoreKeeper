package upm.tdd.training;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	// a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame() {

	}

	// add a new frame in frames
	public void addFrame(Frame frame) throws BowlingException {
		if (frames.size() <= 10) {
			frames.add(frame);
		} else {
			throw new BowlingException();
		}
	}

	// set the attribute "bonus"
	public void setBonus(int firstThrow, int secondThrow) {
		this.bonus = new Frame(firstThrow, secondThrow);
	}

	// sign the total score of the match until last frame
	public int score() throws BowlingException {
		int result = 0;

		for (Frame frame : frames) {
			if (frame.isSpare() && frames.indexOf(frame) == 9) {
				result += frame.score() + bonus.getFirstThrow();
			} else if (frame.isSpare()) {
				result += frame.score() + frames.get(frames.indexOf(frame) + 1).getFirstThrow();
			} else {
				result += frame.score();
			}
		}

		return result;
	}

	// check if the next frame is a bonus frame
	public boolean isNextFrameBonus() {
		boolean result = false;

		if (frames.get(frames.size() - 1).isStrike() || frames.get(frames.size() - 1).isSpare()) {
			result = true;
		}

		return result;
	}
}
