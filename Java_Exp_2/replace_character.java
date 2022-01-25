import java.util.*;
public class replace_character {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter length of the string");
		int n=sc.nextInt();

        String str;
		System.out.println("Enter  a string");
		str=sc.next();
		System.out.println("Enter the location of the character to be replaced");
		int x=sc.nextInt();

		System.out.println("Enter the character which is to be replaced with");
		char ch=sc.next().charAt(0);

        str = str.substring(0, x-1) + ch + str.substring(x);
 

		System.out.println("New string is");

		System.out.println(str);
	}
}

