package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;

	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		Frame previous = null;
		Frame previousOfPrevious = null; 
		
		if (frames.size() > 0) {
			previous = frames.get(frames.size()-1);
		} 
		
		if (frames.size() > 1) {
			previousOfPrevious = frames.get(frames.size()-2);
		} 
		
		if (previous.isStrike() && previousOfPrevious.isStrike() && frames.size() > 2) {
			previousOfPrevious.setBonusPoints(previousOfPrevious.getBonusPoints() + frame.getFirstThrow());
		}
		
		if(previous.isStrike()  && frame.isStrike() && frames.size() > 1) {
			previous.setBonusPoints(frame.getFirstThrow());
		} else if (previous.isStrike() && !frame.isStrike()) {
			frame.setBonusPoints(frame.getFirstThrow() + frame.getSecondThrow());
		}
		
		frames.add(frame);
		
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
