package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	
	public static void initFrames() throws BowlingException{
		BowlingGame testGame = new BowlingGame();
		ArrayList<Frame> frames = new ArrayList<Frame>();
		for (int i = 0; i < 10; ++i){
			frames.add(i, new Frame (0, 0));
		}
		for (Frame frame : frames)
			testGame.addFrame(frame);
	}
	
	@Test
	public void testScore() throws BowlingException{
		initFrames();
		int score = testGame.score();
		assertEquals (score, 0);
	}

}
