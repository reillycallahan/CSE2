//Reilly Callahn 
//CSE2 hw3
//CONVERT
//Due Feb 16, 2016

//convert a user-defined number of meters to inches

//set up the scanner, class, and the main method
import java.util.Scanner; //imports scanner
public class Convert { //starts the class
    public static void main(String[] args){ //main method
        Scanner myScanner; //declares scanner
        myScanner = new Scanner (System.in); //constructs scanner
        
        //collect the input
        System.out.print("Enter the number of meters in the form xx.xx: ");
            //prompts user to enter meters
        double meters = myScanner.nextDouble(); 
            //allows user for number meters
        
        //calculations
        double inches = meters * 39.3701; //multiply meters by conversion factor to get inches
        //POTENTIALLY MAKE A VARIABLE FOR CONVERSION FACTOR???
        
        //print out the answer
        System.out.println(meters + " meters is " + inches + " inches."); //prints out the given meters and its conversion
    }
}