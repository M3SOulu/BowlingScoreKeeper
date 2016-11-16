package upm.tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import upm.tdd.training.BowlingException;
import upm.tdd.training.BowlingGame;
import upm.tdd.training.Frame;




public class TestBowlingGame {

	BowlingGame bg = new BowlingGame();
	Frame f1,f2,f3,f4,f5,f6,f7,f8,f9,f10; 
	
	@Before
	public void init() throws BowlingException{
		f1 = new Frame(1,4);
		f2 = new Frame(4,5); 
		f3 = new Frame(6,4); 
		f4 = new Frame(5,5); 
		f5 = new Frame(10,0); 
		f6 = new Frame(0,1); 
		f7 = new Frame(7,3); 
		f8 = new Frame(6,4); 
		f9 = new Frame(10,0); 
		f10 = new Frame(2,8); 
	}	
	@Test
	public void testAddFrame() {
		bg.addFrame(f1);
		assert(bg.getList().size()==1);
		
	}

}
