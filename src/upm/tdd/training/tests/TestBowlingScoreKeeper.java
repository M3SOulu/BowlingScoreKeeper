package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.awt.Frame;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingGame;

public class TestBowlingScoreKeeper {

	BowlingGame partita=new BowlingGame();
	Frame frame1=new Frame();
	
	@Before
	public void setUp(){
		partita.addFrame(frame1);
	}
	
	@Test
	public void test() {
		
	}

}
