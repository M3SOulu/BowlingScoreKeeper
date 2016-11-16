package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() < 10) {
			frames.add(frame);
		} else {
			throw new BowlingException();
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		if(firstThrow + secondThrow == 10) {

		}
	}
	
	public int score(){
		int accumulatore = 0;
		
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		boolean result = false;
		int index = 0;

		
		return false;
	}
}
