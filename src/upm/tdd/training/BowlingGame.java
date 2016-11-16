package upm.tdd.training;

import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	// a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame() {
	}

	public void addFrame(Frame frame) throws BowlingException {
		if (frame.score() > 10)
			throw new BowlingException();
		if (frames.size() >= 10)
			throw new BowlingException();
		frames.add(frame);
	}

	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		bonus = new Frame(firstThrow, secondThrow);
	}

	public int score() throws BowlingException {
		int res = 0;
		int count = 0;
		Frame next;
		for (Frame f : frames) {
			res += f.score();
			if (!isLastFrame(f)) {
				// prendo l'elemento di posizione count e successivamente
				// aggiorno count
				next = frames.get(++count);
				if (f.isStrike()) {
					res += next.score();
					if (next.getFirstThrow() == 10) {
						if (isLastFrame(next))
							res += bonus.getFirstThrow();
						else
							res += frames.get(count + 1).getFirstThrow();
					}
				}
				if (f.isSpare())
					res += next.getFirstThrow();
			}
		}
		if (isNextFrameBonus()) {
			if (frames.get(9).isStrike())
				res += bonus.bonus();
			else
				res += bonus.getFirstThrow();
		}
		if (res > 300)
			throw new BowlingException();
		return res;
	}

	public boolean isNextFrameBonus() {
		if (frames.size() == 10 && frames.get(9).score() == 10)
			return true;
		return false;
	}
	
	private boolean isLastFrame(Frame frame){
		if (frames.size() == 10 && frames.get(9) == frame)
			return true;
		return false;
	}

}
