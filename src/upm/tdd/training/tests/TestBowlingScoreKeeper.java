package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	static BowlingGame testGame;
	
	public static void initFramesPerfectGame() throws BowlingException{
		testGame = new BowlingGame();
		ArrayList<Frame> frames = new ArrayList<Frame>(11);
		for (int i = 0; i < 10; ++i){
			frames.add(new Frame (10, 0));
		}
		frames.add(new Frame (10, 10));
		for (Frame frame : frames)
			testGame.addFrame(frame);
	}
	
	
	@Test
	public void testMaxScore() throws BowlingException{
		initFramesPerfectGame();
		int score = testGame.score();
		assertEquals (score, 300);
	}
	
	

}
