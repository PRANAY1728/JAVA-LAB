package company;
import java.lang.Math;
import java.util.Scanner;


public class Main 
{
	static void main(int b,int a)
	{
		int i1 = b;
		int i2 = a;
		int r1 = (i1*i2)/2;
		System.out.println("Area of the triangle in int case  of two variable:"+r1);
	}
	static void main(float l,float b)
	{
		float f1 = b;
		float f2 = l;
		float r2 = (f1*f2)/2;
		System.out.println("Area of the triangle in float case  of two variable:"+r2);
	}
	static void main(int b,int l,int h)
	{
		int s=0;
		int i3 = b;
		int i4 = l;
		int i5 = h;
		int r3 =(int)Math.sqrt((s - i3)*(s-i4)*(s - i5));
		System.out.println("Area of the triangle in int case  of three variable:"+r3);
	}
	static void main(float l,float b,float h)
	{
		int s=0;
		float f3 = b;
		float f4 = l;
		float f5 = h;
		float r4 = (int)Math.sqrt((s - f3)*(s-f4)*(s - f5));
		System.out.println("Area of the triangle in float case  of three variable:"+r4);
	}
   public static void main(String[] args)
   {
	 Scanner sc = new Scanner(System.in); 
	 int p1,p2;
	 System.out.println("Enter the sides of triangle in int case  of two variable:");
	 p1 = sc.nextInt();
	 p2 = sc.nextInt();
	 main(p1,p2);
	 System.out.println("\n");
	 float q1,q2;
	 System.out.println("Enter the sides of triangle in float case  of two variable:");
	 q1 = sc.nextFloat();
	 q2 = sc.nextFloat();
	 main(q1,q2);
	 System.out.println("\n");
	 int p3,q3, t3;
	 System.out.println("Enter the sides of triangle in int case  of three variable:");
	 p3 = sc.nextInt();
     q3 = sc.nextInt();
	 t3 = sc.nextInt();
	 main(p3,q3,t3);
     System.out.println("\n");
	 float p4,q4,t4;
	 System.out.println("Enter the sides of triangle in float case  of three variable:");
	 p4 = sc.nextFloat();
	 q4 = sc.nextFloat();
	 t4 = sc.nextFloat();
	 main(p4,q4,t4);
	 System.out.println("\n");
   }

}