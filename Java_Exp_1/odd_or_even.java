import java.util.Scanner;
public class odd_or_even 
{
        public static void main(String args[])
                {
                        int a ;
			Scanner obj = new Scanner(System.in);
			System.out.println("Enter a number : ");
			a = obj.nextInt();
                        obj.close();
                        if (a%2==0)
                                System.out.println(a + " is Even");
                        else
                                System.out.println(a + " is Odd");
                }
}

