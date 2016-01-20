

import java.util.Scanner;


class Stack{
	
	char arr[] = new char[200];
	int top = -1;
	
	void push(char c){
		arr[++top] = c;
	}
	
	Object pop(){
		if(top == -1) return null;
		char res = arr[top--];
		return res;
		
	}
	void print(){
		System.out.println("top is " + top);
		for (int i = top; i >= 0; i--){
			System.out.print(arr[i] + " " );
		}
		System.out.println();
	}
}

class Queue{
	
	int start = -1, end = -1;
	char arr[] = new char[200];
	
	void enqueue(char c){
		start =0;
		end++;
		arr[end] = c;
		
	}
	
	Object dequeue(){
		if(start == -1 || end == -1)
			return null;
		char res = arr[start++];
		return res;
	}
	
	void print(){
		for(int i = start; i<= end; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
}
class Palindrome {
	
	
	Stack s  = new Stack();
	Queue q = new Queue();
	

	public void pushCharacter(char c) {
		// TODO Auto-generated method stub
		s.push(c);
	}
    //Write your code here

	public void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		q.enqueue(c);
	}
	
	public void printStack(){
		System.out.println("Stack ");
		s.print();
	}
	
	public void printQueue(){
		System.out.println("Queue ");
		q.print();
	}

	public Object popCharacter() {
		// TODO Auto-generated method stub
		return s.pop();
	}

	public Object dequeueCharacter() {
		// TODO Auto-generated method stub
		return q.dequeue();
	}

}
public class palindromeSol {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
        	
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
       // p.printStack();
      //  p.printQueue();
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
        	char stackchar = (char)p.popCharacter();
        	char queuechar = (char)p.dequeueCharacter();
        	//System.out.println(stackchar + " " + queuechar);
            if ( stackchar != queuechar ) {
                f = false;                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}
