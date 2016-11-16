package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int gameScore;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		//to be implemented
				
		if(frames.isEmpty()){
			addFirstFrame(frame);
		}else if(frames.get(frames.size()-1).isStrike()){
			addFrameWithPreviousFrameStrike(frame);
		}else if(frames.get(frames.size()-1).isSpare()){
			addFrameWithPreviousFrameSpare(frame);
		}else{
			frames.add(frame);
			gameScore += frame.score();
		}
		
		if(frame.isLastFrame()){
			if(frame.getFirstThrow() == 10 || frame.getFirstThrow()+frame.getSecondThrow() == 10){
				
			}
			else {
				//Frame tempFrame = new
				//addFrame(tempFrame);
				//setBonus(frame.getFirstThrow(),frame.getSecondThrow());
			}
		}

	}
	
	private Frame getLastFrame(){
		Frame f = Frame.createSupportFrame(frames.get(frames.size()-1).getFirstThrow(),frames.get(frames.size()-1).getSecondThrow());
	
		return f;
	}
	
	private void addFirstFrame(Frame frame){
		frame.setScore();
		frames.add(frame);
		gameScore += frame.score();
	}
	
	private void addFrameWithPreviousFrameSpare(Frame frame){
		//da controllare
		Frame f = getLastFrame();
		int bonus = f.getFirstThrow();
		frame.setScoreWithBonus(bonus);
		gameScore += frame.score();
	}
	
	private void addFrameWithPreviousFrameStrike(Frame frame){
		Frame f = getLastFrame();
		if (f.getFrame() == 1){
			
		}else/*(frames.get(frames.indexOf(f)-1).isStrike())*/{
			addFrameWithPreviousFrameStrike(f);
		}
		int bonus = f.getFirstThrow()+f.getSecondThrow();
		frame.setScoreWithBonus(bonus);
		gameScore += frame.score();
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		bonus = new Frame(firstThrow,secondThrow);
	}
	
	public int score(){
		return gameScore;
	}
	
	public boolean isNextFrameBonus(){
		return false;
	}
}
