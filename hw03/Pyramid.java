//Reilly Callahan
//CSE2 hw3
//PYRAMID
//Due Feb 16, 2016

//task: ask for a user to input a pyramid's dimensions and then print
    //the volume of the pryamid

//import scanner
import java.util.Scanner; 
//open the class and main method
public class Pyramid {
    public static void main(String[] args){
        //declare and construct scanner
        Scanner myScanner = new Scanner (System.in); 
        
        //collect input
        System.out.print("Enter the length of one square side of the pyramid in the form xx.xx: ");
            //prompts the user to enter a length of the base
        double side = myScanner.nextDouble();
            //allows user to input the side of the square
        System.out.print("Enter the height of the pyramid in the form xx.xx: ");
            //prompts the user to enter a height of the pyramid
        double height = myScanner.nextDouble();
            //allows the user to input the height
        
        //do calculations
        double volume = side * side * height / 3;
            //uses the side and height to find volume with formula: lwh/3
        
        //print out the volume
        System.out.println("The volume inside the pyramid is: " + volume + ".");
    }
    
}