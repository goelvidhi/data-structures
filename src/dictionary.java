import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class dictionary {

	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
	      int N=in.nextInt();
	      in.nextLine();
	      HashMap<String, String> phonebook = new HashMap<>();
	      
	      for(int i=0;i<N;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         //System.out.println(name + " " + phone);
	         phonebook.put(name, name +  "=" + phone);
	         in.nextLine();
	      }
	      //System.out.println(phonebook.toString());
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         //System.out.println(s);
	         	 if(phonebook.containsKey(s)){
	         		System.out.println(phonebook.get(s));
	         	 }
	         	 else{
	         		System.out.println("Not found");
	         	 }
	      }
	   }
}

