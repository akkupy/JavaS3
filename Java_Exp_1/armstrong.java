import java.util.Scanner;
import java.lang.Math;
public class armstrong {
	public static void main(String args[]) {
		int n,orgi_num,y,rem,z=0,res=0;
		System.out.println("Enter a number : ");
		Scanner obj = new Scanner(System.in);
		n = obj.nextInt();
		obj.close();
		orgi_num = n;y=n;
		while (n!=0) {
			z++;
			n = n/10;
		}
		while (orgi_num !=0) {
			rem = orgi_num%10;	
			res = res + (int)Math.pow(rem,z);
			orgi_num = orgi_num/10;
		}
		if (res==y)
			System.out.println("Armstrong");
		else 
			System.out.println("Not Armstrong");
	}
}			
