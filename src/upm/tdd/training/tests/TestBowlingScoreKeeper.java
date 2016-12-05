package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;

public class TestBowlingScoreKeeper {
	static BowlingGame partita;
	static Frame frame;
	@Before
	public void setUp() throws Exception {
		
		partita = new BowlingGame();
		frame = new Frame(10,0);
	}
	
	@Test
	public void birilli_stesi_6_score_6() throws BowlingException {
		Frame frame = new Frame(0,6);
		assertEquals(6,frame.score());
	}
	@Test
	public void primo_lancio_10_strike() throws BowlingException {
		Frame frame = new Frame(10,0);
		assertEquals(true,frame.isStrike());
	}
	
	@Test
	public void birilli_stesi_10_spare() throws BowlingException {
		Frame frame = new Frame(0,10);
		assertEquals(true,frame.isSpare());
	}
	
	@Test
	public void un_frame_3_4_score_7() throws BowlingException {
		Frame frame = new Frame(3,4);
		partita.addFrame(frame);
		assertEquals(7,partita.score());
	}
	@Test
	public void _5_frame_frame_3_4_score_35() throws BowlingException {
		Frame frame = new Frame(3,4);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		assertEquals(35,partita.score());
	}
	@Test
	public void partita_perfetta_100() throws BowlingException {
		Frame frame = new Frame(10,0);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		partita.addFrame(frame);
		//tutti a doppio tranne il primo
		assertEquals(190,partita.score());
	}
	@Test
	public void se_strike_bonus_10_0_2_3_score_20() throws BowlingException {
		Frame frame = new Frame(10,0);
		partita.addFrame(frame);
		frame = new Frame(2,3);
		partita.addFrame(frame);

		assertEquals(20,partita.score());
	}
	
}
