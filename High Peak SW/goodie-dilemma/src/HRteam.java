import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class HRteam {
	

	public static void main(String[] args) {
		
		//1. write a path to the input file.
		String filename ="C:\\Users\\user\\Desktop\\High Peak SW\\sample_input.txt";
		
		//2. Create a file in java.
		File inputfile = new File(filename); 
		
		//3. create a array for storing the data's of input file
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of employess:");
		
		int num = sc.nextInt();
		String[] gifts = new String[num+1];
		
		//intializing buffered reader
		BufferedReader br,in;
		
		try {
			 br = new BufferedReader(new FileReader(inputfile));
			 
			 //4. Read the data in inputfile.
			 
			 for(int i =0; i<=num;i++) {
				 gifts[i]=br.readLine();
			 }
			 
			 //5. close the file .
			 br.close();
			 
		} catch (FileNotFoundException e) {
			System.out.println("ERROR : File not found.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR : Couldn't Read the File.");
			e.printStackTrace();
		}
		//Dispaly of selected items 
		System.out.println();
		System.out.println("Here the goodies that are selected for distribution are:");
		System.out.println();
		for(int i =0; i<=num;i++)
		{
		System.out.println(gifts[i]);
		}
		
		//Array to analysis the lowest and higest prices
		int[] Prices= {999,2195,2799,4999,7980,9800,9999,11101,22349,229900};
		int diff=Prices[num-1]-Prices[0];
		System.out.println();
		System.out.println("And the difference between the chosen goodie with highest price and the lowest price is "+diff);
		

	}

}
