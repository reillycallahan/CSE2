//Reilly Callahan
//March 4, 2016
//CSE 2 lab 6

/*Twist Generator
    ask for a positive integer and validate via while loop
    prints out A twist that is the length of the input int
*/

//import scanner
import java.util.Scanner;
//open class and main method
public class TwistGenerator{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in); //constructs Sacanner
        
        //take input
        System.out.println("Enter the desired length: "); //prompt for input
        //validate input 
        int length = 0; //initialize varibale for input
        boolean check = true; //intialize boolean for validation in while loop
        while (check) { //while it's true, run
            if ( scan.hasNextInt() ){ //asks user for input
                 length = scan.nextInt(); //if its an int, store the value
                 if ( length > 0 ){ // if its positive...
                     check = false; //change boolean to exit while loop
                 }
                 else{ //if its negative...
                     System.out.println("Sorry, please enter a positive integer: ");
                        //prompts again for a positive input
                        //code will loop back around for user to input again
                 }
            }
            else{ // if its not an int...
                 System.out.println("Sorry, please enter an integer: ");
                    //prompt again for an int
                 scan.next(); //asks again for an int
            }
        }//input has now been validated.
        
        
        //work with the input to make the twist
        
        int t = 1;//start a counter
        while( t <= length ){ //start with a condition to enter the while loop
            int groups = length / 3; //divide the length by 3 to dtermine
                //how many complete groups you have 
                
            //if length is 1 or 2, then you dont have any complete groups.      
            if ( length == 1 ){ //if lenght is 1, you only print two slashes
                System.out.println("\\"); //print backlash
                System.out.println("");//second line is blank
                System.out.println("/");//print slash on third line
            }
            if ( length == 2 ){ //if length is 2, you only print 3 things
                System.out.println("\\");//first line is backslash
                System.out.println(" x ");//second line is x
                System.out.println("/");//third line is slash
            }
            
            while ( t <= groups ){ //creates another loop for the number of 
                //complete groups to print
                System.out.print(" \\ /"); //on one line, print / \
                if ( t == groups && length % 3 != 0 ){//if its the last loop
                    //of the while loop and if it length goes beyond
                    // a complete grouping, print this on the same line...
                    if( length % 3 == 1 || length % 3 == 2 ){ //if it goes  past...
                        System.out.print(" \\  ");//print a backslash
                    }
                }
                t++; //increment t so that it leaves the loop of the first
                    //print line after its printed enough complete groups
            }
            System.out.println(" "); //print a space so that the next info 
                //will be printed on a second line
            t = 1; //re-initialze t 
            while ( t <= groups ){//creates another loop for the number of 
                //complete groups to print
                System.out.print("  x "); //on one line (the second line) print x
                if ( t == groups && length % 3 != 0 ){//if its the last loop
                    //and if it goes beyond the complete grouping
                    if( length % 3 == 1){ // if it goes one past...
                    //do nothing on the second line
                    }
                     if( length % 3 == 2){ //if it goes two past...
                        System.out.print("  x  "); //print an x on this line
                    }
                }
                t++; //increment t so that it leaves the loop of the first
                    //print line after its printed enough complete groups
            }
            t = 1; //re-initialize t
            System.out.println(" "); //print a space so that the next info 
                //will be printed on a third line
            while ( t <= groups ){//creates another loop for the number of 
                //complete groups to print
                System.out.print(" / \\"); //on one line (3rd line) print / \
                if ( t == groups && length % 3 != 0 ){//if its the last loop
                    //and if it goes beyond the complete grouping
                    if( length % 3 == 1 || length % 3 == 2 ){ // if it goes one or two past...
                        System.out.print(" /  ");  //print a slash
                    }
                }
                t++;//increment t so that it leaves the loop of the first
                    //print line after its printed enough complete groups
            }
            break;
        }
    }
}