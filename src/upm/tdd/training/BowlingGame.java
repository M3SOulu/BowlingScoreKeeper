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
		if (frames.size() < 10) {
			frames.add(frame);
		} else {
			throw new BowlingException();
		}
	}

	// set the attribute "bonus"
	public void setBonus(int firstThrow, int secondThrow) {
		if (this.isNextFrameBonus()) {
			if (frames.get(frames.size() - 1).isSpare()) {
				this.bonus = new Frame(firstThrow, 0);
			} else {
				this.bonus = new Frame(firstThrow, secondThrow);
			}
		} else {
			bonus = null;
		}
	}

	// sign the total score of the match until last frame
	public int score() {
		int result = 0;

		if (frames.get(0).isSpare()) {
			result = frames.get(0).score() + frames.get(1).getFirstThrow() + frames.get(1).score();
		} else {

			for (Frame frame : frames) {

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
