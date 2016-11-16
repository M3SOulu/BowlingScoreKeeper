package upm.tdd.training.tests;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	public BowlingGame game;
	public Frame frame;
	
	@Before
	public void setUp(){
		game = new BowlingGame();
	}
	
	@Test
	public void firstFrameSimpleScore() {
		//Act
		frame = new Frame(4,3);
		game.addFrame(frame);
		int score = game.score();
		
		//Assert
		assertTrue("score is 7", score == 7);
	}
	
	@Test
	public void firstFrameIsStrike() {
		//Act
		frame = new Frame(10,0);
		game.addFrame(frame);
		Frame frame1 = new Frame(4,3);
		game.addFrame(frame1);
		
		//Assert
		assertTrue("score is 17", frame.score() == 17);
	}
	
	@Test
	public void firstFrameIs4_2AndSecondIsSpare() {
		//Act
		frame = new Frame(4,2);
		game.addFrame(frame);
		Frame frame1 = new Frame(4,6);
		game.addFrame(frame1);
		Frame frame2 = new Frame(3,1);
		game.addFrame(frame2);
		int score = frame1.score();
		
		//Assert
		assertTrue("score is 13", frame1.score() == 13);
	}

}
