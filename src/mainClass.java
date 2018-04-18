import java.util.Scanner;
import java.math.BigInteger;

public class mainClass{
	
	public static void main(String args[]){

        BigInteger bi1 =  new BigInteger("1234567890012");
        BigInteger bi2 = new BigInteger("70");

        String[] array = new String[4];

        array[0] = "Zero";
        array[1] = "One";
        array[2] = "Two";
        array[3] = "Three";

        System.out.println(bi1.mod(bi2));
        System.out.println(array[bi1.mod(bi2).intValue()]);

	// DataProcessor dp = new DataProcessor();

	// HashTable  hashTable = new HashTable(70,dp.getVoters());

	// //hashTable.getName("201");


    
	// Scanner reader = new Scanner(System.in);  // Reading from System.in
 //    System.out.println("Enter an ID number: ");
 //    String n = reader.nextLine(); // Scans the next token of the input as an int.
 //    //once finished
    

 //    while(!n.equalsIgnoreCase("exit")){


 //    	hashTable.getName(n);
 //    	System.out.println("\n");

 //    	System.out.println("Enter an ID number: ");

 //    	n = reader.nextLine();

 //    }


 //    reader.close();


	}
}