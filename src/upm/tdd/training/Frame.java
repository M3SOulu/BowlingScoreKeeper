package upm.tdd.training;

public class Frame {
	// private static int nFrame=0;

	private int firstThrow;
	private int secondThrow;
	

	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		if((firstThrow+secondThrow)>10) throw new BowlingException();
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	// the score of a single frame
	public int score() {
		return firstThrow + secondThrow;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		if (firstThrow == 10)
			return true;
		return false;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		if (!isStrike() && score() == 10)
			return true;
		return false;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		// to be implemented
		return false;
	}

	// get FirstThrow
	public int getFirstThrow() {
		return firstThrow;
	}

	// bonus throws
	public int bonus() {
		return 0;
	}
}
