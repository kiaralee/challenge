import java.util.*;

// DETERMINES IF STRING IS IN ALPHABETIC ORDER

public class AlphaOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String word = sc.next(); 
		char[] wordArray = word.toCharArray(); 
		
		char[] alpha = {'1', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm','n','o','p','q','r','s','t','u','v','w','x','y','z'}; 
		int one = 0;
		int two = 0;
		boolean inOrder = false;
		boolean reverse = false;
		
		// in order check
		for (int i = 0; i <= wordArray.length - 1; i++) {
			for (int x = 0; x <= alpha.length -1; x++) {
				if (wordArray[i] == alpha[x]) {
					if (one == 0) {
						one = x;
					} else {
						two = x;
					}
				}
			}
			if (two != 0) {
				if (one <= two) {
					inOrder = true;
					one = two;
				} else {
					inOrder = false;
				}
			}
		}
		
		// reverse order check
		if (inOrder == false) {
			one = 0;
			two = 0;
			for (int i = wordArray.length - 1; i >= 0; i--) {
				for (int x = 0; x <= alpha.length -1; x++) {
					if (wordArray[i] == alpha[x]) {
						if (one == 0) {
							one = x;
						} else {
							two = x;
						}
					}
				}
				if (two != 0) {
					if (one <= two) {
						reverse = true;
						one = two;
					} else {
						reverse = false;
					}
				}
			}
		} 
			
		if (reverse == true) {
			System.out.println(word + " REVERSE ORDER");
		} else if (inOrder == true) {
			System.out.println(word + " IN ORDER");
		} else {
			System.out.println(word + " NOT IN ORDER");
		}	 

}
} 
