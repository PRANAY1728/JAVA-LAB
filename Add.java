import java.util.*;
import java.util.Scanner;
class Adder{
	static float sum=0;
	static void add(float...a)
	{
	  sum=0;
	  for(int i= 0;i<a.length;i++)
	  {
		  sum = a[i]+sum;
	  }
	}
	static void printSum()
	  {
		  System.out.println(sum);
	  }
}

public class Add {

	public static void main(String[] args) {
	  //Add ob = new Add();
       float arr[] = new float[1000];
       Scanner sc = new Scanner(System.in);
       int n,ch;
       do
       {
    	   System.out.println("enter 1 TO RUN/0 TO EXIT");
    	   ch = sc.nextInt();
    	   if(ch ==1)
    	   {
    		   System.out.println("ENTER THE NO OF ELEMENTS TO BE INSERTED:");
    		   n = sc.nextInt();
    		   System.out.println("ENTER THE"+n+"ELEMENST INTO ARRAY:");
    		   for(int i = 0;i<n;i++)
    		   {
    			   arr[i] = sc.nextFloat();
    		   }
    		   Adder.add(arr);
    	   }
    	   else if(ch>1||ch<0)
    	   {
    		   System.out.println("INVAILD CHOICE:");
    		   break;
    	   }
    	   ch--;
       }
       while(ch!=0);
       Adder.printSum();
	}
}

