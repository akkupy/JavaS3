import java.util.Scanner;
class second_largest_array
{
  public static void main(String args[])
   {
     int i,j,temp;
     System.out.println("Enter the size:");
     Scanner s=new Scanner(System.in);
     int size=s.nextInt();

     int a[]=new int[size];
     System.out.println("Enter the elements: ");
     for(i=0;i<size;i++)
       a[i]=s.nextInt();

     for(i=0;i<size;i++)
       for(j=i+1;j<size;j++)
          if(a[i]<a[j]) {
               temp=a[i];
               a[i]=a[j];
               a[j]=temp;
          }
     System.out.println("Second largest no="+a[1]);
    }
}

