import java.util.Scanner;
public class fibon {
        public static void main(String args[]) {
                int a = 0,b = 1 ,c = 0,d;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of fibonacci numbers needed :");
		d = obj.nextInt();
                obj.close();
		System.out.println("The fibonacci series is ");
                System.out.println("0");
                System.out.println("1");
                for (int i=0;i<d;i++) {
                        c=a+b;
                        a = b;
                        b = c;
                        System.out.println(c);
                }
        }
}


