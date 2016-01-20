import java.util.ArrayList;
import java.util.Scanner;

class Seq{
	int id;
	ArrayList<Integer> dynseq = new ArrayList<>();
	int top;
}
public class dynamicseq {
	
	public static void main(String args[]){
		Seq seqlist[] = new Seq[100000];
		//int dynseq[][] = new int[100000][100000];
		//int dynseq_top[]= new int[100000];
		for(int i = 0; i< 100000 ; i++)
			seqlist[i] = new Seq();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int lastans = 0;
		int seq_id = 0;
		for (int i = 0; i < Q ; i++){
			int a = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			seq_id = (x ^ lastans) % N;
			if(a == 1){
				//System.out.println(seq_id);
				
				seqlist[seq_id].dynseq.add(seqlist[seq_id].top++, y);
				
				//dynseq[seq_id][dynseq_top[seq_id]++] = y;  //the second argument points to the position in the sequence
				
			}
			else if(a == 2){
				int size = seqlist[seq_id].top;
				//int size = dynseq_top[seq_id];
				int res_index = y % size;
				System.out.println(seq_id + " " + size + " " + res_index);
				//int res = dynseq[seq_id][res_index];
				
				int res = seqlist[seq_id].dynseq.get(res_index);
				System.out.println(res);
				lastans = res;
				
			}
		}
		
		//System.out.println(dynseq[0][0] + " " + dynseq[0][1]);
		//System.out.println(dynseq[1][0]);
	}

}
