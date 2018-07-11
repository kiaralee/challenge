import java.util.*;
public class Partners {
	
	static int n = 0;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // 2d arrays
		n = sc.nextInt();
		
		String[] line1 = new String[n];
		for (int i = 0; i <= line1.length - 1; i++) {
			line1[i] = sc.next();
		}
		
		String[] line2 = new String[n];
		for (int i = 0; i <= line2.length - 1; i++) {
			line2[i] = sc.next(); 
		}
		
		String[][] check1 = new String[n][2]; 
		for (int i = 0; i <= line1.length - 1; i++) {
			check1[i][0] = line1[i];
			check1[i][1] = line2[i]; 
		}
		
		if (isSelf(check1) == true) {
			if (isSame1(line1) == true) {
				if (isSame2(line2) == true) {
					System.out.println("good");
				} else {
					System.out.println("bad"); 
				}
			} else {
				System.out.println("bad"); 
			}
		} else {
			System.out.println("bad"); 
		}	
	} 
	
	public static boolean isSelf(String[][] check1) {	
		for (int i = 0; i <= check1.length - 1; i++) {
			if (check1[i][0].equals(check1[i][1])) {  // MUST use .equals() for comparing strings because == compares if they are the same thing (yes, they both are strings) & that only works for #
				return false;		
			} 
		}
		return true; 				
	}
	
	public static boolean isSame1(String[] line1) {
		for (int x = 0; x <= line1.length - 1; x++) {
			for (int i = 0; i <= line1.length - 1; i++) {
				if (x != i) {
					if (line1[x].equals(line1[i])) {
						return false;
					}
				}
			}
		} 
		return true; 
	}
	public static boolean isSame2(String[] line2) {
		for (int x = 0; x <= line2.length - 1; x++) {
			for (int i = 0; i <= line2.length - 1; i++) {
				if (x != i) {
					if (line2[x].equals(line2[i])) {
						return false;
					}
				}
			}
		} 
		return true; 
	}
	
	
	
}
