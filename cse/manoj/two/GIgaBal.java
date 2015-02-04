package cse.manoj.two;

import java.util.Scanner;

public class GIgaBal {

	public static void main(String[] args)
	{

		Scanner stdin = new Scanner(System.in);
		String[] lines = new String[100];
		int i = 0;
		while(stdin.hasNextLine()) 
		{
			lines[i]= stdin.nextLine();
			i++;
		}
		
		
		System.out.println("****");
		System.out.println(lines);
		
		stdin.close();
	}
}
