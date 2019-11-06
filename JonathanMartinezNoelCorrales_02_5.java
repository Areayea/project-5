


import java.util.Scanner;  //Access Scanner Class
import java.io.*;          //Access FileWriter

public class JonathanMartinezNoelCorrales_2_05{
   
   public static int readData(Employee empl, Scanner input){
   
      return 0;
      } //End method
      
      //*************************************
      
   public static void calcGrossPay(Employee empl, int numRead){
      
      } //End method
      
      //*************************************
      
   public static void calcDeductions(Employee empl, int numRead){
   
      } //End method
      
      //*************************************
      
   public static void printReport(Employee empl,int nread, PrintWriter output){
      PrintHeading();
      PrintDetail();
      PrintSummary();
      
      } //End method
      
      //*************************************
   
   public static void main(String[] args) throws IOException {
   
      File inputDataFile = new File(INPUT_FILE);
      Scanner inputFile  = new Scanner(inputDataFile);
      
      FileWriter outputDataFile = new FileWriter(OUTPUT_FILE);
      PrintWriter outputFile = new PrintWriter(outputDataFile);
      
      Employee empl = new Employee[2];
         while (inputFile.hasNext()){
            empl[i] = new Employee();
            empl[i].hoursWorked = input.nextDouble();
            empl[i].payRate = input.nextDouble();
         } //End while
         
    } //End main
    
} //End class
            
