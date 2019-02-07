import java.util.Scanner;
import java.lang.Math;

class Lab2{
	public static void main(String args[]){
		//marks();
		//Heron();
		//vowel();
		//numbersum();
		//prime();
		//fibonacci();
		//pattern();
		//matrixaddition();
	}

	public static void marks(){
		Scanner sc=new Scanner(System.in);
		float[] marks = new float[5];
		float total=0;
		float average;
		float percent;
		for(int i=0;i<5;i++){
			prints("Enter marks in Subject "+(i+1)+" out of 100: ");
			marks[i]=sc.nextFloat();
			total+=marks[i];
		}
		printsn("Total marks: "+total);
		printsn("Average marks: "+(total/5));

	}

	public static void Heron(){
		Scanner sc=new Scanner(System.in);
		prints("Enter first side: ");
		float a = sc.nextFloat();
		prints("Enter second side: ");
		float b = sc.nextFloat();
		prints("Enter third side: ");
		float c = sc.nextFloat();
		float s = (a+b+c)/2;
		float d=s*(s-a)*(s-b)*(s-c);
		double area=Math.sqrt(d);
		printsn("Area of triangle: "+area+" sq. unit");


	}

	public static void vowel(){
		Scanner sc=new Scanner(System.in);
		prints("Enter a Character: ");
		String c = sc.next();
		String d=c.toLowerCase();
		if(d.equals("a")||d.equals("e")||d.equals("i")||d.equals("o")||d.equals("u"))
			printsn(c+ " is a vowel.");
		else
			printsn(c+" is not a vowel.");
	}

	public static void numbersum(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the number: ");
		int a=sc.nextInt();
 		int n=a;
 		int sum=0;
 		while(n!=0){
 			sum=sum+n%10;
 			n=n/10;
 		}

 		printsn("Sum of digits: "+sum);
	}

	public static void prime(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the lower limit: ");
		int a=sc.nextInt();
		prints("Enter the upper limit: ");
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++){
			int k=0;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					k=1;
					break;
				}
			}
			if(k==0)
				prints(i+" ");

		}

		printsn("");

	}

	public static void fibonacci(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the n: ");
		int n=sc.nextInt();
		int a=1;
		int b=0;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=b;
			prints(b+ " ");
			int c=a;
			a=a+b;
			b=c;

		}

		printsn("\nSum of series: "+ sum);

	}

	public static void pattern(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the n: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			prints("\n");
		}
		for(int i=n-1;i>0;i--){
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			prints("\n");
		}
	}	

	public static void matrixaddition(){
		Scanner sc=new Scanner(System.in);
		int[][] mat1=new int[3][3];
		int[][] mat2=new int[3][3];
		int[][] sum=new int[3][3];
		printsn("Enter elements of matrix 1: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				mat1[i][j]=sc.nextInt();
		printsn("Enter elements of matrix 2: ");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				mat2[i][j]=sc.nextInt();

		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				sum[i][j]=mat1[i][j]+mat2[i][j];

		printsn("Addition of two matrix: ");

		for(int i=0;i<3;i++){
    		for(int j=0;j<3;j++)
    			System.out.print(sum[i][j]+" ");
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