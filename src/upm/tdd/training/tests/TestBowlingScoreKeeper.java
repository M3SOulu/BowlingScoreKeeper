package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import upm.tdd.training.BowlingGame;

public class TestBowlingScoreKeeper {

	BowlingGame partita=new BowlingGame();
	
	@After
	public void setUp(){
		Frame frame=new Frame();
	}
	
	@Test
	public void test() {
		partita.addFrame(frame);
	}

}
