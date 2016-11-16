package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		frames.add(frame);
		if(frame.isStrike()) {
			frame.setBonusPoints(frame.tiroSuccessivo + frame.tiroSuccessivoAlSuccesivo);
		}
		if (frame.isSpare()) {
			frame.setBonusPoints(frame.tiroSuccessivo);
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		Frame previous = frames.get(frames.size()-2);
		
		if(previous.isStrike()) {
			previous.setBonusPoints(firstThrow + secondThrow);
		} else if(previous.isSpare()) {
			previous.setBonusPoints(firstThrow);
		}
	}
	
	public int score(){
		int totalScore = 0;
		for(Frame f: frames) {
			totalScore += f.score();
		}
		return totalScore;
	}
	
	public boolean isNextFrameBonus(){
		Frame actual = frames.get(frames.size()-1);
		if(actual.isSpare() || actual.isStrike() ) {
			return true;
		}
		return false;
	}
	
	public void setBonus(Frame next, Frame next2) {
		
	}
	
}
