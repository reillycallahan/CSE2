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
            int nStars = 9;
            int spaces = nStars / 2;
            String temp = "";
            //for(nStars = 9; nStars > 0; nStars--){ //this was giving 9-1 stars, but it was going too many times
	            for( int i = 1; i <= spaces; i++ ){ //for i  between 1 and n...
                    for( int j = 1; j < (i + 1); j++ ){// for j between 1 and (i+1)... 
                        System.out.print(i); //print i = x, x number of times. this foes in an increasing direction
                      //when i = 2, you want to print 7 stars
                      
                        
                       
                    }
                    
                    for(int k = i; k <= nStars; k++){ //not sure if i use this, or the one below
                    //for(nStars = 9; nStars > 0; nStars--){
        	           System.out.print("*");
        	           //we dont want this to completely start over. its going from 0-9 every loop
        	           //when i=2, we want nStars - 1 to print
        	           k = k + 1;
        	           
        	                
        	       }// end of j= 1 --> i+1 loop
                    if( i == spaces ){
                        
                    } 
                    else{
                        System.out.println(" ");//enter a new line
                    }
                }
                /* for( int j = 9; j > 0; j--){
	                
	                while ( j <= 9 ){
	                    System.out.print(" ");
	                    j++;
	                }
	                j = nStars - 2;
	                break;
	            }*/
	            /*for(int i = 0; i < nStars; i++){
	                System.out.print("*");
	            }*/
	             System.out.println(" ");
	             nStars = nStars - 1;
           // }
           
            // end of i=1 --> n loop
         //   nStars = nStars - 1;
           // j = nStars - 1;
           // System.out.println(nStars + " " + j);
            
        //}
    }
}