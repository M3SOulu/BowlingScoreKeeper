package upm.tdd.training.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {

	@Test
	public void playerScoresNineInFirstFrame() {

		Frame frame = new Frame(5, 4);
		assertEquals(frame.score(), 9);
	}

	@Test
	public void playerScoresNineInSecondFrameAndEighteenInTotal() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);

		assertEquals(frame2.score(), 9);
		assertEquals(bowlingGame.score(), 18);
	}

	@Test
	public void playerScoresNineInThirdFrameAndTwentySevenInTotal() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		Frame frame3 = new Frame(5, 4);
		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);

		assertEquals(frame3.score(), 9);
		assertEquals(bowlingGame.score(), 27);
	}

	@Test
	public void playerScoresNineInFourthFrameAndThirtySixInTotal() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		Frame frame3 = new Frame(5, 4);
		Frame frame4 = new Frame(5, 4);
		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);
		bowlingGame.addFrame(frame4);

		assertEquals(bowlingGame.score(), 36);
	}

	@Test
	public void playerScoresNineInTenthFrameAndNintyInTotal() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		Frame frame3 = new Frame(5, 4);
		Frame frame4 = new Frame(5, 4);
		Frame frame5 = new Frame(5, 4);
		Frame frame6 = new Frame(5, 4);
		Frame frame7 = new Frame(5, 4);
		Frame frame8 = new Frame(5, 4);
		Frame frame9 = new Frame(5, 4);
		Frame frame10 = new Frame(5, 4);
		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);
		bowlingGame.addFrame(frame4);
		bowlingGame.addFrame(frame5);
		bowlingGame.addFrame(frame6);
		bowlingGame.addFrame(frame7);
		bowlingGame.addFrame(frame8);
		bowlingGame.addFrame(frame9);
		bowlingGame.addFrame(frame10);

		assertEquals(bowlingGame.score(), 90);
	}

	@Test
	public void playerScoresTenInTotalInFirstFrame() throws BowlingException {
		Frame frame = new Frame(5, 5);
		Frame frame2 = new Frame(5, 4);
		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		assertEquals(bowlingGame.score(), 24);
	}

	@Test
	public void playerScoresTenInTotalInSecondFrame() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 5);
		Frame frame3 = new Frame(5, 4);
		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);

		assertEquals(bowlingGame.score(), 33);
	}

	@Test
	public void playerScoresTenInTotalInThirdFrame() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		Frame frame3 = new Frame(5, 5);
		Frame frame4 = new Frame(5, 4);

		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);
		bowlingGame.addFrame(frame4);

		assertEquals(bowlingGame.score(), 42);
	}

	@Test
	public void playerScoresTenInTotalInLastFrame() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		Frame frame3 = new Frame(5, 4);
		Frame frame4 = new Frame(5, 4);
		Frame frame5 = new Frame(5, 4);
		Frame frame6 = new Frame(5, 4);
		Frame frame7 = new Frame(5, 4);
		Frame frame8 = new Frame(5, 4);
		Frame frame9 = new Frame(5, 4);
		Frame frame10 = new Frame(5, 5);

		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);
		bowlingGame.addFrame(frame4);
		bowlingGame.addFrame(frame5);
		bowlingGame.addFrame(frame6);
		bowlingGame.addFrame(frame7);
		bowlingGame.addFrame(frame8);
		bowlingGame.addFrame(frame9);
		bowlingGame.addFrame(frame10);
		bowlingGame.setBonus(5, 4);

		assertEquals(bowlingGame.score(), 96);
	}

	@Test
	public void thereIsMoreThanOneSpare() throws BowlingException {
		Frame frame = new Frame(5, 4);
		Frame frame2 = new Frame(5, 4);
		Frame frame3 = new Frame(5, 4);
		Frame frame4 = new Frame(5, 4);
		Frame frame5 = new Frame(5, 5);
		Frame frame6 = new Frame(5, 4);
		Frame frame7 = new Frame(5, 4);
		Frame frame8 = new Frame(5, 4);
		Frame frame9 = new Frame(5, 4);
		Frame frame10 = new Frame(5, 5);

		BowlingGame bowlingGame = new BowlingGame();

		bowlingGame.addFrame(frame);
		bowlingGame.addFrame(frame2);
		bowlingGame.addFrame(frame3);
		bowlingGame.addFrame(frame4);
		bowlingGame.addFrame(frame5);
		bowlingGame.addFrame(frame6);
		bowlingGame.addFrame(frame7);
		bowlingGame.addFrame(frame8);
		bowlingGame.addFrame(frame9);
		bowlingGame.addFrame(frame10);
		bowlingGame.setBonus(5, 4);

		assertEquals(bowlingGame.score(), 102);
	}
}
