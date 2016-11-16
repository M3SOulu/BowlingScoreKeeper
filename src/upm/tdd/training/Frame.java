package upm.tdd.training;

public class Frame {
	private static final int MAX_FRAME_SCORE = 10;

	private int firstThrow;
	private int secondThrow;
	private int bonusThrow;
	private int frameScore;

	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		if (areNotValidThrows()) {
			throw new BowlingException();
		} else {
			this.firstThrow = firstThrow;
			this.secondThrow = secondThrow;
			this.frameScore = this.firstThrow + this.secondThrow;
		}
	}

	// the score of a single frame
	public int score() {
		return frameScore;
	}

	public void addToScore(int score) {
		this.frameScore += score;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		return this.firstThrow == MAX_FRAME_SCORE;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		return (this.firstThrow + this.secondThrow) == MAX_FRAME_SCORE;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		// to be implemented
		return false;
	}

	// bonus throws
	public int bonus() {
		// to be implemented
		return 0;
	}

	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	private boolean areNotValidThrows() {
		return (firstThrow < 0 || firstThrow > 10 || secondThrow < 0 || secondThrow > 10);
	}

	public void addBonusThrow() {
		frameScore += this.bonusThrow;
	}

}
