import java.util.*;

public class PartyInvitation {

	public static void main(String[] args) {
		
		int k = 0;
		int m = 0;
		
		Scanner sc = new Scanner(System.in); 
		
		k = sc.nextInt(); 
		m = sc.nextInt(); 
		
		int[][] list = new int[k + 1][m + 1]; // skip index 0
		for (int i = 1; i <= list.length - 1; i++) {
			list[i][1] = i; // where [i][1] is original and everything gets shifted after 200 is removed
		}
		
		int[] rounds = new int[m + 1]; 
		for (int i = 1; i <= rounds.length - 1; i++) {
			rounds[i] = sc.nextInt(); 
		}	
		
		
		int shift = 1; 
		
		for (int i = 1; i <= m; i++) { // m = number of columns 
			for (int x = 1; x <= k; x++) { // k = number of rows
				if (list[x][i] < 200) {  
					if (x % rounds[i] == 0) { 
						list[x][i] = 200; // remove element
					} 
				}
				
			} 	
			
			shift = 1; // keeps track of which new index row it goes to
			for (int y = 1; y <= k; y++) { // make new array with the 200s removed
				if (list[y][i] != 200 && (i + 1) <= m && shift <= k) {
					list[shift][i + 1] = list[y][i]; 
					shift++; 
				} 
			} 
		} 
		
		for (int i = 1; i <= k; i++) {
			if (list[i][m] != 0 && list[i][m] != 200) {
				System.out.println(list[i][m]);
			} 
		}

	}
} 
