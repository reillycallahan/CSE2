/* Reilly Callahan
April 22, 2016
lab12: ragged array */

//create and manipulate a multidimensional array
//ask user for length of array, and randomize the members of the array
//sort each inner array with binary sort
//rearrange the array  by length of inner arrays
//search for an input number, and print the location of that number if found


//import the random and scanner classes
import java.util.Random;
import java.util.Scanner;

//open class and main method
public class raggedArray{ 
    public static void main(String[] args){
        
        Random rand = new Random(); //delcare random class
        Scanner scan = new Scanner(System.in);//declare scanner class
        
        System.out.print("Please enter length of the outer array: ");
            //prompt user to enter length
        int n = scan.nextInt();//assign the entered int to a value
    
        int[] [] array = new int [n] [];//allocate and declare an array to have n spots
        
        System.out.println("Unsorted array: ");//prompt that youre printing unsorted array
        
        for( int i = 0; i < n; i++){ //for every member inthe outer array...
            int r = rand.nextInt(n) + 1; //generates numbers 1 --> n inclusive
            array[i] = new int[r]; //allocates random length of each inner array
            for(int j = 0; j < r; j++){ //for each member of the inner array...
                int val = rand.nextInt(21); //generates numbers 0 --> 20 inclusive
                array[i][j] = val; //assign the array at all values to this random number
                System.out.print(array[i][j] + "  ");//print out all array values
            }
            System.out.println(" ");//print a space for new columns
        }
        
        System.out.println(" ");//print a big space separating arrays
        
        System.out.println("Sorted array: "); //prompting before printing sorted array
        //begin selection sort 
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){//for all array values...
                int smallest = j;//assign the smallest index to the inner index
                for( int k = j; k < array[i].length; k++){//narrow your pointer search to the 
                    //current innder index and the length of the inner array
                    if(array[i][k] < array[i][smallest]){//if the current pointer value is
                        //smaller than the smallest value..
                        smallest = k;//assign a new smallest index
                    } 
                }//now youve found the smallest value in this array...
                //swap the values...
                int temp = array[i][j];//store the current value into temp
                array[i][j] = array[i][smallest];//change the current value to the smallest value
                array[i][smallest ] = temp;//put the stored value into the spot that the smallest value came from
            }//repeat for all inner values until all inner arrays are sorted
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j< array[i].length; j++){//for all array values...
                System.out.print(array[i][j] + "  ");//print the sorted array
            }
            System.out.println("");//print a space for new columns
        }
        
        //now do selection sort for outer array
        for(int i = 0; i < array.length; i++){//for all outer array values...
            int smallest = i;//assign the smallest index to the current outer index
            for(int j = i; j< array.length; j++){//narrow your pointer search between the 
                //current outer index and length of outer array
                if(array[j].length < array[smallest].length ){//if the current pointer length is 
                //shroter than the previous smallest...
                    smallest = j;//assign a new smallest index at the current pointer
                }
            }//now youve found the smallest outer array...SWAP!
            int [] temp = array[i];////store the current value into temp[]
            array[i] = array[smallest];////change the current value to the smallest value
            array[smallest] = temp;//put the stored value into the spot that the smallest value came from
        }
        System.out.println(" ");//print a big space separating arrays
        System.out.println("Rearranged array: ");//print a header for the newly rearranged array
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j< array[i].length; j++){//for all members...
                System.out.print(array[i][j] + "  ");//print the new array
            }
            System.out.println("");//print a space for new columns
        }
        //now, search for user input and tell location
         System.out.print("What number would you like to search for? ");//prompt user for input
        int target = scan.nextInt();//assign that input to target vairable
        search(array, target);//run the search method for the array and the entered value
        
    }//main method
    
    public static void search( int[][] a, int key){//search for a value in the array a[][]
        boolean keepGoing = true;//initialize a boolean so that it'll stop after finding it once
        for(int i = 0; i < a.length; i++){//for all outer array values...
            if(keepGoing){//if you still havent found it...
                for(int j = 0; j< a[i].length; j++){//for all members...
                    if( a[i][j] == key){//if the current member is your key...
                        System.out.println("Found the value at Column " + (j+ 1) + " Row " + (i + 1) );
                            //print location of the key. add one to both indicies bc indicies start at 0
                        keepGoing = false;//tell it to stop looking
                        break; 
                    }
                    else if( i == a.length - 1 && j == a[i].length - 1){//if youve gone 100% all the way through
                        //and are on the last member withuot having found it...
                        System.out.println("Entered value was not found.");//tell user you didnt find it
                        keepGoing = false;//tell it to stop looking
                        break;
                    }
                }
            }
        }
    }//end of search
    
}//public class
        