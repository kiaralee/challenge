import java.util.*;

public class DoubleDice {

	public static void main(String[] args) {
		
		int a = 100;
		int d = 100;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[][] rolls = new int[n][2]; // rows first 
		for (int i = 0; i <= rolls.length - 1; i++) {
			rolls[i][0] = sc.nextInt();
			rolls[i][1] = sc.nextInt(); 
		}
		
		for (int i = 0; i <= rolls.length - 1; i++) {
			if (rolls[i][0] > rolls[i][1]) {
				d = d - rolls[i][0];
			} else if (rolls[i][1] > rolls[i][0]) {
				a = a - rolls[i][1]; 
			}
		}
		System.out.println(a);
		System.out.println(d); 
		
		
	}

}
