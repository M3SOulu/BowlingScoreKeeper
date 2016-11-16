package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	private int score = 0;
	private int index = 0;
	
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame) throws BowlingException{
		if(frames.size() >= 10){
			if(frames.get(9).isStrike() || frames.get(9).isSpare()){
				setBonus(frame.getFirstThrow(),frame.getSecondThrow());
			}else{
				throw new BowlingException();
			}
		}else{
			this.frames.add(frame);
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		this.bonus = new Frame(firstThrow,secondThrow);
	}
	
	public int score(){
		for(int i = 2; i < frames.size(); i++){
			index = i;
			if(isNextFrameBonus()){
			this.score += (frames.get(i - 2).score()+frames.get(i-1).bonus());
				if(frames.get(i-1).isStrike()){
					this.score +=  frames.get(i).bonus();
				}
			}else{
				this.score += frames.get(i-2).score();
			}
		}	
		if(isNextFrameBonus()){
			this.score += (frames.get(index - 2).score()+frames.get(index-1).bonus());
			if(frames.get(index-1).isStrike()){
				this.score +=  frames.get(index).bonus();
				}
			}else{
				this.score += frames.get(index-2).score();
			}
		if(frames.get(frames.size()-1).isStrike()|| frames.get(9).isSpare()){
			this.score += bonus.bonus();
		}
		
		return score;
	}
	
	public boolean isNextFrameBonus(){
		return (frames.get(index - 2).isSpare() || frames.get(index - 2).isStrike());
	}
}
