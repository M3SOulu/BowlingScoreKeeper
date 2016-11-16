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
	}
	
	public void setBonus(int firstThrow, int secondThrow) throws BowlingException {
		//to be implemented

	}
	
	public int score(){
		int total=0;
		for(int i=0;i<frames.size();i++){
			if(frames.get(i).isSpare()){
				total=total+frames.get(i).score()+frames.get(i+1).getFirstThrow();
			}else{
				if(frames.get(i).isStrike()){
					if(frames.get(i+1).isStrike()){
						total=total+frames.get(i).score()+frames.get(i+1).getFirstThrow()+frames.get(i+2).getFirstThrow();
					}else{
						total=total+frames.get(i).score()+frames.get(i+1).getFirstThrow()+frames.get(i+1).getSecondThrow();
					}
				}else{
					total=total+frames.get(i).score();
				}
			}
				
		}
		return total;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
