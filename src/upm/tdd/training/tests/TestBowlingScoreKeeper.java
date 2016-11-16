package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;


public class TestBowlingScoreKeeper {

	Frame[] frame = new Frame[10];
	BowlingGame game;

	@Before
	public void initialize() throws BowlingException {
		game = new BowlingGame();
		for (int i = 0; i < 10; i++) {
			frame[i] = new Frame(4, 5);
		}
		for (int i = 0; i < frame.length; i++) {
			game.addFrame(frame[i]);
		}
	}

	@Test
	public void test() {
		for (Frame frame2 : frame) {
			System.out.println(frame2.score());
		}
		
		
	}

}
