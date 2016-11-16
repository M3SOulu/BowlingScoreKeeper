package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		if(frames.size() == 0){
			frames.add(frame);
		}else{
			if(!isNextFrameBonus()){
				frames.add(frame);
			}else{
				
			}
		}
		this.frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		bonus = new Frame(firstThrow,secondThrow);
	}
	
	public int score(){
		//to be implemented
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		return(frames.get(frames.size()).bonus() != 0);
	}
}
