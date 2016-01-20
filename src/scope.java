import java.util.Scanner;

class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	Difference(int a[]){
  		elements = a;
  	}
  	void computeDifference(){
  		for (int i = 0; i<elements.length; i++){
  			//System.out.println(elements[i]);
  			for (int j = i; j < elements.length; j++){
  				if(Math.abs(elements[j] - elements[i]) > maximumDifference)
  					maximumDifference = Math.abs(elements[j] - elements[i]);
  			}
  		}
  		
  	}
}
public class scope {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

      	System.out.print(D.maximumDifference);
    }
}
