import java.util.*;
public class IconScaling {

	public static void main(String[] args) {
		int k = 0;
		char[][] original = new char[3][3]; // rows, columns
		Scanner sc = new Scanner(System.in); 
		
		original[0][0] = '*';
		original[0][1] = 'x';
		original[0][2] = '*';
		original[1][0] = ' ';
		original[1][1] = 'x';
		original[1][2] = 'x';
		original[2][0] = '*';
		original[2][1] = ' ';
		original[2][2] = '*';
		
		k = sc.nextInt(); 
		
		String[] output = new String[k * 3]; 
		
		String temp = "";
		
		for (int y = 0; y <= 2; y++) {
			for (int x = 0; x <= 2; x++) {
				for (int i = 0; i <= k - 1; i++) {
					temp = temp + original[y][x]; 
				}
			}
			output[y] = temp;
			temp = "";
		}
		
		for (int x = 0; x <= 2; x++) {
			for (int i = 0; i <= k - 1; i++) {
				System.out.println(output[x]);
			} 
		} 
		

	}

}
