import java.util.Arrays;
import java.math.BigInteger;
/*

@author Dacod Magagula

This application uses hastables to lookup the names of registered voters given their ID Number

*/

public class HashTable {

	private Voter[] theArray;
	private int arraySize;
	private int itemsInArray = 0;

     

    /*
      Constructor

    */

	public HashTable(int size, Voter[] votersArray) {

		arraySize = size;

		theArray = new Voter[size];

		//Arrays.fill(theArray, new Voter("-1","empty"));

		// System.out.println(votersArray.length + " is the length");
		// System.out.println(votersArray[20].getName() + " is the name of the first element");

		this.hashFunction(votersArray);

	}


	// public static void main(String[] args) {

		

		

		
	// 	Voter[] votersToAdd = new Voter[7];
	// 	votersToAdd[0]= new Voter("112233","Blob");
	// 	votersToAdd[1]= new Voter("1152233","Sam");
	// 	votersToAdd[2]= new Voter("113433","Raj");
	// 	votersToAdd[3]= new Voter("1192233","Orange");
	// 	votersToAdd[4]= new Voter("115227333","Sam");
	// 	votersToAdd[5]= new Voter("11343223","Raj");
	// 	votersToAdd[6]= new Voter("1103992233","Orange");
		

	// 	HashTable theFunc = new HashTable(7,votersToAdd);





	// 	theFunc.getName("112233");

	// 	//theFunc.displayTheStack();

	// }


    /*

	Takes in the array with the users, 
    */

	public void hashFunction(Voter[] votersArray) {

		try{


			for (int n = 0; n < votersArray.length; n++) {

			Voter newElementVal = votersArray[n];

			
           BigInteger idNumber =  new BigInteger(newElementVal.getId());
           BigInteger mod = new BigInteger("70");



			//int arrayIndex = Integer.parseInt(newElementVal.getId()) % 70;

           int arrayIndex = idNumber.mod(mod).intValue();

			System.out.println("Index = " + arrayIndex + " for "
			 		+ newElementVal.getName());

			

			while (theArray[arrayIndex] != null) {

				++arrayIndex;

				//Collission try next index
				System.out.println("Collision Try " + arrayIndex + " Instead");

				

				

				arrayIndex %= arraySize;

			}

			this.theArray[arrayIndex] = newElementVal;

		}


		}catch(NullPointerException e){

		}

		
	}

	

	public String getName(String id) {

		System.out.println("\nSearching for ID number "+id+" ....");



		try{
         

         BigInteger idNumber =  new BigInteger(id);
         BigInteger mod = new BigInteger("70");

			
		//int arrayIndexHash = Integer.parseInt(id) % 70;

         int arrayIndexHash = idNumber.mod(mod).intValue();

      

        



		while (theArray[arrayIndexHash].getId() != null) {

			

			if (theArray[arrayIndexHash].getId().equals(id)) {

				
				System.out.println("The name of the voter with the id number "+id+" is "+theArray[arrayIndexHash].getName());

				return theArray[arrayIndexHash].getName();

			}

		

			++arrayIndexHash;

			arrayIndexHash %= arraySize;

		}

		



		}catch(NullPointerException e){

			System.out.println("There is no registered voter with the ID number "+id);

		}catch(NumberFormatException e){
			System.out.println("Number Format Exception");
		}
		

		

		return "Not Found!";

	}


	public Boolean compare(String one, String two){
		if(one.equals(two) ){
			return true;
			
		}else{
			return false;

		}
	}



}