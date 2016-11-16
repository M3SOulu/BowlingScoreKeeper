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
		
		if(frames.size()==9){
			frame.setLastFrame(true);
			frames.add(frames.size(), frame);
		}
	}
	
	public void setBonus(int firstThrow, int secondThrow){
		bonus=new Frame(firstThrow,secondThrow);
	}
	
	public int score(){
		for(int i=0;i<frames.size();i++){
			if(frames.get(frames.size()-1).isLastFrame()){
				if(frames.get(9).bonus()==1){
					score=score+frames.get(9).score()+bonus.getFirstThrow();
				}
				else if(frames.get(9).bonus()==2){
					score=score+frames.get(9).score()+bonus.score();					
				}
				else
					score=score+frames.get(9).score();
			}
			else{
				if(frames.get(frames.size()-1).isSpare()){
					score=score+frames.get(frames.size()-1).score()+frames.get(frames.size()).getFirstThrow();
				}
				else if(frames.get(frames.size()-1).isStrike()){
					score=score+frames.get(frames.size()-1).score()+frames.get(frames.size()).score();
				}else{
					score=score+frames.get(frames.size()-1).score();
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
