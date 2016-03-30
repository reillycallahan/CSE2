//Reilly Callahan
//CSE2 hw09
//March 3/29

//use methods to operate a game

//import random class and scanner
import java.util.Random;
import java.util.Scanner;

//construct class
public class Games{
    
    public static void main(String[] args){ //opens main method
        Scanner scan = new Scanner(System.in); //construct and declare scanner
        Random rand = new Random(); //construct and declare random 
        
        System.out.println("Welcome to Reilly's game center!"); //welcomes the user
        System.out.println("Please choose which game you'd like to play. " +
            "The options are guessTheBox , spinTheWheel , and scrambler. Enter one now: ");
            //asks the user to enter one of the game names
        boolean check = true;//initializes boolean for while statemtn
        String guess = "guessTheBox"; //initialize string for game1
        String spin = "spinTheWheel"; //initialize string for game2
        String scram = "scrambler";//initialize string for game3
        
        while(check){ //make sure they entered input the way you wanted
            String input = scan.nextLine(); //assign the input a variable
            if( input.equals(guess) ){ //if input is the same as game1 string
                check = false; //exit validation loop
                
                //set up the prize door method
                int prizeDoor = rand.nextInt(3) + 1; //assigns a door to have a prize, from 1-3
                guessTheBox(prizeDoor); //do the guessthebox game for this random prize door
        
            }
            else if( input.equals(spin) ){//if input is the same as game2 string...
                check = false;//exit validation loop
                        
                //set up the spin wheel method
                int colorNumber = rand.nextInt(2); //assigns number to a color, either 0 or 1
                int randNumber = rand.nextInt(5) + 1; //assigns a random number, 1-5
                spinTheWheel(colorNumber, randNumber);
        
            }
            else if( input.equals(scram) ){//if input is the same as game3 string...
                check = false;//exit vallidation loop
                
                //set up the scrambler
                System.out.println("Please enter a word: ");
                String unscrambled = scan.nextLine(); 
                int length = unscrambled.length(); //comput the length of the word you've entered
                int rando = rand.nextInt(length);
                scrambler(unscrambled, rando);
            }
            else{
                System.out.print("Sorry, please enter, exactly, guessTheBox spinTheWheel or scrambler : ");
            }
        }//end of game input validation (and bc all code is inside methods that are inside validation, this is also the end of the code)
        

    } //main meth end
    
    
    
    public static void guessTheBox(int prize) { //begins prize door game
        System.out.println("Would you like to enter door 1, 2, or 3? Enter the number of the door you choose: ");
            //asks user to input a door number
        boolean check2 = true; //start a boolean for the validation
        Scanner scan = new Scanner(System.in); //construct and declare scanner
        int doorNum = 0; //initialzie int for door number input
        while( check2 ){ //while true... 
            if( scan.hasNextInt() ){ //if its an int...
                doorNum = scan.nextInt(); //assign the int to doorNum
                if( doorNum == 1 ){ //if the entered int  is 1..
                    check2 = false;//end the loop
                }
                else if ( doorNum == 2 ) {//if the entered int  is 2..
                    check2 = false;//end the loop
                }
                else if( doorNum == 3 ){//if the entered int  is 3..
                    check2 = false;  //end the loop
                }
                else{//if its not 1 2 or 3
                    System.out.println("Sorry, please enter a valid door number: "); // asks user to reenter
                    //code loops around and asks for another input
                }
            }
            else{//if its not an int...
                System.out.println("Sorry, please enter a valid int: "); //prompts, asking for an int
                scan.next();//code asks for an int
            }
        }
        if ( doorNum == prize ){ //if the number you entered matches the random one... you win!
            System.out.println("Congratulations!! You've won a pat on the back... from yourself!");
                //prints a congratualtory message
        }
        else if( doorNum != prize ){
            System.out.println("Sorry, you did not win.");
        }
    }
    
