import java.util.*;
public class Tandem {

	public static void main(String[] args) {
		
		int n = 0;
		int q = 0;
		int m1 = 0;
		int m2 = 0;
		
		Scanner sc = new Scanner(System.in);
		q = sc.nextInt();
		n = sc.nextInt(); 
		
		int[] peg = new int[n];
		for (int i = 0; i <= peg.length - 1; i++)  {
			peg[i] = sc.nextInt(); 
		}
		
		int[] dmo = new int[n];
		for (int i = 0; i <= dmo.length - 1; i++) {
			dmo[i] = sc.nextInt();
		}
		int[][] output = new int[n][2]; 
		
		int id1 = 0;
		int id2 = 0; 
		
		if (q == 1) { // find minimum total speed
			
			for (int x = 0; x <= n - 1; x++) {
				m1 = 0;
				m2 = 0;
				for (int i = 0; i <= n - 1; i++) {
					if (peg[i] >= m1 && peg[i] != 2000000) { // pair the two biggest
						m1 = peg[i]; 
						id1 = i;
					}
					if (dmo[i] >= m2 && dmo[i] != 2000000) {
						m2 = dmo[i];
						id2 = i; 
					}		
				} 	
				peg[id1] = 2000000; // takes out the two that were just used
				dmo[id2] = 2000000; 

				if (m1 <= m2) { //  put largest at index 1
					output[x][0] = m1;
					output[x][1] = m2; 
				} else {
					output[x][0] = m2;
					output[x][1] = m1; 
				}				
			} 
		
			int total = 0;
			for (int i = 0; i <= n - 1; i++) {
				total = total + output[i][1]; 
			}
			System.out.println(total); 	
			
		} else if (q == 2) { // find maximum speed
			
			for (int x = 0; x <= n - 1; x++) {
				m1 = 0;
				m2 = 2000000;
				for (int i = 0; i <= n - 1; i++) {
					if (peg[i] >= m1 && peg[i] != 2000000) { // pair the biggest
						m1 = peg[i]; 
						id1 = i;
					}
					if (dmo[i] <= m2 && dmo[i] != 2000000) { // pair the smallest
						m2 = dmo[i];
						id2 = i; 
					}		
				} 	
				peg[id1] = 2000000; // takes out the two that were just used
				dmo[id2] = 2000000; 

				if (m1 <= m2) { //  put largest at index 1
					output[x][0] = m1;
					output[x][1] = m2; 
				} else { 
					output[x][0] = m2;
					output[x][1] = m1; 
				}				
			} 
		
			int total = 0;
			for (int i = 0; i <= n - 1; i++) {
				total = total + output[i][1]; 
			}
			System.out.println(total);	
			
		}

	}

}
