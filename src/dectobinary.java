import java.util.Scanner;

public class dectobinary {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0; i< T ; i++){
			int num = sc.nextInt();
			System.out.println(intToBin(num));
		}
	}
	
	private static String intToBin(int num){
		String res = "";
		while(num > 0){
			if (num %2 == 0) 
				res = "0".concat(res);
			else
				res = "1".concat(res);
			num = num/2;
			
		}
		return res;
		
	}
}
