import java.util.Scanner;

public class hourglass {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
	    int arr[][] = new int[6][6];
	    for(int i=0; i < 6; i++){
	        for(int j=0; j < 6; j++){
	            arr[i][j] = in.nextInt();
	        }
	    }
	    int max = -90, sum = 0;
	    for (int i=0; i < 4; i++){
	    	for (int j=0; j <4 ; j++){
	    		sum = calcSum(i, j, arr);
	    		if(max < sum)
	    			max = sum;
	    	}
	    }
	    
	    System.out.println(max);
	}
	
	private static int calcSum(int x, int y, int arr[][]){
		int sum = 0;
		sum = arr[x][y] + arr[x][y+1] + arr[x][y+2] + arr[x+1][y+1] + arr[x+2][y] + arr[x+2][y+1] + arr[x+2][y+2];
		
		return sum;
	}
	
}
