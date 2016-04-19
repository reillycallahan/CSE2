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
        int grade = scan.nextInt(); //assign the enteredvalue to a variable
        linearSearch(grade, array); //search for this grade in the array
        scramble(array); //scramble the grades
        
    }//main meth     
    
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