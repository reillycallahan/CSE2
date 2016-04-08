/* Reilly Callahan
CSE2 Lab10
April 8, 2016 */

//Grades program
//wokring with string arrays
//create two arrays, one where the user can input names, and the other
    //where grades are randomly generated

import java.util.Scanner;
import java.util.Random;

public class Grades {
    public static void main(String[] args) {
        //construct Random and scanner
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        
        //pick a random number from 5 to 10
        int size = rand.nextInt(6) + 5;
        System.out.println(size);
        
        // construct the arrays
        String[] names = new String[size]; //the student names
        int[] grade = new int[size];
        
        //prompt them to enter names
        System.out.println("Please enter " + size + " student names: ");
        for(int i = 0; i < size; i++){ //for each student in the  class..
            names[i] = scan.nextLine();//input a name
            grade[i] = rand.nextInt(101);
        }
        System.out.println(" ");
        System.out.println("Here are the midterm grades of the " + size  + " students above: ");
        for( int i = 0; i < size; i++){//for each student..
            System.out.println( names[i] + " : " + grade[i] );
        }
        
        
        
        
    }//end of main method
    
}//end of class