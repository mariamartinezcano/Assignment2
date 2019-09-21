

import java.util.Scanner;

public class Decryption {
	public static void main(String[] args) {
		int temp;
		int length = 4;
		int[] encr = new int[length];
		int[] decr = new int[length];
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the encrypted 4-digit code (* * * *): ");
		
		for (int i = 0; i < length; i++)
		{
			encr[i] = in.nextInt();
		}
		
		// swap digits back
		temp = encr[0];
		encr[0] = encr[2];
		encr[2] = temp;
		
		temp = encr[1];
		encr[1] = encr[3];
		encr[3] = temp;
		
		for (int i = 0; i < length; i++)
		{
			if ((encr[i] >= 0) && (encr[i] < 7))
				encr[i] = encr[i] + 10;
			else
				encr[i] = encr[i];
		}
		
		for (int i = 0; i < length; i++)
			decr[i] = encr[i] - 7;

		System.out.print("Your decrypted code is ");
		for (int i = 0; i < length; i++)
			System.out.print(decr[i]);
		System.out.println("");
		
		in.close();
	}


}
