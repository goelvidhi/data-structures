import java.util.Scanner;

class Student{
   protected String firstName;
   protected String lastName;
   int phone;
   Student(String fname,String lname,int p){
         firstName=fname;
         lastName=lname;
         phone=p;
       
   }
   public void display(){// display the details of the student
       System.out.println("First Name: "+firstName+"\nLast Name: "+lastName+"\nPhone: "+phone); 
   }

}
class Grade extends Student{
	   private int score;
	   Grade(String first, String last, int phone, int s){
		  super(first, last, phone);
		  score = s; 
	   }
	   char calculate(){
		   char grade = 0;
		  // System.out.println(score);
		   if(score < 40)
			   grade = 'D';
		   else if(score >=40 && score < 60)
			   grade = 'B';
		   else if(score >= 60 && score < 75)
			   grade = 'A';
		   else if(score >= 75 && score < 90)
			   grade = 'E';
		   else if(score >= 90 && score <= 100)
			   grade = 'O';
			   
		   return grade;
		   
	   }
	   
	}
public class inheritence {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String firstName=sc.nextLine();
        String lastName=sc.nextLine();
        int phone=sc.nextInt();
        int score=sc.nextInt();
        Student stu=new Grade(firstName,lastName,phone,score);
        stu.display();
        Grade g=(Grade)stu;
        System.out.println("Grade: "+g.calculate());
        
    }
}