    public static void spinTheWheel(int color, int sectionNum){ //begin the spinthewheel game
         Scanner scan = new Scanner(System.in); //construct and declare scanner
         
        //take their input and validate it
        System.out.print("Please enter a color, either black or red: ");//asks user to enter black or red
        boolean check3 = true;//iniitailzies boolean as true for the validation
        String urColor = "entered color"; //initilaizes a string vairbale to store your exact input
        //now, ive made a different vairable for all the capitilizations of the word black
        String black = "black";
        String okayBlack = "Black";
        String okayBLack = "BLack";
        String okayBLAck = "BLAck";
        String okayBLACk = "BLACk"; 
        String okayBLACK = "BLACK";
        String okaybLack = "bLack";
        String okaybLAck = "bLAck";
        String okaybLACk = "bLACk";
        String okaybLACK = "bLACK";
        String okayblAck = "blAck";
        String okayblACk = "blACk";
        String okayblACK = "blACK";
        String okayblaCk = "blaCk";
        String okayblaCK = "blaCK";
        String okayblacK = "blacK";
        //now, ive made a diffferent variable for all the capitializtions of the word red
        String red = "red";
        String okayRed = "Red";
        String okayREd = "REd";
        String okayRED = "RED";
        String okayrEd = "rEd";
        String okayrED = "rED";
        String userColor = "translated user color entry"; //initializes string vairbale for the color
            //youve chosen --> i'll later make this the same color but in all lower case
        
        
        while (check3){ //while true...
            urColor = scan.nextLine(); //store your value that youve entered as urColor
            //now, i go on a series of statements that do this: 
                //if your exact input matches any of the diffferent capitatlized versions
                //that i've initialized above, then the userColor (the varibable for chosen color in lowercase)
                //will be that color in lowercase and check will be false, exiting validation loop
            //start with black...
            if( urColor.equals(black) || urColor.equals(okayBlack) ){ 
                userColor = "black";
                check3 = false;
            }
            else if( urColor.equals(okayBLack) || urColor.equals(okayBLAck) ) {
                 userColor = "black";
                check3 = false;
            }
            else if( urColor.equals(okayBLACk) || urColor.equals( okayBLACK) ){
                 userColor = "black";
                check3 = false;
            }
            else if( urColor.equals(okaybLack ) || urColor.equals( okaybLAck ) ){
                 userColor = "black";
                check3 = false;
            }
            else if( urColor.equals(okaybLACk) || urColor.equals(okaybLACK) ){
                 userColor = "black";
                check3 = false;
            }
             else if( urColor.equals( okayblAck) || urColor.equals(okayblACk ) ){
                 userColor = "black";
                check3 = false;
            }
             else if( urColor.equals( okayblACK) || urColor.equals(okayblaCk ) ){
                 userColor = "black";
                check3 = false;
            }
            else if( urColor.equals( okayblaCK) || urColor.equals(okayblacK ) ){
                 userColor = "black";
                check3 = false;
            }
            
            //now repear for red...
            else if( urColor.equals( red) ||  urColor.equals(okayRed ) ){
                 userColor = "red";
                check3 = false;
            }
            else if(  urColor.equals(okayREd ) ||  urColor.equals(okayRED ) ){
                 userColor = "red";
                check3 = false;
            }
            else if(  urColor.equals( okayrEd) ||  urColor.equals(okayrED ) ){
                userColor = "red";
               check3 = false;
            }
            else{ //if you didnt enter black or red...
                System.out.println("Sorry, please guess either black or red: "); //prompt user to re-enter
                //code will loop around to ask again
            }
        }// end of validation for the word
        
        
        System.out.print("Please guess a section number 1 through 5 (integers only): ");
            //prompts the user for a section number
        check3 = true; //make check true again
        int urNum = 0; //initiatilizes int for number that youve enetered
        while( check3 ){ //while true...
            if (scan.hasNextInt() ){ //check for int and if it is...
                urNum = scan.nextInt(); //store it as urNum
                if( urNum >= 1 && urNum <= 5 ){ //now check for it to be in range
                    check3 = false; //leaves the validation loop
                }
                else{//if the guess is out of range
                    System.out.println("Sorry, please guess an integer 1 through 5: ");
                        //prompts to re-enter an int thats in range
                }
            }
            else{ //if its not an int...
                System.out.println("Sorry, guess a valid int: "); //prompts to re-enter an int
                scan.next();//allows to enter again
            }
        }//end of validation for the number
        
        //assign the name to the random one
        String colorName = "color"; //initialize a string for the randomly generated color
        if( color == 0 ){  //if the random generated number is 0...
            colorName = "red"; //color is red
        }
        else if( color == 1 ){//if the random generated number is 1...
            colorName = "black"; //color is black
        }
        //print results
        
        System.out.println("The wheel landed on " + colorName + " " + sectionNum );
            //print what actually happened
        
        if( urNum == sectionNum && userColor == colorName ){//if it matches...
            System.out.println("Congratulations, you correctly guessed!");//print congrats
        }
        
    }//end of spin wheel method
    
    public static void scrambler(String unscram, int randomNum ){ //begin scrambler game
        //first, take the length of the word
        
        int length = unscram.length(); //comput the length of the word you've entered
        String scrambled = "";
        if( length <= 3 ){//if the word is 3/less letters...
            System.out.println(unscram); //just print the given word
            
        }
        else{//if its more than 3 letters, scramble it\
            
            
            //i tried to start by scrambling the middle two letters...
            for(int i = 1; i < length; i++){ //for i from 1-> length
                char letters = unscram.charAt(i); //letters = all letters that make the unscrambled word
               
                while( i > 1 && i < (length - 1) ){ //dont change the first or the last letters 
                    scrambled = scrambled + unscram.charAt(i + 1) + unscram.charAt(i);//put the letter thats after the next letter before that letter
                        //ie put letter B before letter A
                    i++;// increment the next letter
                    letters = unscram.charAt(i);//progress letters
                    
                } 
            }
            System.out.print(scrambled); //print the 
        }
        
    }
    
    
    
}