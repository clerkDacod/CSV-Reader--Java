import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataProcessor{
    
    private String csvFile = "Voters_3.csv";
    private BufferedReader reader = null;
    private String row = "";
    private Voter[] voters = new Voter[70];


    public DataProcessor(){
        this.getData();
     }

     public Voter[] getVoters(){

        return this.voters;
     }
    
    

public void getData(){

    int i = 0;
    
     try {

            reader = new BufferedReader(new FileReader(csvFile));
            reader.readLine(); //reads first line
            while ((row = reader.readLine()) != null) {

                // slit line using comma as CSV is comma delimited
                String[] voter = row.split(",");
                
                try {
                        
                       //this.b.insert(new Dam(dam[3],dam[12],dam[44]));
                       voters[i]= new Voter(voter[0],voter[1]);
                        
                        i++;
                        
                } catch ( IndexOutOfBoundsException e ) {
                        
                }

            }

        }
     
     catch (FileNotFoundException e) {
         
        System.out.println("The file is missing");
     
     } catch(IOException e){
         
         System.out.println(e);
     } finally {
     
     if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) { 
                    
                    System.out.println(e);
                }
         }
     }   
    
}

}
