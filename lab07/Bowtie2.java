/*Reilly Callahan
CSE 2 Lab07 
March 11, 2016*/

//Bowtie 

//print a bowtie pattern using nested loops

//import scanner
import java.util.Scanner;

//open class and main method
public class Bowtie2{//class
    public static void main(String[] args){//main method
        //construct and declare scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user for an odd integer between 3 and 33
        System.out.println("Please enter an integer between 3 and 33: ");
        
        //validate the input with a while loop
        boolean check = true; //intialize true boolean
        int n = 0; //intialize scanner input variable
        while (check){//while true
            if( scan.hasNextInt() ){ //while its an int
                n = scan.nextInt(); //takes an int from user
                if ( (n - 1) % 2 == 0){ //if its odd
                    if( n >= 3 && n <= 33 ){// if it's within range
                         check = false; //change it to false so code 
                            //exits the while loop
                    }
                    else{// if its out of range
                        System.out.println("Sorry, your input was out of range. Re-enter: ");
                    }
                }
                else{//if its even
                    System.out.println("Sorry, please enter an odd int: ");
                }
            }
            else{// if its not an int
                System.out.println("Sorry, please enter a valid int: ");
                scan.nextLine();
                
            }
        }
        //first, cosntruct the bowtie with for loops. This is the only loop that I heavily commented.
        
        //lets strat on the top triangle
        for( int i = 1; i <= n ; i+=2){ //between 1 and the max number of stars..
            for(int k = 1; k <= (i/2); k++){ //between 1 and half of the outer index..
                System.out.print(" ");//print a space
                //we use end bound divided by two because the max number of spaces
                    //is half of the max number of stars
            }
            for(int j = n; j >= i; j--){ //bwteen max number of stars and 1..
                System.out.print("*");//print a single star
            }
            System.out.println("");//now, before incrememnting i, print a new line
        }//ends first triagnle
        for( int i = 1; i <= n ; i+=2){//between 1 and the max number of stars..
            if( i != 1 ){
                for(int k = (n/2); k > (i/2); k--){ //between half the number of stars and half the  outer index..
                    System.out.print(" "); //print a space
                    //divide by two bc the max number of stars is double the number of spaes
                    //this starts at n/2, opposed to 1 from above, so that it'll print the max
                        //number of spaces and then print less spaces with each line
                }
            }
            
            if( i != 1){
                for(int j = i; j >= 1; j--){ //between outer index and 1...
                System.out.print("*");//print a star on the same line
                //the index goes i--> 1 (instead of n-->1) so that it'll print the minimum number
                    //of stars first, and then incremement upwards
                }
                System.out.println("");//now, before incrememnting i, print a new line
            }
            
        }//ends bowtie
        
        
        //now, do the 
        
                  
        
    }//main method end
}//class end