import java.util.Scanner;

public class Series {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T  = sc.nextInt();
		for (int i = 0; i < T ; i++){
			int a= sc.nextInt();
			int b = sc.nextInt();
			int N = sc.nextInt();
			//System.out.println(a + " " + b + " " + N);
			for (int j = 0; j < N ; j++){
				int term = a;
				for(int k = 0; k <=j ; k++){
					if (k == 0)
						term += 1 *b;
					else
						term += ( (2 << (k-1)) * b);
					//System.out.println(term);
				}
				System.out.print(term + " ");			
			}
			System.out.println();			
		}
		
	}
}
