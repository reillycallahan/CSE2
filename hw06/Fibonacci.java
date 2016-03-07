/*
Reilly Callahan 
CSE 2 hw 06
Due March 8, 2016
*/

//Printing fibonacci numbers
//collect two inputs to start a fibonacci sequence and a number
    //n, for the length of the sequence

//import scanner
import java.util.Scanner;

//open class and main method
public class Fibonacci{
    public static void main(String[] args){
        //construct scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt for input
       // System.out.println("Enter the first two integers in the sequence and the length of the sequence: ");
        
        //validate input
        boolean check = true; //first create a boolean to check input
        int a1 = 0, a2 = 0; //create two ints for the first two numbers
        int length = 0; //intialize the length as an int
        while ( check ){ //set initally to ture so that it runs
            System.out.println("Enter the first positive integer in the sequence: "); 
                //prompts for the first input
        
            if ( myScanner.hasNextInt() ){ //if its an int
                a1 = myScanner.nextInt(); //asks for int a1
                System.out.println("Enter the a larger positive integer for the sequence: "); 
                    //prompts 2nd input
        
                if ( myScanner.hasNextInt() ){ //if its an int
                    a2 = myScanner.nextInt();//asks for int a2
                    System.out.println("Enter the length of the sequence: "); //prompts for last input
        
                    if ( myScanner.hasNextInt() ){//if its an int
                        length = myScanner.nextInt();//asks for int length
                        
                        if ( a1 > 0 ){//checks for positive a1
                        
                            if( a2 > 0 && a2 > a1 ){//checks for positive a2 that is greater than a1
                            
                                if( length > 0 ){//checks for positive length
                                
                                    check = false; //lets code exit the while loop only 
                                        //when the input is completely valid
                                }
                                else{//if length is negative
                                    System.out.print("Sorry, please re-enter 3 positive integers. ");
                                        //prompts to retry bc length was invalid int
                                    //code then loops back and starts over
                                } 
                            }
                            else{//if a2 is negative or smaller than a1
                                System.out.print("Sorry, your second integer must be larger than the first and positive. Re-enter values. ");
                                    //prompts to retry bc a2 was invalid int
                                //code then loops back and starts over
                            } 
                        }
                        else{//if a1 is negative
                             System.out.print("Sorry, please re-enter 3 positive integers. ");
                                //prompts to retry bc a1 was invalid int
                            //code then loops back and starts over
                        }
                    }
                    else{ //if length  is not int...
                        System.out.println("Sorry, enter a valid integer");
                            //prompts to retry bc length was not an int
                        //code then loops back and starts over
                    }
                }
                else{ //if a2 is not int...
                    System.out.println("Sorry, enter a valid integer");
                        //prompts to retry bc a2 was not an int
                    //code then loops back and starts over
                }
            }  
            else{ //if aa1 is not int...
                System.out.println("Sorry, enter a valid integer");
                //prompts to retry bc a1 was not an int
                myScanner.nextLine(); //asks for a new int
            }
        }//ends validation of input
        
        
        int t = 3;//initialize a counter
        int a3 = 0; //intialze the next term
        if (length >= 1 ){ //if you only want one number...
            System.out.print("The numbers are: " + a1); //print a1
            if( length >= 2 ){ //if you want two numbers...
                System.out.print(" " + a2); //also print a2
                //now, if you want more than two numbers, you need to have a while loop that continues
                    //for the entire desired length
                while ( t <= length ){ //from length 3 - length input
                    a3 = a1 + a2; //add the two preceding numbers
                    t++; //increments the counter
                    System.out.print(" " + a3 + " ");//print out the next value that was just calculated
                    a1 = a2;//reassign a1 so that the sequence progresses
                    a2 = a3;//reassign a2 so that the sequence progresses
                }
            }
        }
        System.out.print("."); //prints a period after the full sequence has printed
    }
}