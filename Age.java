package test;
import java.util.*;
import java.util.Scanner;

public class Age {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE AGE OF THE PERSON");
		byte age;
		age=sc.nextByte();
		if(age<0|| age>=150)
		{
			System.out.println("INVAILD TO VOTE");	
		}
		else if (age >=18)
		{
			System.out.println("ELIGABLE FOR VOTE");
		}
		else
		{
			System.out.println("INVAILD TO VOTE");
		}
	}

}
