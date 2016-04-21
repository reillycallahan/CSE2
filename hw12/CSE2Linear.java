//Reilly Callahan
//CSE 2 hw12
//April 19, 2016

//working with arrays to scramble and search
//

//import the random class
import java.util.Random;

//import the scanner class
import java.util.Scanner;

//open class and main method
public class CSE2Linear{ 
    public static void main(String[] args){
        
        Random rand = new Random(); //delcare random class
        Scanner scan = new Scanner(System.in);//declare scanner class
        
        System.out.println("Please enter 15 integers between 0 and 100 of increasing length: ");
            //prompt user to enter 15 ints
    
        int[] array = new int[15];//allocate and declare an array to have 15 spots
        
        for( int i = 0; i < 15; i++){ //for every member inthe array...
            boolean check = true; //initialie a boolean for validatin
            while(check){ //while true...
                if(scan.hasNextInt()){ //if its an int...
                    array[i] = scan.nextInt(); //assigns the array
                     
                    if(array[i] >= 0 && array[i] <= 100){ //if its within range...
                        if(i == 0){ //if its  the first member...
                            check = false;//loop around to inremement i
                        }
                        else if( i > 0){ //if its not the first member...
                            if(array[i] >= array[i - 1]){ //if the current member is greater = to the previous...
                                check = false; //loop around to incrememnt i 
                            }
                            else{//if its not greater...
                                System.out.println("Sorry, please enter an int greater than the last: ");
                                //prompt user to re-enter a greater int
                            }
                        }
                    }
                    else{//its not in range..
                        System.out.println("Sorry, please enter an int between 0 and 100: "); //tell user
                    }
                }
                else{//if not an int....
                    System.out.print("Sorry, please enter in int: "); //tell user
                    scan.nextLine();//allow for user to re-enter
                }
            }
        }//emd of validation
        
        System.out.println("Sorted array: "); //prints a prompt for the sorted array
        for( int i = 0; i < 15; i++){ //for every member
            System.out.print(array[i] + " "); //prints every member of the array in order
        }
        System.out.println(""); //put a space
        
        System.out.print("Please enter a grade to search for: "); //prompt for a grade to search
        int grade = scan.nextInt(); //assign the entered value to a variable
        
        binarySearch(grade, array); //search for this grade in the array
        
       scramble(array); //scramble the grades
            //within this method, it will check for the grade you enter 
        
    }//main meth     
    
    public static void binarySearch (int find, int[] gradeList){ //begin binary search
        int lowValIndex = 0; //initialize the lowest value's index at 0, the beginning of the array
        int lowVal = gradeList[lowValIndex]; //set the variable lowVal
        int middleValIndex = gradeList.length / 2; // initialize the mid value's index in the middle of the array
        int middleVal = gradeList[ middleValIndex];//set teh variable middleVal
        int highValIndex = gradeList.length - 1; //initialize the high valu'es index at the end of the array
        int highVal = gradeList[ highValIndex ]; //set the varibale highVal
        int t = 1; //initialize a counter for iterations
        do{ //do this program once while the statement at the end holds true
            while( middleVal > find){ //if the value you want is smaller than the middle value...
                //reassign the bounds of the array youre looking at --> look at the top half
                highValIndex = middleValIndex; //move the high val index to the spot of the previous middle val
                highVal = gradeList[highValIndex]; //assign highVal
                middleValIndex = middleValIndex / 2; //move the middle value index to the spot it was at split in half
                    //this will shorten the array of focus to the top half of the previous array
                middleVal = gradeList[middleValIndex]; //assign middle value
                t++;//increment t
                //do this until the middle value isn't more than the target
            }
            while( middleVal < find ){ //if the value you want is bigger than the middle value...
                //reassign the bounds of the array in focus to only look at the bottom half
                lowValIndex = middleValIndex;//reassing the low val index to the spot of the previous middle val
                lowVal = gradeList[lowValIndex]; //assign low val at that pt
                middleValIndex = (highValIndex - lowValIndex) / 2 + middleValIndex; //move middle val to the point
                    //that's inbetween the bottom half. It's this equation bc highValIndex-lowValIndex gives the number of 
                    //members in the new section. dividing this by two gives the length from the lowvalIndex to the 
                    //middleValIndex. adding this to the precious middleValIndex gives this distance perspective/location on the array
                middleVal = gradeList[middleValIndex]; //assign middleVal at this point
                t++; //incrememnt t
                if( gradeList[middleValIndex + 1] == highVal){ //add this if statement because when you divide by two to get the
                    //new middleIndex, you cut off the decimal (since it casts to an int). therefore you will always neglect
                    //the final member of the array and be stuck in an infinite loop without this if statement.
                   break;//end the infinite loop
                }
            }
        } while( middleVal != find  && gradeList[middleValIndex + 1] != highVal ); //do all of this until you've found it
            //or until you've gotten as close as you can to the last member
        //by now, you've either found the number or determiend that it does not live in this array. print results.
        
        if( middleVal == find  || gradeList[middleValIndex + 1] == highVal){ //if the middle value is what youre looking for
            //or if youve identified the target as the final member...
            System.out.println( find + " was found after " + t + " iterations!" ); //print that youve found it after t loops
        }
        else{ //if you didnt find it...
            System.out.println( find + " was not found after " + t + " iterations." ); //print that you failed
        }
    }//end of binary search
    
    public static void linearSearch (int find, int [] gradeList){ //searches this array
         boolean found = false;//initialize a boolean
         int iterations = 0;///initializes an int
         for( int i = 0; i < 15; i++ ){ //for every member in the array...
            if( gradeList[i] == find ){ //if the current grade is the same as what youre looking for...
                iterations = i; //the iterations it took to find it = i
                found = true; //initialize a boolean to be true
                break; //leave the foor loop
            }
        }
        if(found){ //if you found it at some point...
             System.out.println( find + " was found after " + iterations + " iterations.");
                //tell the user you found it
        }
        else{//if you didnt find it...
            System.out.println(find + " was not found even after 14 iterations."); //tel user
        }
        
    }//end of linear search
    
    public static void scramble( int [] increasing){ //scrambles the array
        Random rand = new Random(); //declare/construct random class
        Scanner scan = new Scanner(System.in);//declare/construct scanner class
        for( int i = 0; i < 15; i++){//for every member in the array
            int randomIndex = rand.nextInt(increasing.length); //the random index you choose is from 0 thru the length
            int temp = increasing [i]; //store the current array member in a variable temp
            increasing[i] = increasing[randomIndex]; //reassign the array of the random member to the current array member 
            increasing[randomIndex] = temp; //reassign the random member to the temporarily held member from above
        }
        System.out.println("Scrambled Array: ");//the scrambled array is...
        for( int i = 0; i < 15; i++){ //for every member...
            System.out.print( increasing[i] + " "); //print that membber
        }
        System.out.println("");
        System.out.print("Please enter a grade to search for: ");//asks user for input on search
        int num = scan.nextInt(); //the number chosen is input
        linearSearch(num, increasing);//linearly search the array for the number that you want and report back here
    }
    
}//end of class