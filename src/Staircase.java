import java.util.Scanner;

public class Staircase {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int level = sc.nextInt();
		
		for(int i = 1; i <= level ; i++){
			for(int k = level - i; k >0; k--){
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j++){
				System.out.print("#");
			}
			System.out.println();
			
		}
	}
}
