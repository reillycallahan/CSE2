/*Reilly Callahan
CSE 2 Lab07 
March 11, 2016*/

//Bowtie 

//print a bowtie pattern using nested loops

//import scanner
import java.util.Scanner;

//open class and main method
public class Bowtie{//class
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
        
        
        //
      //  int j = 9;
        /*for( int nStars = 9; nStars > 0; nStars--){
             
           // System.out.println(nStars + " " + j);
            for( int i = 0; i < nStars; i++){ 
                System.out.print("*");
                
            }
            System.out.println(" ");
            
           //System.out.println(nStars + " " + j);
          /* while (j >= nStars && j < 12 ){
               
                 System.out.print(" ");
                 
                 j++;
            }*/
            
            /*for ( int k = nStars; k > 0; k--){
                k = 5 - k; 
                
                System.out.print(k + " ");
                
                //break;
            }*/
            String temp = "";
            for(int nStars = 9; nStars > 0; nStars--){
	            for( int j = 9; j > 0; j--){
	                
	                while ( j <= 9 ){
	                    System.out.print(" ");
	                    j++;
	                }
	                j = nStars - 2;
	                break;
	            }
	            for(int i = 0; i < nStars; i++){
		            
		            System.out.print("*");
	            }
	            
	             System.out.println(" ");
	             nStars = nStars - 1;
            }
         //   nStars = nStars - 1;
           // j = nStars - 1;
           // System.out.println(nStars + " " + j);
            
        //}
    }
}