package upm.tdd.training.tests;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	
	BowlingGame game = new BowlingGame();
	
	@Before
	public void setUp(){
		Frame f1 = new Frame(2,2);
		Frame f2 = new Frame(1,2);
		Frame f3 = new Frame(1,2);
		Frame f4 = new Frame(4,3);
		Frame f5 = new Frame(0,5);
		Frame f6 = new Frame(6,0);
		Frame f7 = new Frame(1,1);
		Frame f8 = new Frame(0,0);
		Frame f9 = new Frame(0,0);
		Frame f10 = new Frame(1,2);
		game.addFrame(f1);
	}
	
	@Test
	public void testScoreNormal() {
		game.getFrames().get(0).setFirstThrow(2);
		game.getFrames().get(0).setSecondThrow(2);
		game.getFrames().get(1).setFirstThrow(1);
		game.getFrames().get(1).setSecondThrow(2);
		game.getFrames().get(2).setFirstThrow(1);
		game.getFrames().get(2).setSecondThrow(2);
		game.getFrames().get(3).setFirstThrow(4);
		game.getFrames().get(3).setSecondThrow(3);
		game.getFrames().get(4).setFirstThrow(0);
		game.getFrames().get(4).setSecondThrow(5);
		game.getFrames().get(5).setFirstThrow(6);
		game.getFrames().get(5).setSecondThrow(0);
		game.getFrames().get(6).setFirstThrow(1);
		game.getFrames().get(6).setSecondThrow(1);
		game.getFrames().get(7).setFirstThrow(0);
		game.getFrames().get(7).setSecondThrow(0);
		game.getFrames().get(8).setFirstThrow(0);
		game.getFrames().get(8).setSecondThrow(0);
		game.getFrames().get(9).setFirstThrow(1);
		game.getFrames().get(9).setSecondThrow(2);
		assertEquals(game.score(), 33);
	}
	
	@Test
	public void testScoreSpare() {
		game.getFrames().get(0).setFirstThrow(0);
		game.getFrames().get(0).setSecondThrow(0);
		game.getFrames().get(1).setFirstThrow(1);
		game.getFrames().get(1).setSecondThrow(9);
		game.getFrames().get(2).setFirstThrow(1);
		game.getFrames().get(2).setSecondThrow(0);
		game.getFrames().get(3).setFirstThrow(4);
		game.getFrames().get(3).setSecondThrow(6);
		game.getFrames().get(4).setFirstThrow(2);
		game.getFrames().get(4).setSecondThrow(1);
		game.getFrames().get(5).setFirstThrow(0);
		game.getFrames().get(5).setSecondThrow(0);
		game.getFrames().get(6).setFirstThrow(0);
		game.getFrames().get(6).setSecondThrow(0);
		game.getFrames().get(7).setFirstThrow(0);
		game.getFrames().get(7).setSecondThrow(0);
		game.getFrames().get(8).setFirstThrow(0);
		game.getFrames().get(8).setSecondThrow(0);
		game.getFrames().get(9).setFirstThrow(0);
		game.getFrames().get(9).setSecondThrow(0);
		assertEquals(game.score(), 27);
	}
}
