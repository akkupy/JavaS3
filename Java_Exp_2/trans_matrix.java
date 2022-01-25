import java.util.Scanner;
public class trans_matrix {
        public static void main(String args[]) {
                int r,c,i,j;
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter the number of rows of the matrix");
                r = obj.nextInt();
                System.out.println("Enter the number of columns of the matrix");
                c = obj.nextInt();
                int a[][] = new int[r][c];
                int z[][] = new int[r][c];
                System.out.println("Enter the elements of the first matrix :");
                for (i=0;i<r;i++) 
                        for (j=0;j<c;j++) 
                                a[i][j] = obj.nextInt();
		for (i=0;i<r;i++)
			for (j=0;j<c;j++)
				z[i][j]=a[j][i];
		System.out.println("Transpose of the matrix is ");
		for (i=0;i<r;i++) {
			for (j=0;j<c;j++) {
				System.out.print(z[i][j]+"\t");
			}
			System.out.print("\n");
		}
	}
}
			

