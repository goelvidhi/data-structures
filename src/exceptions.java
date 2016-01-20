import java.util.Scanner;

class Calculator{

	int power(int n, int p) throws NegativeException{
		int res = 1;
		if(n > -1 && p > -1){
			while(p > 0){
				res = res * n;
				p--;
			}
			return res;
		}
		else
			throw new NegativeException("n and p should be non-negative");
	}
}

class NegativeException extends Exception{

	public NegativeException(String msg) {
		// TODO Auto-generated constructor stub
		super(msg);
	}
	
}

public class exceptions {
	public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}
