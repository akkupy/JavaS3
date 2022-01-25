import java.util.Scanner;
public class add_matrix {
	public static void main(String args[]) {
		int r,c,i,j;
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the number of rows of the matrics");
		r = obj.nextInt();
		System.out.println("Enter the number of columns of the matrics");
                c = obj.nextInt();
		int a[][] = new int[r][c];
		int b[][] = new int[r][c];
		int z[][] = new int[r][c];
		System.out.println("Enter the elements of the first matrix :");
		for (i=0;i<r;i++) 
			for (j=0;j<c;j++) 
				a[i][j] = obj.nextInt();
		System.out.println("Enter the elements of the second matrix :");
                for (i=0;i<r;i++) 
                        for (j=0;j<c;j++) 
                                b[i][j] = obj.nextInt();
		for (i=0;i<r;i++) 
			for (j=0;j<c;j++) 
				z[i][j] = a[i][j]+b[i][j];
		System.out.println("Resultant Matrix ");
		for (i=0;i<r;i++) {
			for (j=0;j<c;j++) {
				System.out.print(z[i][j]+"\t");
			}
			System.out.print("\n");

		}
 	}
}
