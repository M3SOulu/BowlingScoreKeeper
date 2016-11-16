package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame( Frame frame ) throws BowlingException{
		if( frames.get( frames.size() - 1 ).isLastFrame() ){
			throw new BowlingException( "Bowling match is alreadyfinished" );
		}
		
		frames.add( frame );
	}
	
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	public int score(){
		int score = 0;
		int bonus = 0;
		
		for( Frame frame : frames ){
			if( bonus == 1 ){
				//
			}
			else if( bonus == 2 ){
				//
			}
			
			score += frame.score() + bonus;
			bonus = frame.bonus();
		}
		
		return score;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
