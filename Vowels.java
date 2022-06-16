package test;
import java.util.*;
import java.util.Scanner;

public class Vowels {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE STRING:");
		char ch;
		String str = sc.nextLine();
		for(int i=0; i < str.length();i++)
		{
			if((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ))
			{
				System.out.println(""+str.charAt(i));
			}
		}
	}

}
