import java.util.Scanner;
import java.lang.Math;

class Lab1{
    // functions: CI(), SI(), palindrome(), factorial()
    // peri_area(), great(), swap_tv(), swap(), calc()
	public static void main(String args[]){
		//peri_area();
		//CI();
		//SI();
		//palindrome();
		//factorial();
		//great();
		//swap_tv();
		//swap();
		calc();
	}

	public static void CI(){
		Scanner sc=new Scanner(System.in);
		prints("Enter Principal value: ");
		double p=sc.nextDouble();
		prints("Enter rate value(%): ");
		double r=sc.nextDouble();
		r=r/100;
		prints("Enter no. of time in years: ");
		double n=sc.nextDouble();

		prints("Enter time: ");
		double t=sc.nextDouble();
		double ci=(1+r/n);
		double x=t*n;
		ci=p*Math.pow(ci,x);
		ci=ci-p;
		printsn("Coumpound Interest: "+ci);
	}


	public static void SI(){
		Scanner sc=new Scanner(System.in);
		prints("Enter Principal value: ");
		float p=sc.nextFloat();
		prints("Enter Annual rate value: ");
		float r=sc.nextFloat();
		prints("Enter time in years: ");
		float t=sc.nextFloat();
		printsn("Simple Interest: "+((p*r*t)/100));
	}

	public static void palindrome(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the number: ");
		int a=sc.nextInt();
 		int n=a;
 		int rev=0;
 		while(n!=0){
 			rev=10*rev+n%10;
 			n=n/10;
 		}
 		if(rev==a){
 			printsn("Palindrome");
 		}
 		else
 			printsn("Not Palindrome");	
	}
    

	public static void factorial(){
		Scanner sc=new Scanner(System.in);
		prints("Enter the number: ");
		int a=sc.nextInt();
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}

		printsn("Factorial using for loop: "+fact);
        fact=1;
        int i=1;
		while(i<=a){
			fact*=i;
			i++;
		}

		printsn("Factorial using while loop: "+fact);
		fact=1;
		i=1;
		do{
			fact*=i;
			i++;
		}while(i<=a);
		printsn("Factorial using do-while loop: "+fact);
	}


	public static void peri_area(){
		Scanner sc=new Scanner(System.in);
		printsn("1. Circle\n2. Rectangle\n3. Square");
		prints("Enter Choice: ");
		int c=sc.nextInt();
		switch(c){
			case 1:
			{
				prints("Enter Radius: ");
				float r=sc.nextFloat();
				printsn("Perimeter: "+(2*3.141*r));
				printsn("Area: "+(3.141*r*r));
				break;
			}

			case 2:
			{
				prints("Enter length: ");
				float l=sc.nextFloat();
				prints("Enter breadth: ");
				float b= sc.nextFloat();
				printsn("Perimeter: "+(2*(l+b)));
				printsn("Area: "+(l*b));
				break;
			}

			case 3:
			{
				prints("Enter length of side: ");
				float a = sc.nextFloat();
				printsn("Area: "+(a*a));
				printsn("Perimeter: "+(4*a));
				break;
			}
		}

    }
    
    public static void great(){
		Scanner sc=new Scanner(System.in);
    	prints("Enter first Number: ");
		float a=sc.nextFloat();
		prints("Enter Second Number: ");
		float b=sc.nextFloat();
		prints("Enter Third Number: ");
		float c=sc.nextFloat();
		float greatest=(a>b)?((a>c)?a:c):(b>c)?b:c;
		printsn("Greatest Number: "+greatest);

    }

    public static void swap_tv(){
		Scanner sc=new Scanner(System.in);
    	prints("Enter first Number: ");
		float a=sc.nextFloat();
		prints("Enter Second Number: ");
		float b=sc.nextFloat();
		float c=a;
		a=b;
		b=c;
		printsn("Swapped a="+a+" and b="+b);

    }


    public static void swap(){
		Scanner sc=new Scanner(System.in);
    	prints("Enter first Number: ");
		float a=sc.nextFloat();
		prints("Enter Second Number: ");
		float b=sc.nextFloat();
		a=a+b;
		b=a-b;
		a=a-b;
		printsn("Swapped a="+a+" and b="+b);

    }


	public static void calc(){
		System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Remainder");
		Scanner sc=new Scanner(System.in);
		prints("Enter a choice: ");
		int inp =sc.nextInt();
		switch(inp){
			case 1:
			{
				prints("Enter first Number: ");
				float a=sc.nextFloat();
				prints("Enter Second Number: ");
				float b=sc.nextFloat();
				printsn("Addition result:"+(a+b));
				break;
			}
			case 5:
				{
					prints("Enter first Number: ");
					float a=sc.nextFloat();
					prints("Enter Second Number: ");
					float b=sc.nextFloat();
					printsn("Remainder result:"+(a%b));
					break;
				}
			case 2:
				{
					prints("Enter first Number: ");
					float a=sc.nextFloat();
					prints("Enter Second Number: ");
					float b=sc.nextFloat();
					printsn("Subtraction result:"+(a-b));
					break;
				}
			case 3:
				{
					prints("Enter first Number: ");
					float a=sc.nextFloat();
					prints("Enter Second Number: ");
					float b=sc.nextFloat();
					printsn("multiplication result:"+(a*b));
					break;
				}
			case 4:
    			{
					prints("Enter first Number: ");
					float a=sc.nextFloat();
					prints("Enter Second Number: ");
					float b=sc.nextFloat();
					printsn("Division result:"+(a/b));
					break;
				}					
		}

	}



	public static void prints(String s){
		System.out.print(s);
	}

	public static void printsn(String s){
		System.out.println(s);
	}
}
