//Reilly Callahan
//CSE 2 hw12
//April 19, 2016

//work with methods and arrays to input random values into an array,
    //delete a selected member of the array, and delete all values of a 
    //specific number from the array

import java.util.Scanner;//import scanner
import java.util.Random;//import random class

public class RemoveElements{ //open public class
  public static void main(String [] arg){ //start main method and begin Chen's code
    //i did not comment Chen's work, only mine
	Scanner scan = new Scanner(System.in);
    int num[] = new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
    	String answer = "";
    	do{
          	System.out.print("Random input 10 ints [0-9]. ");
          	num = randomInput();
          	String out = " ";
          	out += listArray(num);
          	System.out.println(out);
         
          	System.out.print("Enter the index: ");
          	index = scan.nextInt();
          	
          	newArray1 = delete(num,index);
          	String out1 ="The output array is ";
          	out1 += listArray(newArray1); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out1);
         
            System.out.print("Enter the target value: ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2 = " The output array is ";
          	out2 += listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
          	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer = scan.next(); 
    	}while(answer.equals("Y") || answer.equals("y"));
      }
 
  public static String listArray(int num[]){ //make an array
	String out="{";
	for( int j = 0;j < num.length; j++){
  	if(j >  0){
    	out+= ", ";
  	}
  	out += num[j];
	}
	out += "} ";
	return out;
  }
  
    public static int[] randomInput(){// makes an array full of random ints
        Random rand = new Random(); //construct and declare random class
        int array[] = new int [10]; //allocate and declare array
        for( int i = 0; i < 10; i++){ //for every value in the array...
            array[i] = rand.nextInt(10); //assign that value a random number 0 - 9
        }
        return array ; //return the result of this array to be used in main method
    }
    public static int[] delete(int[] fullArray, int position){ //deletes one specific member from an array
        //first, validate teh member position
        if( position < 0 || position > fullArray.length){ //if the desired position isn't within range of the array...
            System.out.println("Sorry, this position is not within the array."); // tell user its wrong
            int [] nope = {}; //assign and delcare an array with no values
            return nope;//return this empty array
        }
        else{ //if the desired position is within range of the array...
            int [] newArray = new int [fullArray.length - 1]; //then the new array is one shorter than the old one
            for( int i = 0; i < position; i++){ //for all members 0 up to the desired member to be left out
                newArray[i] = fullArray[i];//assing the newarray the value of the old array
            }
            for(int i = fullArray.length - 1; i > position; i--){//for all members from (1 + desired member) to the new array length..
                newArray[i - 1] = fullArray[i];//give the new array that value (the new array index is subracted by 1 because it is skipping the desitred number)
            }
            return newArray; //return the new array to be used in the main method
        }
    }//end of the random input method
    
    
    public static int[] remove(int[] original, int target){ //open a method to remove all values of an array equal to the desired value
         boolean found = false; //initialize a boolean 
         for( int i = 0; i < original.length; i++ ){ //for all members from 0 thru the full length...
            if( original[i] == target ){ //if the value youre at is the same as the target value...
                found = true; //then set the boolean to true to be used later
                break; //exit the for loop
            }
        }
        if(found){ //this is only true if you found the target value at some point
             System.out.print( "Element " + target + " was found."); //say that you found it
        }
        else{ //this is only true if you never found the target value
            System.out.print("Element " + target + " was not found."); //say that you didnt find it
        }
        //now, work on removing the values
        int k = 0; //initialize an int to be used later
        for(int i = 0; i < original.length; i++){ //for every member from 0 thru the full length...
            if( original[i] == target ){ //if the current member is the same as the target value...
                k++; //increment k. this will make k = number of times target appears
            }
        }
        int[] cleanArray = new int [original.length - k]; //allocate and declare a new array who's length
            //is the same as the old length - # of times target appeared
        int j = 0; //initilize an int to be used later
        for( int i = 0; i < original.length; i++){ //for every member in the original array...
            if( original[i] != target){ //if the one youre looking at is not the target..
                cleanArray[j] = original[i]; //then the new array at j is the same as that value
                j++;//only incrememnt j here because you dont want gaps in your array
            }
        }
        return cleanArray; //return the new and shorter array to be used in main meth
    }//end of remove method
    
}//end of class
