package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>(10);
	private Frame bonus;
	
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame){
		if(frames.size()==10)throw new CannotCreateAnotherFrame();
		frames.add(frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int temp = 0;
		for(int i=0;i<frames.size();i++){
			temp=frames.get(i).score();
		}
		return temp;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
