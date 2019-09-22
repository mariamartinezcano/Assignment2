import java.util.Scanner;

public class Polling {
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        int i, numpeop, y = 0, temp, sum = 0;
	        double[] avg = new double[5];
	                
	        String[] topics = new String[5];
	        
	        topics[0] = "Politics";
	        topics[1] = "Sports";
	        topics[2] = "Enviromental";
	        topics[3] = "Food";
	        topics[4] = "Video Games";
	              
	        System.out.println();
	        
	        int[][] arr = new int[5][10];
	        
	        System.out.println("Enter the amount of people taking this survey: ");
	        
	        numpeop = sc.nextInt();
	        
	        for(i = 0; i < numpeop; i++)
	        {
	            System.out.println("In this survey you are going to be rating the following topics");
	            System.out.println("Rate the following topics 1 - 10 (1 being least important and 10 being the most");
	            System.out.println("Politics: ");
	            temp = sc.nextInt();
	            y = temp - 1;
	            if(arr[0][y] == 0)
	                arr[0][y] = 1;
	            else
	                arr[0][y] = arr[0][y] + 1;
	            
	            System.out.println("Sports: ");
	            temp = sc.nextInt();
	            y = temp - 1;
	            if(arr[1][y] == 0)
	                arr[1][y] = 1;
	            else
	                arr[1][y] = arr[1][y] + 1;
	            
	            System.out.println("Enviromental: ");
	            temp = sc.nextInt();
	            y = temp - 1;
	            if(arr[2][y] == 0)
	                arr[2][y] = 1;
	            else
	                arr[2][y] = arr[2][y] + 1;
	            
	            System.out.println("Food: ");
	            temp = sc.nextInt();
	            y = temp - 1;
	            if(arr[3][y] == 0)
	                arr[3][y] = 1;
	            else
	                arr[3][y] = arr[3][y] + 1;
	            
	            System.out.println("Video Games: ");
	            temp = sc.nextInt();
	            y = temp - 1;
	            if(arr[4][y] == 0)
	                arr[4][y] = 1;
	            else
	                arr[4][y] = arr[4][y] + 1;
	        }
	        
	        for(y = 0; y < 10; y++)
	        {
	            sum = sum + (arr[0][y] * (y + 1));
	        }
	        
	        avg[0] = sum / numpeop;
	        sum = 0;
	        
	        for(y = 0; y < 10; y++)
	        {
	            sum = sum + (arr[1][y] * (y + 1));
	        }
	        
	        avg[1] = sum / numpeop;
	        sum = 0;
	        
	        for(y = 0; y < 10; y++)
	        {
	            sum = sum + (arr[2][y] * (y + 1));
	        }
	        
	        avg[2] = sum / numpeop;
	        sum = 0;
	        
	        for(y = 0; y < 10; y++)
	        {
	            sum = sum + (arr[3][y] * (y + 1));
	        }
	        
	        avg[3] = sum / numpeop;
	        sum = 0;
	        
	        for(y = 0; y < 10; y++)
	        {
	            sum = sum + (arr[4][y] * (y + 1));
	        }
	        
	        avg[4] = sum / numpeop;
	        
	        System.out.println("Topics    1   2   3   4   5   6   7   8   9   10  AVG");
	        
	        for(i = 0; i < topics.length; i++)
	        {
	            System.out.print(topics[i] + "  ");
	            for(y = 0; y < 10; y++)
	            {
	                System.out.print(arr[i][y] + "  ");
	            }
	            System.out.println(avg[i]);
	            System.out.println();
	        }
	        sc.close();
	    }
	    
}

