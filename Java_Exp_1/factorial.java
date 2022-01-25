import java.util.Scanner;
public class factorial {
        public static void main(String args[]) {
                int a,b=1;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial :");
		a = obj.nextInt();
                obj.close();
                while (a>=1) {
                        b=b*a;
                        a--;
                }
                System.out.println("Factorial is " + b);
        }
}



