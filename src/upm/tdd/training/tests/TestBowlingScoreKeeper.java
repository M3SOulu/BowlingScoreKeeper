package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	BowlingGame testGame = new BowlingGame();
	
	public void initFrames() throws BowlingException{
		ArrayList<Frame> frames = new ArrayList<Frame>();
		for (int i = 0; i < 10; ++i){
			frames.add(i, new Frame (1, 1));
		}
		for (Frame frame : frames)
			testGame.addFrame(frame);
		//testGame.setFrames(frames);
	}
	
	@Test
	public void testScore() throws BowlingException{
		int score = testGame.score();
		assertEquals (score, 21);
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
