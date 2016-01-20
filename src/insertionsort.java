import java.util.Scanner;

public class insertionsort {

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int i = 0; i< N ; i++)
			arr[i] = sc.nextInt();
		
		System.out.println("Sorting begins");
		// Sorting
		int key, j;
		for(int i = 1; i< N; i++){
			key = arr[i];
			j = i-1;
			while(j>= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		/*for(int i = 0; i<N; i++)
			System.out.println(arr[i]);*/
		
		int min = 10000000;
		int fn, sn;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i+1< N ; i++){
			if (Math.abs(arr[i] - arr[i+1]) < min){
				min = Math.abs(arr[i] - arr[i+1]);
				sb.setLength(0);
				sb = sb.append(arr[i] + " ");
				sb = sb.append(arr[i+1] + " ");
			}
			else if (Math.abs(arr[i] - arr[i+1]) == min){
				sb = sb.append(arr[i] + " ");
				sb = sb.append(arr[i+1]+ " ") ;
			}
				
		}
		
		System.out.println(sb.toString().trim());
	}
}
