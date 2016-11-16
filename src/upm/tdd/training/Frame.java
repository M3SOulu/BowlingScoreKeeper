package upm.tdd.training;

public class Frame {

	private static int frameCounterGlobal = 0;
	private int firstThrow;
	private int secondThrow;
	private int frameNumber;

	public Frame(int firstThrow, int secondThrow) {
		if (this.firstThrow == 10) {
			this.firstThrow = firstThrow;
		} else {
			
			this.firstThrow = firstThrow;
			this.secondThrow = secondThrow;
		}

		
		frameNumber = frameCounterGlobal++;

	}

	public Frame(int firstThrow) {
		this.firstThrow = 10;
		this.secondThrow = 0;
	}

	public int getFirstThrow() {
		return this.firstThrow;
	}

	public int getSecondThrow() {
		return this.secondThrow;
	}

	// the score of a single frame
	public int score() {
		if (this.firstThrow + this.secondThrow == 20) {
			return 10;
		}
		return this.firstThrow + this.secondThrow;
	}

	// returns whether the frame is a strike or not
	public boolean isStrike() {
		if (this.firstThrow == 10) {
			return true;
		}
		return false;
	}

	// return whether a frame is a spare or not
	public boolean isSpare() {
		if (this.firstThrow + this.secondThrow == 10) {
			return true;
		}
		return false;
	}

	// return whether this is the last frame of the match
	public boolean isLastFrame() {
		if (this.frameNumber == 10) {
			return true;
		}
		return false;
	}

	public boolean isFirstFrame() {
		if (this.frameNumber == 0) {
			return true;
		}
		return false;
	}

	// bonus throws
	public int bonus() {

		return 0;
	}

}
