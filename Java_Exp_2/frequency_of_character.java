import java.util.*;
public class frequency_of_character {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String s=sc.nextLine();

        System.out.println("Enter the character to find the frequency");
        char c=sc.next().charAt(0);

        int i=0,f=0;
        int n=s.length();
        for(i=0;i<n;i++) {
            if(c==s.charAt(i))
            f+=1;
        }
        System.out.println("frequency of " +c+ " is " +f);
    }
}

