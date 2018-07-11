import java.util.*;
public class RotatingLetters {

	public static void main(String[] args) {
		String input = "";
		int t = 0; 
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		char[] ainput = input.toCharArray();
		
		for (int i = 0; i <= ainput.length - 1; i++) {
			if (ainput[i] != 'I') {
				if (ainput[i] != 'O') {
					if (ainput[i] != 'S') {
						if (ainput[i] != 'H') {
							if (ainput[i] != 'Z') {
								if (ainput[i] != 'X') {
									if (ainput[i] != 'N') { 
										t++;
									}
								}
							}
						}
					}
				}
			}		
		}
		
		if (t >= 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}

}
