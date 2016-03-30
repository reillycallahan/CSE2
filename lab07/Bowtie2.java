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
      /*  boolean check = true; //intialize true boolean
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
        */
        int nStars = 9;
        int rows = 0;
        if( nStars % 2 == 0 ){
            rows = nStars / 2;
        }
        else{
            rows = nStars / 2 + 1;
        }
        System.out.print(rows);
       // for( int i = 1; i <= rows; i++ ){
           // System.out.print("i" + i);
            for( int j = nStars; j >= 1; j-- ){
                System.out.print("j" + j);
                for( int k = j; k >= 1; k-- ){
                    System.out.print("*");
                }
                System.out.println(" ");
                j--;
            }
        //}
        
        //you need to print spaces, but you cant have all your * prints inside the spaces loop bc you get mutliple chunks
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*for( int i = 1; i <= nStars; i++ ){ //
            System.out.print(i);
            for( int k = 1; k < rows; k++ ){
                System.out.print(" ");
            }
            for( int j = 0; j < i; j++ ){ //start a loop that prints i number of stars
                System.out.print("*");
            }//star printing loop ends
            
            System.out.println(" ");
            i--;
        }*/

        
    }
}