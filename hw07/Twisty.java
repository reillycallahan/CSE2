/*Reilly Callahan
CSE 2 Hw07 
March 22, 2016*/

//Twisty 

//ask user to input two values that then create a 'double twist' pattern

//import scanner
import java.util.Scanner;

//open class and main method
public class Twisty{//class
    public static void main(String[] args){//main method
        
        Scanner scan = new Scanner(System.in);//construct and declare scanner
        
        //validate and assign input --both must be ints, width must be < length, length < 80
        System.out.println("Please engter desired length as an integer: "); //prompt for entering lenght
        boolean check = true;//intialize boolean for validation in while loop
        int length = 0; //intialize the length 
        while( check ){ //while true...
            if( scan.hasNextInt() ){//if its an int...
                length = scan.nextInt(); //store the int as length
                if( length < 80 ){//if length is less than 80 characters...
                    check = false; //change the boolean so that code can exit the while loop
                }
                else{//length is 80 or more..
                    System.out.println("Sorry, please enter a length less than 80: "); //tells user that
                        //input is invalid and code loops around to ask again
                }
            }
            else{ //if not an int...
                System.out.println("Sorry, please enter a valid int: ");//prompts user to enter int
                scan.next(); //allows user to input again
            }
        }
        System.out.println("Please engter desired width as an integer: "); //prompt for entering width
        boolean check2 = true; //intiialize second boolean for validating the width
        int width = 0; //initialize wifth
        while ( check2 ){
           if( scan.hasNextInt() ){//if its an int...
                width = scan.nextInt(); //store the int as width
                if( width < length ){//if width is less than length...
                    check2 = false; //change the boolean so that code can exit the while loop
                }
                else{//length is shorter than width
                    System.out.println("Sorry, please enter a width smaller than length: "); //tells user that
                        //input is invalid and code loops around to ask again
                }
            }
            else{ //if not an int...
                System.out.println("Sorry, please enter a valid int: ");//prompts user to enter int
                scan.next(); //allows user to input again
            } 
        } //code only gets here after all input is validated
        
        //work with input to make the twisty pattern
        
        //i'm commenting with the way i figured out the pattern: 
            //starting with the pattern of the first row and then
            // generalizing for width number of rows ... 
        
        int count = 1; // start with a counter, counting the 'digits' or 'entries' 
        int spacing = 0;//start a spacing counter, counting the number of spaces to put before the
            //pattern starts --> important for all lines except the first and last
        int width2 = width * 2; //every cycle repeats after width2 number of 'digits'
        for( int w = 1; w <= width; w++ ){ //start a for loop for the width, so that you loop 
            //through for every row width number of times
            for( int l = 1; l <= length; l++ ) { //start a loop for length, so that you loop through
                //for every 'digit' in the length
                if( (l - spacing) % width2 == 1 ){ //if the digit youre working on is the beginning of a cycle (which
                    //is width2 long)... this will print the down-to-the-right hashtags
                    System.out.print("#"); //print a hashtag
                }
                else if( (l - spacing) % width == 1 ){ //if the digit youre working on is the beginning of the inner
                    //pattern (which is width 'digits' long), but not the beginning of a cycle (because else if)...
                    //this will print the down-to-the-right slashes
                    System.out.print("\\"); // print a backslash
                } 
                else if( (l + spacing) % width2 == 0 ){ //if the digit youre working on is the end of a cycle (which
                    //is width long)...this will print the up-to-the-right hashtags
                    System.out.print("#"); //print a hashtag
                }
                else if( (l + spacing) % width == 0){//if the digit youre working on is on the en od the inner 
                    //patern (which is width 'digits' long), but not the end of a cycle (bc else if)...
                    //this will print the up-to-the-right slashes
                    System.out.print("/"); //print a slash
                }
                else{ //if the digit doesnt apply to any of these conditions...
                    System.out.print(" ");//print only a space
                }
            } //ends the length loop... the who row has now been printed
            System.out.println(" "); //print out on a new line to start the next row
            spacing++; //increment spacing for every row, so that you wont print the same row over and over
                //incrementing the spacing changes the 'digit number' that you work with
        }//ends width loop.. code is finished
    }//main meth
}//class
        