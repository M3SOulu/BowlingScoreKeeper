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
		if( frames.size() != 0 && frames.get( frames.size() - 1 ).isLastFrame() ){
			throw new BowlingException();
		}
		
		frames.add( frame );
	}
	
	
	/**
	 * set the bonus frame if it is allowed
	 * @param firstThrow
	 * @param secondThrow
	 * @throws BowlingException
	 */
	public void setBonus( int firstThrow, int secondThrow ) throws BowlingException {
		if( isNextFrameBonus() ){
			bonus = new Frame( firstThrow, secondThrow );
		}
	}
	
	/**
	 * 
	 * @return match score
	 */
	public int score(){
		int score = 0;
		int bonusNumber = 0;
		
		for( Frame frame : frames ){
			if( bonusNumber == 1 ){
				score += frame.getFirstThrow();
			}
			else if( bonusNumber == 2 ){
				score += ( frame.getFirstThrow() + frame.getSecondThrow() );
			}
			
			score += frame.score();
			bonusNumber = frame.bonus();
		}
		
		if( bonus != null ){
			score += bonus.score();
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
