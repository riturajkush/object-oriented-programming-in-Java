import java.util.*;
import java.lang.Math;

class Lab3{


	public static void main(String args[]){
		//pattern1();		
		//pattern3();
		//matmul();
		//transpose();
		//pattern2();
	}

	public static void pattern1(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j<=n;j++)
				prints(j+ " ");
			printsn("");		
		}
		for(int i=n-1;i>0;i--){
			for(int j=i;j<=n;j++)
				prints(j+ " ");
			printsn("");		
		}		
	}

	public static void pattern2(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the value of n: ");
		int n=sc.nextInt();
		int d=2*n-1;
		for (int a = 1; a <=n; a++) {
			for (int b = 1; b<=2*a-1; b++) {
				prints(" ");
			}
			for (int b = 1; b <= d; b++) {
				prints(b+" ");
			}
			d = d - 2;
			printsn("");		
	}

	}
	public static void pattern3(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the value of n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=i;j>0;j--){
				prints(j+" ");
			}
			
			printsn(" ");		
		}
			
	}

	public static void matmul(){
		Scanner sc=new Scanner(System.in);
		prints("Enter no. of rows of first matrix: ");
		int r1=sc.nextInt();
		prints("Enter no. of columns of first matrix: ");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				a[i][j]=sc.nextInt();
				
		printsn("No of rows of second matrix is " +c1);
		int r2=c1;
		prints("Enter no. of columns of second matrix: ");
		int c2=sc.nextInt();

		int b[][]=new int[r2][c2];
		for(int i=0;i<r2;i++)
			for(int j=0;j<c2;j++)
				b[i][j]=sc.nextInt();
		int res[][]=new int[r1][c2];
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++){
				for(int k=0;k<c1;k++)
					res[i][j]+=a[i][k]*b[k][j];				
				}		
		}
		printsn("Result: ");
		for(int i=0;i<r1;i++){
			for(int j=0;j<c2;j++)
				prints(res[i][j]+" ");
			printsn("");		
		}
	}

	
	public static void transpose(){
		Scanner sc=new Scanner(System.in);
		prints("Enter no. of rows of first matrix: ");
		int r1=sc.nextInt();
		prints("Enter no. of columns of first matrix: ");
		int c1=sc.nextInt();
		int a[][]=new int[r1][c1];
		int t[][]=new int[c1][r1];
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				a[i][j]=sc.nextInt();
		
		for(int i=0;i<r1;i++)
			for(int j=0;j<c1;j++)
				t[j][i]=a[i][j];

		printsn("Transpose: ");
		for(int i=0;i<c1;i++){
			for(int j=0;j<r1;j++)
				prints(t[i][j]+ " ");
						
			printsn("");		
		}		
			
	}

	public static void prints(String s){
		System.out.print(s);	
	}

	public static void printsn(String s){
		System.out.println(s);	
	}
}
