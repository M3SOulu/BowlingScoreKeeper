package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	/**
	 * add a frame if the match isnt already finished
	 * @param frame
	 * @throws BowlingException
	 */
	public void addFrame( Frame frame ) throws BowlingException{
		if( frames.get( frames.size() - 1 ).isLastFrame() ){
			throw new BowlingException();
		}
		
		frames.add( frame );
	}
	
	
	public void setBonus( int firstThrow, int secondThrow ) {
		bonus = new Frame( firstThrow, secondThrow );
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
	
	/**
	 * 
	 * @return true if the next frame is a bonus
	 */
	public boolean isNextFrameBonus(){
		Frame lastFrame = frames.get( frames.size() - 1 );
		
		if( lastFrame.isLastFrame() &&
				( lastFrame.isSpare() || lastFrame.isStrike()) ){
			return true;
		}
		else{
			return false;
		}
	}
}
