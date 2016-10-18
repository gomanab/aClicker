package aClicker;
import java.util.Random;

public class Question {
	Random rand = new Random();
	String[] question = {"What is 2+2", "Why does the sky appear blue?", "If you step on a crack, does it break your mothers back?", "How many fingers am I holding up?"};
	String[][] listAns = {{"20", "105", "4", "2"}, {"God", "Because the reflection of the ocean.", "Who cares?", "IDK"}, {"Yes", "No"}, {"1", "2", "3", "4"}};
	int[][] ans = {{1},{2},{1},{1,2}};
	
	Question () {
		
	}
	
	public int getNewQuestion () {
		return rand.nextInt(4);
	}
	
	public void printQuestion (int questionNum) {
		System.out.println(question[questionNum]);
		
		for(int i = 0; i < listAns.length; i++) {
			
			try {
				System.out.println("[" + (char)(i+65) + "] "+ listAns[questionNum][i]);
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("[" + (char)(i+65) + "]");
			}
		}
	}
	
	public boolean getAns(int questionNum) {
		return false;
	}
}
