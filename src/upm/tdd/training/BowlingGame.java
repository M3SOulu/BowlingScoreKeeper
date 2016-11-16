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
		frame.setBonusPoints(49);
		if (frames.size() > 0) {
			previous = frames.get(frames.size()-1);
		
		} 
		
		if (frames.size() > 1) {
			previousOfPrevious = frames.get(frames.size()-2);
		} 
		
		if (frames.size() > 1 && previous.isStrike() && previousOfPrevious.isStrike()) {
			previousOfPrevious.setBonusPoints(previousOfPrevious.getBonusPoints() + frame.getFirstThrow());
		}
		
		if(frames.size() > 0 && previous.isStrike()  && frame.isStrike() ) {
			previous.setBonusPoints(frame.getFirstThrow());
		} else if (frames.size() > 0 && previous.isStrike() && !frame.isStrike()) {
			previous.setBonusPoints(frame.getFirstThrow() + frame.getSecondThrow());
		} else if (frames.size() > 0 && previous.isSpare()) {
			previous.setBonusPoints(frame.getFirstThrow());
		}
		frames.add(frame);
		
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//TO DO
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
	
}
