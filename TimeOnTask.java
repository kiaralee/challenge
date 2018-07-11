import java.util.*;
public class TimeOnTask {

	public static void main(String[] args) {
		int T = 0; // time for chores
		int x = 0; // number of chores
		int o = 0; // total output
		int a = 0; // total time
		
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		x = sc.nextInt();
		
		int[] total = new int[x];
		for (int i = 0; i <= total.length - 1; i++) {
			total[i] = sc.nextInt(); 
		}
		
		int least = 200000;
		int current = 200000;
		
		while (a <= T) {
			current = 200000;
			least = 200000;
			for (int i = 0; i <= total.length - 1; i++) {
				if (total[i] <= least && total[i] != 200000) {
					least = total[i];
					current = i;
				}
			}
			total[current] = 200000; 
			a += least;
			o++;
		} 
		
		System.out.println(o - 1);

	}

}
