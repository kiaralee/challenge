import java.util.*;
public class PigLatin {
	
	static String input = "";
	static String output = ""; // add to string
	static int connum = 0; // original letter
	static int vowelnum = 0; // nearest vowel
	static int newcon = 0; // next letter
	static char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}; // 0, 25
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		input = sc.next();
		
		char[] inputarray = input.toCharArray();
		
		for (int i = 0; i <= inputarray.length - 1; i++) { // runs thru entire word
			
			if (inputarray[i] != 'a' && inputarray[i] != 'e' && inputarray[i] != 'i' && inputarray[i] != 'o' && inputarray[i] != 'u') { // if consonant then replace
				for (int x = 0; x <= alpha.length - 1; x++) { 
					if (inputarray[i] == alpha[x]) {
						connum = x;
					} 
				}
				
				// decides which vowel to have
				if (connum < 6 && connum > 2) { // e
					vowelnum = 4;
				} else if (connum > 6 && connum < 11) { // i
					vowelnum = 8; 
				} else if (connum > 11 && connum < 17) { // o
					vowelnum = 14;
				} else if (connum > 17 && connum < 23) { // u
					vowelnum = 20;
				} else if (connum >= 23 || connum <= 2) {
					vowelnum = 0; 
				}		
				
				//decides which consonant to have
				if (connum + 1 != 0 && connum + 1 != 4 && connum + 1 != 8 && connum + 1 != 14 && connum + 1 != 20 && connum != 25) {
					newcon = connum + 1; 
				} else if (connum == 25) {
					newcon = 25; 
				} else { 
					newcon = connum + 2; 
				}
				
				output = output + inputarray[i] + alpha[vowelnum] + alpha[newcon]; // next con following original con 	
				
			} else { 
				output = output + inputarray[i]; 
			}		
		}
		
		System.out.println(output); 
		
	}
	
}
