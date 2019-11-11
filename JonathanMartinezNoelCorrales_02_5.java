


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
      printHeading();
      printDetail();
      printSummary();
      
      } //End method
      
      //*************************************

   public static void printHeading (PrintWriter outputFile)
   {
      System.out.print("");
      outputFile.print("");
   }

   //****************************************

   public static void printDetail()
   {

   }

   //*******************************************
   public static void printSummary()
   {
      
   }
   
   public static void main(String[] args) throws IOException {
   
  
      final String INPUT_FILE  = "JonathanMartinez_2_01_Input.txt";
      final String OUTPUT_FILE = "JonathanMartinez_2_01_Output.txt";

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
            
