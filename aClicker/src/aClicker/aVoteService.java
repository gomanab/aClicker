package aClicker;
import java.util.ArrayList;
import java.util.Random;

public class aVoteService {
	Question q = new Question();
	ArrayList<Student> submissions = new ArrayList<Student>();
	int[] numSelectedAns = {0, 0, 0, 0};
	int question;
	
	aVoteService () {
		
	}
	
	public void nextQuestion () {
		question = q.getNewQuestion();
		q.printQuestion(question);
	}
	
	public void SubmitStudentAns (Student s) {
		checkDuplicateStudent(s);
		submissions.add(s);
		
		numSelectedAns[0] += s.getAns()[0];
		numSelectedAns[1] += s.getAns()[1];
		numSelectedAns[2] += s.getAns()[2];
		numSelectedAns[3] += s.getAns()[3];
	}
	
	private void checkDuplicateStudent (Student s) {
		for (int i = 0; i < submissions.size(); i++) {
			Student originalAns = (Student)submissions.get(i);
			
			if (s.getId() == originalAns.getId()) {
				numSelectedAns[0] -= originalAns.getAns()[0];
				numSelectedAns[1] -= originalAns.getAns()[1];
				numSelectedAns[2] -= originalAns.getAns()[2];
				numSelectedAns[3] -= originalAns.getAns()[3];
				
				break;
			}
		}
	}
	
	public void printResult () {
		
		System.out.println("Results:");
		for (int i = 0; i < numSelectedAns.length; i++) {
			System.out.println("[" + (char)(i+65) + "]" + (int)(((float)numSelectedAns[i]/submissions.size())*100) + "%");
		}
	}
}
