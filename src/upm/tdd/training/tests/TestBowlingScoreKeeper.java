package upm.tdd.training.tests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import upm.tdd.training.BowlingGame;


//@RunWith(Parameterized.class)
public class TestBowlingScoreKeeper {
	
	/*@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] { { "IIII" }, { "XXXX" }, { "CCCC" }, { "XXXX" }, { "MMMM" }, { "VV" },
				{ "LL" }, { "DD" }, { "IIV" }, { "IIX" }, { "XXL" }, { "XXC" }, { "CCD" }, { "CCM" }

		});
	}*/
	

	@Test
	public void test() {
		BowlingGame game = new BowlingGame();
	}

}
