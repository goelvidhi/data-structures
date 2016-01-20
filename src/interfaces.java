import java.util.Scanner;

interface AdvancedArithmetic{
   int divisorSum(int n);
}

class Calculator1 implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int sum = 0;
		// TODO Auto-generated method stub
		for(int i = 1; i <= n; i++){
			if(n%i == 0)
				sum += i;
			else
				continue;
		}
		return sum;
	}
	
}

public class interfaces {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      	AdvancedArithmetic myCalculator=new Calculator1(); 
        int sum=myCalculator.divisorSum(n);
        System.out.println("I implemented: AdvancedArithmetic\n"+sum);
    }
}
