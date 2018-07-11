import java.util.Scanner;

public class HappySad {

	public static void main(String[] args) {
		String input = "";
		int h = 0;
		int s = 0;
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine(); 
		
		char[] inputarray = input.toCharArray(); 
		for (int i = 0; i <= inputarray.length - 3; i++) {
			if (inputarray[i] == ':' && inputarray[i+1] == '-') {
				if (inputarray[i+2] == ')') {
					h++;
				} else if (inputarray[i+2] == '(') {
					s++; 
				}
			}		
		}
		
		if (h > s) {
			System.out.println("happy");
		} else if (s > h) {
			System.out.println("sad");
		} else if (s == h && s != 0) {
			System.out.println("unsure");
		} else {
			System.out.println("none");
		}
			
		
		
		

	}

}
