import java.util.Scanner;
public class add_two_numbers {
        public static void main(String args[])
                {
                        int a , b;
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter two numbers to add : \n");
			b = obj.nextInt();
			a = obj.nextInt();
                        obj.close();
                        System.out.println("Sum is "+(a+b));
                }
}

