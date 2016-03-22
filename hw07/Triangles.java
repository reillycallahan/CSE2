/*Reilly Callahan
CSE 2 Hw07 
March 22, 2016*/

//Triangles 

//print out a mirrored triangle whose size is dependent on user input

//import scanner
import java.util.Scanner;

//open class and main method
public class Triangles{//class
    public static void main(String[] args){//main method
        
        Scanner scan = new Scanner(System.in);//construct and declare scanner
        
        //get and validate input 
        System.out.println("Please enter an integer between 5 and 30: ");//prompt user for input
        boolean check = true; //initialize a boolean for validation in while loop
        int n =  0; //intialize  vairbale n
        while ( check ){
            if ( scan.hasNextInt() ){ //if the input is an int..
                n = scan.nextInt(); //stores the value into n
                if ( n >= 5 && n <= 30 ){//if the int is within range..
                    check = false; //exit the while loop 
                }
                else{//if its not within range
                    System.out.println("Sorry, please enter an integer between 5 and 30: ");
                        //prompts to re-enter. then loops back around to ask again
                }  
            }
            else{//input is not an int
                System.out.println("Sorry, please enter a valid integer: "); //prompts to re-enter
                scan.next(); //asks again
            }
        }//exits only after input is valid
        
        //now, start printing the pattern
        
        //for loop first
        System.out.println("FOR LOOP: "); //prints indication of the start of a for loop
        for( int i = 1; i <= n; i++ ){ //for i  between 1 and n...
            for( int j = 1; j < (i + 1); j++ ){// for j between 1 and (i+1)... 
                System.out.print(i); //print i = x, x number of times. this foes in an increasing direction
            } // end of j= 1 --> i+1 loop
            System.out.println("");//enter a new line
        }// end of i=1 --> n loop
        for( int i = (n - 1); i >= 1; i--){ // for i between (n-1) and 1...
             for( int j = 1; j <= i; j++){ //for j between 1 and i ...
                System.out.print(i); ////print i = x, x number of times. this goes in a decreasing direction
            } // end of j --> i+1 loop
            System.out.println("");//enter a new line
        }
        
        //now while loop
        System.out.println("WHILE LOOP: ");//prints indication of the start of a while loop
        int i = 1; // initializes variable i 
        while( i <= n ){// while i is less than/= to n...
            int j = 1; //intiialzies variable j. this needs to happen every loop, so it's inside
                //the i--> n loop
            while( j < i + 1 ){ //while j is less than i +1 ...
                System.out.print(i);//prints i = x, x number of times, increasing direction
                j++; //invrement j
            }
            System.out.println("");//enter a new line
            i++; //increment i
        }
        i = n - 1; //re-assigns i to be n-1
        while( i >= 1 ){ //while n-1 is greater than/= to 1
            int j = 1; //intiialzies variable j. this needs to happen every loop, so it's inside
                //the i--> 1 loop
            while( j <= i ){ // while  j is less tha/= tp i...
                System.out.print(i); ////print i = x, x number of times.  decreasing direction
                j++; //increment j
            }
            System.out.println("");//enter a new line
            i--;//increment i
        }
        
        //now do-while loop
        System.out.println("DO-WHILE LOOP: ");//prints indication of the start of a do-while loop
        i = 1; //re-assigns i to be 1
        do {//open a do loop for when i is less than/= to n
            int j = 1;//intiialzies variable j. this needs to happen every loop, so it's inside
                //the i--> 1 loop
            do { //open anotehr do loop for when j is less than i +1 ...
                System.out.print(i);//prints i = x, x number of times, increasing direction
                j++;//increments j
            }while( j < i + 1 ); // the above happens while j is less than i +1
            System.out.println("");//enters new line
            i++;//increments i
        } while( i <= n );// the above happens while i is less than/= to n
        i = n - 1; // re-assign i to be n -1 
        do{//open a do loop for when i is greater than/= to 1
            int j = 1; //intiialzies variable j. this needs to happen every loop, so it's inside
                //the i--> 1 loop
            do{//open a do loop for when j is less than/= to i
                System.out.print(i);//prints i = x, x number of times, decreasing direction
                j++;//increments j
            }while( j <= i); //above happens while j is less than/= to i
            System.out.println(""); //enters new line
            i--;//increements i
        }while( i >= 1 );//above happens while i is greater than/= to 1
        
        
    }
}