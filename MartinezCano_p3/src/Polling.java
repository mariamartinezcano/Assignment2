import java.util.Scanner;

public class Polling {
	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		String[] issues = new String[5];
		int numEnter;
		int[][] array = new int[5][10];
		int userInput;
		
		issues[0] = "Plastic Polution";
		issues[1] = "Global Warming";
		issues[2] = "Politics";
		issues[3] = "Education";
		issues[4] = "Area 51";
		
		System.out.print("How many people are taking the survey? ");
		numEnter = scnr.nextInt();
		
		for (int i = 0; i < numEnter; i++)
		{
			System.out.println("Rate the issues from 1-10 (least important to most):");
			System.out.print(issues[0] + ": ");
			userInput = scnr.nextInt();
			userInput = userInput - 1;
			userInput = array[0][userInput];
			array[0][userInput] = array[0][userInput];
			System.out.print(array[0][userInput]);
			/*System.out.print(issues[1] + ": ");
			System.out.print(issues[2] + ": ");
			System.out.print(issues[3] + ": ");
			System.out.print(issues[4] + ": ");*/
		}
		
		
		scnr.close();
	}


}
