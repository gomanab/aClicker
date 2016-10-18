package aClicker;
import java.util.Random;

public class Student {
	private int id;
	Random rand = new Random();
	int[] ans = new int[4];
	
	Student () {
		id = rand.nextInt(999999999) + 1;
		
		ans[0] = rand.nextInt(2);
		ans[1] = rand.nextInt(2);
		ans[2] = rand.nextInt(2);
		ans[3] = rand.nextInt(2);
	}
	
	public int[] getAns() {
		return ans;
	}
	
	public int getId () {
		return id;
	}
}
