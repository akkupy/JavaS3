import java.util.Scanner;
class replace_array_element
{
 public static void main(String args[])
  {
    int i,num,pos;
    System.out.println("Enter the required size:");
    Scanner s=new Scanner(System.in);
    int size=s.nextInt();

    int a[]=new int[size];
    System.out.println("Enter the elements: ");
    for(i=0;i<size;i++)
      a[i]=s.nextInt();

    System.out.println("Enter which new element you want to insert: ");
    num=s.nextInt();

    System.out.println("Enter the position to add number :");
    pos=s.nextInt();
    for(i=0;i<size;i++)
      if(i+1==pos)
	      a[pos-1]=num;

    System.out.println("Final output=");
    for(i=0;i<size;i++)
      System.out.println("\t"+a[i]);
   }
}

