import java.util.Scanner;

public class ReverseDigits {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		int rev = reverse(num);
		System.out.println("Original = " + num + " reversed = " + rev);
	}
	
	private static int reverse(int original){
		int res = 0;
		int mod = 0;
		while(original > 0){
			mod = original % 10;
			res = res * 10 + mod;
			original = original/10;
		}
		return res;
	}
}
