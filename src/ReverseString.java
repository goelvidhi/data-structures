import java.util.Scanner;

public class ReverseString {
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		String orig = sc.nextLine();
		String rev = reverseString(orig);
		System.out.println("Original = " + orig + " reversed = " + rev);
	}
	
	private static String reverseString(String orig){
		String rev = new String();
		String parts[] = orig.split(" ");
		//System.out.println(parts.length + " " + parts[0] + " " + parts[1]) ;
		for (int i = parts.length - 1; i >= 0; i--){
			//System.out.println(parts[i]);
			rev = rev.concat(parts[i]).concat(" ");
			//System.out.println(rev);
			
		}
		rev = rev.trim();
		return rev;
	}

}
