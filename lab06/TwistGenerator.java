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
        //prompt for input
        System.out.println("Enter the desired length: ");
        //validate input
        // int length = scan.nextInt();
        int length = 0;
        boolean check = true;
        while (check) {
            if ( scan.hasNextInt()){
                 length = scan.nextInt();
                 if ( length > 0 ){
                     check = false;
                 }
                 else{
                     System.out.println("Sorry, enter a positive integer");
                     break;
                 }
            }
            else{
                 System.out.println("Sorry, enter an integer");
                 break;
            }
             
        }
        //start a counter
        int t = 0;
        int m = 0;
        while ( t < length ){
            
            while ( length % 3 == 0){
                int groups = length / 3;
                while (t < groups){
                    System.out.println(" \\ // ");
                    System.out.println("  x  ");
                    System.out.println("// \\ ");
                    t++;
                }
            }
            while (length % 3 == 1 ){
               int groups = length / 3;
               while ( t < groups ){
                    System.out.println(" \\ // ");
                    System.out.println("  x  ");
                    System.out.println("// \\ ");
                    t++;
                    
                    
               }
               System.out.println(" \\ ");
               System.out.println("    ");
               System.out.println(" // ");
           }
            while (length % 3 == 1 ){
               int groups = length / 3;
               while ( t < groups ){
                    System.out.println(" \\ // ");
                    System.out.println("  x  ");
                    System.out.println("// \\ ");
                    t++;
               System.out.println(" \\ ");
               System.out.println("  x  ");
               System.out.println(" // ");
                }
            t++;
            }
        
        }   
    }
}