//Reilly Callahan
//CSE 2 lab 11
//April 15, 2016

//using Search
//

//import the random class
import java.util.Random;

//import the scanner class
import java.util.Scanner;

//open class and main method
public class Search{ 
    public static void main(String[] args){
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int [] array1 = new int [50];
        int [] array2 = new int [50];
        
        for( int i = 0; i < 50; i++){//for each value in array1...
            array1[i] = rand.nextInt(101);//generates a random int 0 -101 and 
                //assigns that int to the current array value
        }//now all values have been assigned
      
        
        int max = array1[0]; //initialize a variable for max value
        int min = array1[0]; //initialize a variable for min value
        for( int i = 0; i < 50; i++ ){//for each value in array1...
            if( array1[i] > max){//if the current value is greater than the last..
                max = array1[i];
            }
            if( array1[i] < min){
                min = array1[i];
            }
        }//now you've found max and min
        System.out.println("The maximum value in array1 is: " + max + ". " +
            "The minimum value in array1 is: " + min);
        
        
        array2[0] = rand.nextInt(101); //assigns the first array2 value a random number 0 to 100
        for( int i = 0; i < 50; i++ ){
            
            int n = rand.nextInt(101);
            if( i != 0 ){
                array2[i] = n + array2[i - 1];
            }
        }//now youve assigned all array2
        
        int max2 = array2[49]; //since the array is increasing, the max is the last entry
        int min2 = array2[0]; //since its increasing, the min is the first member
        System.out.println("The maximum value in array2 is: " + max2 + ". " +
            "The minimum value in array2 is: " + min2);
        
        System.out.println("Please enter a positive int: ");
        boolean check = true;//initialize a boolean
        while(check){
            
            if( scan.hasNextInt() ){
               int n = scan.nextInt(); 
               check = false;
            }
            else{
                break;
            }
        }
        
        for( int i = 50; i > 0; i--){
            if ( n == array2[ i / 2 ] ){
                System.out.println(n + "was found on the list.");
            }
            else{ //now re-border the for loop??
                if( n > array2[25] ){
                    //then look at the later haalf
                }
                else{
                    //then look at the beginning half
                }
            }
        //}
        
    }//main method


}//class