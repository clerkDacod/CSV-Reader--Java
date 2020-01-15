/*
@author Dacod Magagula email@dacod.co.za

*/

import java.util.Scanner;

public class pollingStation{
	
	public static void main(String args[]){

	DataProcessor dp = new DataProcessor();

	HashTable  hashTable = new HashTable(70,dp.getVoters());

	//hashTable.getName("201");


    
	Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter an ID number: ");
    String n = reader.nextLine(); // Scans the next token of the input as an int.
    //once finished
    

    while(!n.equalsIgnoreCase("exit")){


    	hashTable.getName(n);
    	System.out.println("\n");

    	System.out.println("Enter an ID number: ");

    	n = reader.nextLine();

    }


    reader.close();


	}
}