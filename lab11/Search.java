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
        Random rand = new Random();//construct random
        Scanner scan = new Scanner(System.in);//construct scanner
        
        int [] array1 = new int [50];//allocate array1
        int [] array2 = new int [50];//allocate array2
        
        for( int i = 0; i < 50; i++){//for each value in array1...
            array1[i] = rand.nextInt(101);//generates a random int 0 -101 and 
                //assigns that int to the current array value
        }//now all values have been assigned
      
        
        int max = array1[0]; //initialize a variable for max value
        int min = array1[0]; //initialize a variable for min value
        for( int i = 0; i < 50; i++ ){//for each value in array1...
            if( array1[i] > max){//if the current value is greater than the last..
                max = array1[i]; //assign the current val to the max
            }
            if( array1[i] < min){//if the current val is less than the previous min..
                min = array1[i];//assign the current val to the min
            }
        }//now you've found max and min
        System.out.println("The maximum value in array1 is: " + max + ". ");
        System.out.println("The minimum value in array1 is: " + min);
                //print out a statement saying what the max and mins are
        
        
        array2[0] = rand.nextInt(101); //assigns the first array2 value a random number 0 to 100
        for( int i = 0; i < 50; i++ ){//for all members of array2....
            int n = rand.nextInt(101); //find a random number 0 thru 100
            if( i != 0 ){//if its not the first member...
                array2[i] = n + array2[i - 1]; //add this new random number to the previous member
                    //this makes an increasing array
            }
        }//now youve assigned all array2
        
        int max2 = array2[49]; //since the array is increasing, the max is the last entry
        int min2 = array2[0]; //since its increasing, the min is the first member
        System.out.println("The maximum value in array2 is: " + max2 + ". ");
        System.out.println("The minimum value in array2 is: " + min2);
                //print out the max and mins
        
        System.out.print("Please enter a positive int: "); //prompt for a positive int
        boolean check = true;//initialize a boolean
        int myVal = 0;//intiialize a vairable for the enterd val
        
        while(check){//while true...
            if( scan.hasNextInt() ){//if its an int..
               myVal = scan.nextInt(); //assign it to myVal
               if( myVal >= 0){//if its 0 or more...
                   check = false;//exit teh while loop bc its validated
                   allCode(myVal, array2);
               }
               else{//if its less than 0...
                   System.out.println("You did not enter an int greater than 0.");//tell user
                   break;//leave loop
               }
            }
            else{//if its not an int...
                System.out.println("You did not enter an int.");//tell user
                break;//leave loop
            }
        }
    }
    public static void allCode(int myVal, int[] array2){
        
        boolean inBounds = true;//set a boolean
        if(myVal < array2[0]){//if the eneterd val is below the range...
            inBounds = false;//set boolean to false
            System.out.println(myVal + " was not found.");
            System.out.println("The key was below the lowest number, " + array2[0]);
                //tell user 
        }
        else if (myVal > array2[49]){//if the enterd val is above range...
            inBounds = false;//set boolean to false
            System.out.println(myVal + " was not found.");
            System.out.println("The key was above the highest number, " + array2[49]);
                //tell user its outa range
        }
        while( inBounds ){//while its in range....
            int low = 0;//assign the low to the initial index
            int high = array2.length - 1;//assign the high to the last index
            int mid = (low + high) /2;//assign the middle index
            do{
                while(array2[mid] > myVal){//look at first half
                    high = mid;//reassign the high to the middle, shortenging the array in foucs
                    mid = (low + high) / 2;//reassign the middle
                }
                while(array2[mid] < myVal){//look at last half
                    low = mid; //reassign the low to teh middle, shortening the array in focus
                    mid = (low + high) / 2;//reassign the middle
                    if( (high - low) <= 2){//if the array is only two values long...
                        break;//leave the infinite loop
                    }
                }
            } while ( array2[mid] != myVal && high - low > 2);//do this all while you havent found the serached value and the array in focus is longer than 2
            
            
            if (array2[low] < myVal && array2[low + 1] > myVal){ //if you didnt find it& its stuck between two low values
                System.out.println( myVal + " was not found.");//say you didnt find it
                System.out.println("The number above the key was " + array2[low + 1]); //print the upper bound
                System.out.println("The number below the key was " + array2[low] ); //print the lower bound
            }
            else if( array2[high] > myVal && array2[high - 1] < myVal){//if you didnt find it& its stuck between two high values...
                System.out.println( myVal + " was not found.");//print that you failed
                System.out.println("The number above the key was " + array2[high]);//print the upper bound
                System.out.println("The number below the key was " + array2[high - 1] ); //print the lower bound
            }
            else if( array2[mid] == myVal || array2[mid + 1] == array2[49] ){ //if the middle value is what youre looking for
                //or if youve identified the target as the final member...
                System.out.println( myVal + " was found! "); //print that youve found it after t loops
            }
            inBounds = false;//set the boolean to false so that it isnt infinite--> we only needed it to run oncce
        }
    }//main method
}//class