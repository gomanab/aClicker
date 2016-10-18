package aClicker;
import java.util.Random;

public class SimulationDriver {

	public static void main(String[] args) {
		Random rand = new Random();
		aVoteService aClicker = new aVoteService();
		
		aClicker.nextQuestion();
		
		int numOfstudents = rand.nextInt(500) + 1;
		
		//Create students
		for (int i = 0; i < numOfstudents; i++) {
			aClicker.SubmitStudentAns(new Student());
		}
		
		aClicker.printResult();
	}
}
