package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){
		
	}
	
	public void addFrame(Frame frame){
		if(frames.size()==9){
			frame.setLastFrame(true);
			frames.add(frames.size(), frame);
		}
		else
			frames.add(frames.size(), frame);
	}
	
	public void setBonus(int firstThrow, int secondThrow){
		bonus=new Frame(firstThrow,secondThrow);
	}
	
	public int score() throws BowlingException{
		int score=0;
		for(int i=0;i<frames.size();i++){
			if(frames.get(i).isLastFrame()){
				if(frames.get(9).bonus()==1){
					score=score+frames.get(9).score()+bonus.getFirstThrow();
				}
				else if(frames.get(9).bonus()==2){
					score=score+frames.get(9).score()+bonus.getFirstThrow()+bonus.getSecondThrow();					
				}
				else
					score=score+frames.get(9).score();
			}
			else{
				if(frames.get(i).isSpare()){
					score=score+frames.get(i).score()+frames.get(i+1).getFirstThrow();
				}
				else if(frames.get(i).isStrike()){
						if(frames.get(i+1).isStrike()){
							if(i==8){
								score=score+frames.get(i).score()+frames.get(i+1).score()+bonus.getFirstThrow();
							}
							else
								score=score+frames.get(i).score()+frames.get(i+1).score()+frames.get(i+2).getFirstThrow();
						}
						else
							score=score+frames.get(i).score()+frames.get(i+1).score();
				}else{
					score=score+frames.get(i).score();
				}
			}
		}
		
		return score;
		
	}
	
	// non usato
	public boolean isNextFrameBonus(){
		if(frames.get(frames.size()-1).isSpare()||frames.get(frames.size()-1).isStrike())
			return true;
		else
			return false;
	}
}
