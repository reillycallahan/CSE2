/*
Reilly Callahan 
CSE 2 hw 06
Due March 8, 2016
*/

//Calculate the factorial of a user's input number

//import scanner
import java.util.Scanner;

//open class and main method
public class RunFactorial{ //class
    public static void main(String[] args){ //main method
    
        Scanner myScanner = new Scanner(System.in);//construct scanner
        
        //prompt user to input
        System.out.println("Enter an integer between 9 and 16: ");
        
        //validate the input
        boolean check = true;//intiialize boolean
        int n = 0;//initialize n 
        while ( check ){ //while boolean is true
            if( myScanner.hasNextInt() ){ //if its an integer...
                n = myScanner.nextInt(); //asks for an int
                if( n >= 9 && n <= 16 ){ //if its between a valid range...
                    check = false;//makes code exit the while loop
                }
                else{//if its a negative int or not within 9 and 16...
                    System.out.println("Sorry, please enter an int within range: "); //prompts for another int
                    //loops back around to the outer if statement and gets a new int
                }
            }
            else{ //if its not an int...
                System.out.println("Sorry, please enter an integer: "); //prompts for an actual int
                myScanner.nextLine(); //asks again for a valid input
            }
        }//code exits the while loop after all code is validated
        //now do caluclations
        int n1 = n; //intiialize n1
        long fact = 1; //intiialze factorial
        while ( n1 > 0 ){
            fact = n1 * fact;
            n1--; //decreases by one
        }
        System.out.println(n + "! = " + fact); //prints out the orignal number and the factorial
    }
}