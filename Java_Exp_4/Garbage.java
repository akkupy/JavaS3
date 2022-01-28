import java.util.Scanner;
public class Garbage{

    public static void main(String args[]) {  
        
        Student obj=new Student();  
        obj.getDetails();
        obj.showDetails();
        obj=null;  
        System.gc();  
    
    }  
}  

class Student {
    Scanner sc = new Scanner(System.in);
    
    String name,number;
    int rollno;
       
    void getDetails() {
        System.out.printf("Enter the Name of Student : ");
        name = sc.next();
        System.out.printf("Enter the Roll No : ");
        rollno = sc.nextInt();
        System.out.printf("Enter Phone Number : ");
        number = sc.next();

    }

    void showDetails() {
        System.out.printf("\nThe Name of Student is %s \n",name);
        System.out.printf("Enter the Roll No : %d \n",rollno);
        System.out.printf("Enter Phone Number : %s \n",number);
    }

    protected void finalize() {
           System.out.println("\nGarbage of Object Collected");
    }
}