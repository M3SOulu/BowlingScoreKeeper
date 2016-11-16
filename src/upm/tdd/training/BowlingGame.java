package upm.tdd.training;
import java.util.ArrayList;
import java.util.List;

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	public void addFrame(Frame frame){
		int firstThrow = 0;
		int secondThrow = 0;
		Frame newFrame = new Frame(firstThrow, secondThrow);
	}
	//l'ultimo bonus, il bonus finale che puoi avere nel lancio finale
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	//setta il totale, gamescore
	public int score(){
		int gameScore, lastScore;
		
		
		return 0;
	}
	
	public boolean isNextFrameBonus(){
		//to be implemented
		return false;
	}
}
