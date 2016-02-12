//Reilly Callahan CSE2 Lab03
//Feb 12, 2016
//in this lab, calculate the price each person must pay for a
    //check after taking input for check, tip, and number of ppl
//import scanner
import java.util.Scanner;
//add the main method and the class
public class Check {
        //main  method
        public static void main(String[] args){
            Scanner myScanner; //declare scanner
            myScanner = new Scanner ( System.in); //construct scanner
            
            //collect inputs
            System.out.print("Enter the original cost of the check in the form xx.xx: ");
                //prompt the user to enter check cost
            double checkCost = myScanner.nextDouble(); //asks user to input checkCost
            System.out.print("Enter the percentage tip you wish to pay as a whole number in the form xx: ");
                //prompt the user to enter the tip
            double tipPercent = myScanner.nextDouble(); //asks user to input tip
            tipPercent /= 100; //converts the percentage to decimal
            System.out.print("Enter the number of people who went out to dinner: ");
                //prompts user to enter number of ppl at dinner
            int numPeople = myScanner.nextInt(); //allows user to input number ppl
            
            //initialize variables for calculations
            double totalCost; //check with tip
            double costPerPerson; // total cost divided by num ppl
            int dollars, //whole dollar amnt of cost
                dimes, pennies; //for storing digits to the right of decimal
            
            //start calculations
            totalCost = checkCost * (1 + tipPercent); //check with tip
            costPerPerson = totalCost / numPeople; //cost for each person
            System.out.println(tipPercent);
            System.out.println(totalCost);
            
            //help them make change by getting double into nicer format
            //convert dollars to int
            dollars = (int)costPerPerson;
            //get number of dimes
            dimes = (int)(costPerPerson * 10) % 10; //returns the remainder for whole num of dimes
            pennies = (int)(costPerPerson * 100) % 10;//returns the remainder for whole number of pennies
            System.out.println(costPerPerson);
            
            //print the amount that each person owes in a typical $xx.xx form
            System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
                
        }
}