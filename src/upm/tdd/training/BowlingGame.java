package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	//private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame f1){
		frames.add(f1);
	}
	
	public void setBonus() {
		for(int i=0;i<getFrames().size()-1;i++){
			if(getFrames().get(i).bonus() == 1)
				getFrames().get(i).points += getFrames().get(i+1).getFirstThrow();
			else if(getFrames().get(i).bonus() == 2)
				getFrames().get(i).points += (getFrames().get(i+1).getFirstThrow() + getFrames().get(i+1).getSecondThrow());
		}
	}
	
	public void setFinalBonus(){
			if(getFrames().get(9).bonus() != 0){
				getFrames().get(9).points += getFrames().get(9).getThirdThrow();
			}
	}
	
	public int score(){
		int totScore = 0;
		setBonus();
		setFinalBonus();
		for(int i=0;i<getFrames().size();i++){
			totScore += getFrames().get(i).score();
		}
		return totScore;
	}
	
	public boolean isNextFrameBonus(){
		return false;
	}

	public List<Frame> getFrames() {
		return frames;
	}

	public void setFrames(List<Frame> frames) {
		this.frames = frames;
	}
}
