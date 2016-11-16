package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	
	BowlingGame game = new BowlingGame();
	
	@Test
	public void testScoreNormal() {
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
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		assertEquals(game.score(), 33);
	}
	
	@Test
	public void testF1Score() {
		Frame f1 = new Frame(2,2);
		game.addFrame(f1);
		assertEquals(game.getFrames().get(0).score(), 4);
	}
	
	@Test
	public void testScoreSpare() {
		Frame f1 = new Frame(0,0);
		Frame f2 = new Frame(1,9);
		Frame f3 = new Frame(1,0);
		Frame f4 = new Frame(4,6);
		Frame f5 = new Frame(2,1);
		Frame f6 = new Frame(0,0);
		Frame f7 = new Frame(0,0);
		Frame f8 = new Frame(0,0);
		Frame f9 = new Frame(0,0);
		Frame f10 = new Frame(0,0);
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		assertEquals(game.score(), 27);
	}
	
	@Test
	public void testScoreStrikeAndSpare() {
		Frame f1 = new Frame(10,0);
		Frame f2 = new Frame(1,9);
		Frame f3 = new Frame(1,0);
		Frame f4 = new Frame(4,6);
		Frame f5 = new Frame(2,1);
		Frame f6 = new Frame(0,0);
		Frame f7 = new Frame(0,0);
		Frame f8 = new Frame(0,0);
		Frame f9 = new Frame(0,0);
		Frame f10 = new Frame(0,0);
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		assertEquals(game.score(), 47);
	}
	
	@Test
	public void testScoreStrikeAndSpareAn() {
		Frame f1 = new Frame(10,0);
		Frame f2 = new Frame(1,9);
		Frame f3 = new Frame(1,0);
		Frame f4 = new Frame(4,6);
		Frame f5 = new Frame(2,1);
		Frame f6 = new Frame(0,0);
		Frame f7 = new Frame(0,0);
		Frame f8 = new Frame(0,0);
		Frame f9 = new Frame(0,0);
		Frame f10 = new Frame(0,0,1);
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		assertEquals(game.score(), 47);
	}
	
	@Test
	public void testScoreStrikeAndSpareAn() {
		Frame f1 = new Frame(10,0);
		Frame f2 = new Frame(1,9);
		Frame f3 = new Frame(1,0);
		Frame f4 = new Frame(4,6);
		Frame f5 = new Frame(2,1);
		Frame f6 = new Frame(0,0);
		Frame f7 = new Frame(0,0);
		Frame f8 = new Frame(0,0);
		Frame f9 = new Frame(0,0);
		Frame f10 = new Frame(10,0,1);
		game.addFrame(f1);
		game.addFrame(f2);
		game.addFrame(f3);
		game.addFrame(f4);
		game.addFrame(f5);
		game.addFrame(f6);
		game.addFrame(f7);
		game.addFrame(f8);
		game.addFrame(f9);
		game.addFrame(f10);
		assertEquals(game.score(), 58);
	}
}
