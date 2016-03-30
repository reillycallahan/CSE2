//Reilly Callahan
//CSE2 hw09
//March 3/29

//use methods of the same name to rectangularize

//import random class and scanner
import java.util.Random; //random
import java.util.Scanner;//scanner


public class Rectangularize{//construct class
    
    public static void main(String[] args){ //main method
        Scanner scan = new Scanner(System.in); //declare and construct scanner
        System.out.println("Please enter a word and a number:   ");
       //get them to input a word, either an int or a string
       if( scan.hasNextInt() ){ //if its an int...
            int number = scan.nextInt(); //assign the value entered
            System.out.println("Output: ");//let user know the ouput is about to be printed
            rectangle(number); //do the int method
       }
       else{//if you dont enter an int...
           String hi = scan.nextLine(); //assign teh input to a string
            System.out.println("Output: "); //let user know the ouput is about to be printed
           rectangle(hi); //do the string method
       }
    }
    
    public static void rectangle (int num) { //the int method...
        for( int t = 1; t <= num; t++){//for every t between 1 and the number entered, 
           System.out.print("%"); //print a percent sign
        } 
    }//end of int method
    
    public static void rectangle( String word ){//the string method...
        int n = word.length(); //find the length of the string
        for ( int t = 1; t <= n; t++){ //for every t between 1 and the length, 
            System.out.println(word);//print the entered String on a new line
        }
    }//end of string method
    
}//end of class
