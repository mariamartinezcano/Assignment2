import java.util.Scanner;

public class Encrypt {
	
		public static void main(String[] args) 
		{
			int length = 4;
			int[] encr;
			encr = new int[length];
			int [] decr;
			decr = new int[length];
			int temp;
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Enter a 4-digit code (* * * *): ");
			
			for (int i = 0; i < length; i++)
			{
				decr[i] = in.nextInt();
			}
			
			for (int i = 0; i < length; i++)
				encr[i] = (decr[i] + 7) % 10;
			
			// swap first and third digit
			temp = encr[0];
			encr[0] = encr[2];
			encr[2] = temp;
			
			// swap second and fourth digit
			temp = encr[1];
			encr[1] = encr[3];
			encr[3] = temp;
			
			
			System.out.print("Your encrypted code is ");
			for (int i = 0; i < length; i++)
				System.out.print(encr[i]);
			System.out.println("");
			
			in.close();
		}

}


