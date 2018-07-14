import java.util.*;
public class PhoneWords {

	
	// GIVEN A SEVEN-DIGIT PHONE NUMBER, PRINT ALL POSSIBLE COMBONATIONS OF LETTERS
	
	public static void main(String[] args) {
		// arrays correspond to each number
		char[] two = {'a', 'b', 'c'};
		char[] three = {'d', 'e', 'f'};
		char[] four = {'g', 'h', 'i'};
		char[] five = {'j', 'k', 'l'};
		char[] six = {'m', 'n', 'o'};
		char[] seven = {'p', 'r', 's'};
		char[] eight = {'t', 'u', 'v'};
		char[] nine = {'w','x','y'}; 
		boolean valid = true;
		
		Scanner sc = new Scanner(System.in);
		String phonenum = sc.next();
		char[] num = phonenum.toCharArray(); 
		int length = num.length; 
		
		// checks if number is valid
		for (int i = 0; i <= num.length - 1; i++) {
			if (num[i] == '1' || num[i] == '0') {
				valid = false;
			}
		}
		
		if (valid == false || length != 7) {	
			System.out.println("Number invalid. Must be 7 digits long and contain only integers 2-9.");
		} else { 
			
			char[][] allWords = new char[length][4];
			
			// FILLS 2D ARRAY WITH ALL POSSIBLE LETTERS IN GIVEN SLOT
			for (int i = 0; i <= num.length - 1; i++) {
				if (num[i] == '2') {
					for (int x = 0; x <= two.length - 1; x++) {
						allWords[i][x] = two[x];
					} 
					
				} else if (num[i] == '3') {
					for (int x = 0; x <= three.length - 1; x++) {
						allWords[i][x] = three[x];
					} 
					
				} else if (num[i] == '4') {
					for (int x = 0; x <= four.length - 1; x++) {
						allWords[i][x] = four[x];
					}
					
				} else if (num[i] == '5') {
					for (int x = 0; x <= five.length - 1; x++) {
						allWords[i][x] = five[x];
					}
					
				} else if (num[i] == '6') {
					for (int x = 0; x <= six.length - 1; x++) {
						allWords[i][x] = six[x];
					}
					
				} else if (num[i] == '7') {
					for (int x = 0; x <= seven.length - 1; x++) {
						allWords[i][x] = seven[x];
					}
					
				} else if (num[i] == '8') {
					for (int x = 0; x <= eight.length - 1; x++) {
						allWords[i][x] = eight[x];
					}
					
				} else if (num[i] == '9') {
					for (int x = 0; x <= nine.length - 1; x++) {
						allWords[i][x] = nine[x];
					}
					
				} else {
					System.out.println("Error"); 
				}
			}
			
			String word = "";
			
			// PRINTS ALL 2187 POSSIBLE STRINGS OF LETTERS FROM 2D ARRAY
			for (int a = 0; a <= length - 1; a++) {
				
				for (int c = 0; c <= 2; c++) {
					word = word + allWords[a][c]; // first letter cycle
					
					for (int b = 0; b <= 2; b++) {

						word = word + allWords[a + 1][b]; // second letter cycle
						
						for (int d = 0; d <= 2; d++) {
							word = word + allWords[a + 2][d]; // third letter cycle
							
							for (int e = 0; e <= 2; e++) {
								word = word + allWords[a + 3][e]; // fourth letter cycle
																
								for (int f = 0; f <= 2; f++) {
									word = word + allWords[a + 4][f]; // fifth letter cycle 
									
									for (int g = 0; g <= 2; g++) {
										word = word + allWords[a + 5][g]; // sixth letter cycle
										
										for (int h = 0; h <= 2; h++) {
											word = word + allWords[a + 6][h]; // seventh letter cycle
											System.out.println(word + " ");
											word = ""; 
											word = word + allWords[a][c] + allWords[a + 1][b] + allWords[a + 2][d] + allWords[a+ 3][e] + allWords[a + 4][f] + allWords[a + 5][g]; 		
										}
										word = "";
										word = word + allWords[a][c] + allWords[a + 1][b] + allWords[a + 2][d] + allWords[a + 3][e] + allWords[a + 4][f]; 
										
									}
									word = "";
									word = word + allWords[a][c] + allWords[a + 1][b] + allWords[a + 2][d] + allWords[a + 3][e];
									
								}
								word = "";
								word = word + allWords[a][c] + allWords[a + 1][b] + allWords[a + 2][d];
							}
							word = "";
							word = word + allWords[a][c] + allWords[a + 1][b]; 
						}
						word = "";
						word = word + allWords[a][c];
						
					} 	
					word = "";	
				} 
				
			}
	
		}

	}

}
