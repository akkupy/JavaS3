import java.util.Scanner;
class largest_in_matrix
{
 public static void main(String args[])
  {
    int a[][]=new int[20][20];
    int i,j;
    
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the no of rows: ");
    int r=obj.nextInt();

    System.out.println("Enter the no of columns: ");
    int c=obj.nextInt();

    System.out.println("Enter the elements :");
    for(i=0;i<r;i++)
      for(j=0;j<c;j++)
        a[i][j]=obj.nextInt();

    int lrg=a[0][0];
    for(i=0;i<r;i++)
     {
      for(j=0;j<c;j++)
        {
          if(a[i][j]>lrg)
            lrg=a[i][j];
        }
     }

    System.out.println("The largest element in the mnatrix = "+lrg);
	}
}

