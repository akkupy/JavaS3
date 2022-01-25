import java.util.*;
public class factorial_sum {
	public static void main(String args[]) {
    	factorial_sum obj = new factorial_sum();
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number:");
        int x=ob.nextInt();
        ob.close();
        obj.sum(x);
        obj.fact(x);
    }
    void sum(int x){
        int s=0,a;
        while(x>0) {
     		a=x%10;
          	s=s+a;
       		x=x/10;
    	 }
        System.out.println("sum :"+s);    
    }
     
    void fact(int n) {
     	int fat=1,i;
        for(i=1;i<=n;i++) {
        	fat=fat*i;
        }
        System.out.println("Factorial :"+fat);   
    }
} 

