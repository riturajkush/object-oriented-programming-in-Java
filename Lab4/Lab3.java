import java.util.Scanner;
import java.lang.Math;

class Lab3{
	public static void main(String args[]){
		//matdet();
		//matinv();
		matsym();
	}
	public static void matdet(){
		Scanner sc = new Scanner(System.in);
		int a[][]= new int[5][5];
		printsn("Enter a 3x3 matrix");
		int i,j;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}



		int det1,det2,det3;
		det1=a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1]);
		det2=-a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0]);
		det3=a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
		printsn("Determinant of matrix is: " + (det1+det2+det3));
	}

	public static void matinv(){
		Scanner sc = new Scanner(System.in);
		float a[][]= new float[2][2];
		float inv[][]=new float[2][2];
		printsn("Enter a 2x2 matrix");
		int i,j;
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				a[i][j]=sc.nextFloat();
			}
		}



		float det=a[0][0]*a[1][1]-a[0][1]*a[1][0];
		if(det==0){
			printsn("Matrix is not invertible because det(A)=0.");
		}
		else{
			inv[0][0]=a[1][1]/det;
			inv[0][1]=-a[0][1]/det;
			inv[1][0]=-a[1][0]/det;
			inv[1][1]=-a[0][0]/det;
		
			printsn("Inverse of matrix: ");
			for(i=0;i<2;i++){
				for(j=0;j<2;j++){
					prints(" "+ inv[i][j]);
				}
				printsn("");
			}
		}
	}


	public static void matsym(){
		Scanner sc = new Scanner(System.in);
		printsn("Enter dimension of matrix: ");
		int n=sc.nextInt();
		float a[][]= new float[n][n];
		printsn("Enter a "+n+"x"+n+" matrix");
		int i,j;
		int flag=0;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=sc.nextFloat();
			}
		}

		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(a[i][j]!=a[j][i]){
					flag=1;
					break;
				}
			}
		}

		if(flag==0){
			printsn("Matrix is Symmetric.");
		}
		else{
			printsn("Matrix is asymmetric.");
		}


		
			
	
	}
	public static void prints(String s){

		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}

}