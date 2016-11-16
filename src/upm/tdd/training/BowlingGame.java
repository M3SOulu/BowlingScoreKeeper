package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>(10);
	private Frame bonus;
	static private int Throws=0;
	static private int score=0;
	
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame){
		frames.add(Throws++, frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow){
		
	}
	
	public int score(){
		if(frames.get(frames.size()-1).isSpare()){
			score=score+frames.get(frames.size()).getFirstThrow();
		}
		else{
			score=score+frames.get(frames.size()).getFirstThrow()+frames.get(frames.size()).getSecondThrow();
		}
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
