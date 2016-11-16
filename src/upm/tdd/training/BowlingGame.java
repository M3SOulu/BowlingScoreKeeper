package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	static private int score=0;
	
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame){
		frames.add(frames.size(), frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow){
		bonus=new Frame(firstThrow,secondThrow);
	}
	
	public int score(){
		if(frames.get(frames.size()-1).isSpare()){
			score=score+bonus.getFirstThrow();
		}
		else if(frames.get(frames.size()-1).isStrike()){
			score=score+bonus.getFirstThrow()+bonus.getSecondThrow();
		}else
			score=score+frames.get(frames.size()-1).score();
		return score;
	}
	
	public boolean isNextFrameBonus(){
		if(frames.get(frames.size()-1).isSpare()||frames.get(frames.size()-1).isStrike())
			return true;
		else
			return false;
	}
}
