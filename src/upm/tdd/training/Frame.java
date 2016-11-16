package upm.tdd.training;

public class Frame {
	
	private int firstThrow;
	private int secondThrow;
	private BowlingGame bowlingGameMembership = null;
	
	public Frame(Frame newFrame, BowlingGame bowlingGameMembership) throws BowlingException {
		this(newFrame.firstThrow, newFrame.secondThrow);
		this.bowlingGameMembership = bowlingGameMembership;
	}

	public Frame(int firstThrow, int secondThrow) throws BowlingException {
		if((firstThrow + secondThrow) > 10)
			throw new BowlingException();
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}

	// the score of a single frame
	public int score() {
		return firstThrow + secondThrow + bonus();
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		if (firstThrow == 10)
			return true;
		return false;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		if ((firstThrow + secondThrow) == 10)
			return true;
		return false;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		// to be implemented
		return false;
	}

	// bonus throws
	private int bonus() {
		Frame nextFrame = bowlingGameMembership.getNextFrame(this);
		if(isStrike() && nextFrame != null)
			return (nextFrame.firstThrow + nextFrame.secondThrow);
		if(isSpare() && nextFrame != null)
			return nextFrame.firstThrow;
		return 0;
	}

}
