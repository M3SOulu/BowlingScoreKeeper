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

//@RunWith(Parameterized.class)
public class TestBowlingScoreKeeper {

	/*
	 * @Parameters public static Collection<Object[]> data() { return
	 * Arrays.asList(new Object[][] { { "IIII" }, { "XXXX" }, { "CCCC" }, {
	 * "XXXX" }, { "MMMM" }, { "VV" }, { "LL" }, { "DD" }, { "IIV" }, { "IIX" },
	 * { "XXL" }, { "XXC" }, { "CCD" }, { "CCM" }
	 * 
	 * }); }
	 */

	Frame[] frame;
	BowlingGame game;

	@Before
	public void initialize() throws BowlingException {
		game = new BowlingGame();
		for (int i = 0; i < 10; i++) {
			frame[i] = new Frame(4, 5);
		}
	}

	@Test
	public void test() throws BowlingException {
		for (int i = 0; i < frame.length; i++) {
			game.addFrame(frame[i]);
		}
	}

}
