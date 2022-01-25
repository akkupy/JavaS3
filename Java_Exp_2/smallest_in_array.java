import java.util.*;
public class smallest_in_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i,n,small=0;
        System.out.println("Enter the number of elements:");
        n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements of the array :");
        for(i=0;i<n;i++) {
            a[i]=sc.nextInt();
                
        }
        small=a[0];
        for(i=1;i<n;i++) {
            if(a[i]<small)
            small=a[i];
        }
        System.out.println("smallest element is "+small);
        
        }
    }   

