package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.Test;

import upm.tdd.training.BowlingGame;

public class TestBowlingScoreKeeper {
	
	BowlingGame game = new BowlingGame();
	
	@Test
	public void testScoreNormal() {
		//game.getFrames().get(0).setFirstThrow(2);
		//game.getFrames().get(0).setSecondThrow(2);
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
