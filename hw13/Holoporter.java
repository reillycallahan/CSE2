/* Reilly Callahan
Due April 26, 2016
HW12: holoporter*/

//assign two random 3D arrays, one with randomnly assigned strings of letters and numbers
    // Transport one array's value into the length of the other. 
    //Search for a user-inputted string in the holoported array. 
    //determine how much the the original array was copied into the holoported array
    //sort the individual array memebers alphabetically and the array in general by length
    //print the final array in a predetermined format

import java.util.Random; //import random class
import java.util.Scanner; //import scanner class
import java.util.Arrays;//import array class for sorting 

public class Holoporter{
    public static void main(String [] args ){
        Random rand = new Random(); //construct and declare random 
        Scanner scan = new Scanner(System.in);//declare scanner class
        
        String[][][] objectOne = soRandom(); //makes first array
        String[][][] container = soRandom(); //makes a second array
        
        //now empty the container
        for( int i =0; i< container.length; i++){
            for(int j = 0; j < container[i].length; j++){
                for(int k = 0; k < container[i][j].length; k++){//for every value in the container...
                    container[i][j][k] = " ";//assigns all values to 0
                }
            }
        }
        
        //now make sure all object members are unique
        for( int i = 0; i < objectOne.length; i++){ //for every member inthe outermost array...
            for(int j = 0; j < objectOne[i].length; j++){ //for each member of the middle array...
                for(int k = 0; k < objectOne[i][j].length; k++){//for each member of the object...
                    String input = coder();//randomly assign values to the string input
                    objectOne[i][j][k] = input; //assign the that value to the object
                    for( int c = 0; c < objectOne[i][j].length; c++){//for all members of the object...
                        //this leaves a pointer at one member while searching all other memebrs
                        if(input == objectOne[i][j][c] ){//if the input previously set is the same
                            //at this point that its now checking...
                            objectOne[i][j][k] = coder();//find a new random molecule for this spot
                        }//if close
                    }//copy of inner for loop for multiples
                }//inner allocation
            }//mid allocation
        }
        //copy the object into an original array before you change the object
         String [][][] original = new String [objectOne.length][][];
         for(int i = 0; i< objectOne.length; i++){
            original[i] =  new String [objectOne[i].length][];//allocating to length of object...
            for(int j = 0; j < objectOne[i].length; j++){
                original[i][j] =  new String [objectOne[i][j].length]; //allocating to length of object[i]...
                for(int k = 0; k < objectOne[i][j].length; k++){//for all avlues of object...
                    original[i][j][k] = objectOne[i][j][k];//copy the object into original
                    
                }
            }
         }
        
        print(objectOne);//print the object
        String[][][] success = holoport( objectOne, container);//holoport the object onto the container
       
        //take in a string from user and validate it
        System.out.println("Please enter a molecule to search for in the form XXYYYY were X's are single (CAPITAL) letters and Y's are single digit numbers: ");
            //prompts user for what you want        
        boolean badInput = true;//initializes boolean
        boolean stuckInMud = true;//initializes boolean
        String molecule = scan.next();//name the input that the user made
        while(badInput){//while true...
            if( molecule.length() != 6){//if they didnt enter 6 chars
                System.out.println("Invalid molecule. Try again.");//print that its bad
                badInput = true;//keep the while loop going
                molecule = scan.next();//alllows for another chance
            }//bad length
            while(molecule.length() == 6 && stuckInMud){//if the legnth is 6 and its true..
                for( int i = 0; i < 2; i++){//for the first 2 chars...
                    if(!Character.isLetter(molecule.charAt(i)) ){//if its not a letter..
                        System.out.println("Invalid input. Try again.");//print that its bad
                        badInput = true;//keep the loop going
                        molecule = scan.next();//allow for another chance
                    }//not letters
                    else if (molecule.length() == 6){//if length is 6
                        badInput = false;// prepare leave loop until told otherwise
                        stuckInMud = false;//prepare to leave loop until told otherwise 
                    }//letters
                }//for first two chars
                stuckInMud = true;//re-assign to true
                int validNums = 0;//start a counter
                for(int i = 2; i < 6; i++){//for the last 4 chars
                    if( Character.isLetter(molecule.charAt(i)) || (molecule.charAt(i)) < 0 && (molecule.charAt(i)) > 9 ){//if the 
                        //char is a letter or the int is not between 0 and 9...
                        System.out.println("Bad input. Try again.");//print that its bad
                        badInput = true;//keep while loop open
                        molecule = scan.next();//allow for another shot
                        validNums = 0;//restart the counter 
                        break;//exit loop
                    }//invalid int range
                    else if(molecule.length() == 6){//if the length is 6 and its not a letter and it is between 0 and 9..
                        validNums++;//incease counter
                         stuckInMud = false;//prepare to leave loop for now
                    }//valid int range
                    if( validNums == 4){//if you've counted 4 acceptable ints...
                        badInput = false;//leave the loop!
                    }
                }//for last 4 chars
            }
        }//while validation is done
        
        sampling(success, molecule);//conduct sampling where you attempt to find a user entered molecule
        percentage(original, success);//conduct percentage where you find the percent of the origianl that appears in the holoported array
        frankenstein(success);//modify the original so that you get all of the array in order
    }//main meth
    
    
    public static String[][][] soRandom(){
        Random rand = new Random(); //construct and declare random 
        int o = rand.nextInt(9) + 1; //random int 1 thru 10 for length of outermost array
        String [][][] array = new String [o][][];//allocate and declare an array to have o spots
        for( int i = 0; i < o; i++){ //for every member inthe outermost array...
            int mid = rand.nextInt(9) + 1; //generates numbers 1 --> 10 inclusive
            array[i] = new String [mid][]; //allocates random length of each middle array
            for(int j = 0; j < mid; j++){ //for each member of the middle array...
                int inner = rand.nextInt(9) + 1;//random int 1 thru 10 for innermost array
                array[i][j] = new String [inner];//allocates random length of each innermost array
                for(int k = 0; k < inner; k++){//for each member...
                    String input = coder();//assign coder to String input
                    array[i][j][k] = input; //asign this member of the array to input
                    for( int c = 0; c < inner; c++){//for all of the inner ones...
                        if(input == array[i][j][c] ){//if the input previously set is the same
                            //at this point that its now checking...
                            array[i][j][k] = coder();//find a new random molecule for this spot
                        }//if close
                    }//copy of inner for loop for multiples
                }//inner allocation
            }//mid allocation
        }//outer allocation
        return array;
    }//soRandom
    
    
    public static String coder(){//randomizes molecules to be two parts letters, 4 parts numbers
         Random rand = new Random(); //construct and declare random 
        String molecule = " ";//start with an empty string
        String[] aZ = { "A", "B", "C", "D", "E", "F", "G", "H", "I","J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            //creates a string with letters A thru Z
        int letterIndex = rand.nextInt(aZ.length );//pick a random spot in string of letters
        int letterIndex2 = rand.nextInt(aZ.length);//pick another ransom spot
        
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            //creates a string with numbers 0 thru 9
        int numIndex = rand.nextInt(num.length);//pick a random spot in the string of numbers
        int numIndex2 = rand.nextInt(num.length);//pick another ransom spot
        int numIndex3 = rand.nextInt(num.length);//pick another ransom spot
        int numIndex4 = rand.nextInt(num.length);//pick another ransom spot
        
        molecule = aZ[letterIndex] + aZ[letterIndex2] + num[numIndex] + num[numIndex2] + num[numIndex3] + num[numIndex4];
            //make the string by adding two radom letters and 4 random numbers
        return molecule; //returns a random letter from A-Z
    }//end of coder
    
    
    public static void print(String[][][] a){ //print in the format specified the array given
        for( int i = 0; i < a.length; i++ ){
            for( int j = 0 ; j < a[i].length; j++ ){
                for( int k = 0; k< a[i][j].length; k++ ){//for all members of the array...
                    if(k == 0){//if its the first one in the inner loop
                        System.out.print("[");//make a bracket
                    }
                    System.out.print(a[i][j][k] );//print the molecule
                    if( k == a[i][j].length - 1 ){//if its the last member...
                        System.out.print("]");//signal the end of innermost array
                    } 
                    else{//if its not the begining or the end...
                        System.out.print(", ");//print a comma
                    }
                    if(k == a[i][j].length - 1 && j != a[i].length - 1 ){ //if its the last inner member and not the last middle member...
                        System.out.print(" | "); //print a line (not at the last middle member bc thats when you need ---)
                    }
                } //done printing the values of one innermost array
                if(j == a[i].length - 1 && i != a.length - 1){ //at the last middle member and not after the very last member..
                    System.out.print("---");//print hyphon string
                }
            }//middle loop
        }//outer loop
        System.out.println(" ");//just prints a new line
    }//prints the3D array
    
    
    public static String[][][] holoport(String [][][] object, String [][][] container){//holoport the object to teh ocntainer
       
        //now make another array, the holoportedObj array, thats the same bounds as container
            //i made copied it over so that i could still use the container separately
            //for debugging my code later
        String [][][] holoportedObj = new String [container.length][][];//make it the length of container
        for(int i = 0; i < container.length; i++){   
            holoportedObj[i] =  new String [container[i].length][];//make it the length of container at every i
            for(int j = 0; j < container[i].length; j++){ 
                    holoportedObj[i][j] =  new String [container[i][j].length];//make it the length of container at every i,j
            }
        }
        //to avoid null, fill all of holoport (which is in bounds of container) with $$$$$$ before you 
            //assign  to the holoportedObj  the original array values
        for(int i = 0; i< container.length; i++){
            for(int j = 0; j< container[i].length; j++){
                for(int k = 0; k< container[i][j].length; k++){//for all values of the container...
                    holoportedObj[i][j][k] = "$$$$$$";//assign the sepcial code to holoport at this spot
                }
            }
        }        
        //now, assign the object values to holoport for members where the bounds of container exist
         for(int i = 0; i< object.length; i++){//for all of the object values
             if(i >= container.length){//if youre exceeding bounds of container..
                 break;//stop
             }
             else{//if youre not exceeding bouds...
                 for(int j = 0; j < object[i].length; j++){//fr all object midle values...
                     if(j >= container[i].length){//if youre exceeding bounds of container..
                        break;//stop
                     }
                     else{//if youre not exceeding bouds...
                        for(int k = 0; k < object[i][j].length; k++){ //for all obejct members...
                            if(k >= container[i][j].length){//if youre exceeding bounds of container....
                                break;//stop
                             }
                             else{//if not....
                                    holoportedObj[i][j][k] = object[i][j][k];//put the object into the holoport at this spot
                             }
                        }
                     }
                 }
             }
         }//now holoport has object values where container exists and $$$$$ where object DNE
         
        //copying the object into an original array
        for(int i = 0; i< object.length; i++){
            for(int j = 0; j < object[i].length; j++){
                if( i < container.length){//if the container is bigger
                    if( j < container[i].length){//if the container is bigger..
                        if(object[i][j].length < container[i][j].length){//if the container is bigger...
                            for(int k = object[i][j].length; k < container[i][j].length; k++){//fill the extra space..
                               holoportedObj[i][j][k] = "$$$$$$";//with a special code
                            }
                        }
                    }
                }
            }
        }
        return holoportedObj;//return the holoported array
    }//end of holoport
        
    
     public static void sampling( String[][][] a, String find){//find the user input code in the holoported array
        boolean foundIt = false;//assign boolaen
        //iniitalize indicies
        int locI = 0;
        int locJ =0;
        int locK = 0;
        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< a[i].length; j++){
                for(int k = 0; k < a[i][j].length; k++){//for all members of the holoported array...
                    String currentMolecule = a[i][j][k];//assign the member to the curernt moleucle string
                    if(currentMolecule.equals(find) ){//if the current molecule is the same as the entered moolecule...
                        foundIt = true;//change boolean to say that you found it
                        locI = i;//mark down the location
                        locJ = j;////mark down the location
                        locK = k;//mark down the location
                    }
                }
            }
        }
        if(foundIt){//if you found it...
            System.out.println("This molecule was found at (" + locI + ", " + locJ + ", " + locK + ").");
                //print its location
        }
        if(!foundIt){//if its not there...
            System.out.println("Code not found.");//report failure
        }
     }//end of sampling
     
     
     public static void percentage(String [][][] o, String[][][] h){//find the percent of the original that was holoported
        int numO = 0;//start counter for original members
        int numH = 0;//start coutner for holoported memebrs
        for(int i = 0; i< o.length; i++){
            for(int j = 0; j< o[i].length; j++){
                for(int k = 0; k < o[i][j].length; k++){//for every original memeber...
                    numO++;//incremeent origianl counter
                }
            }
        }
        for(int i = 0; i< h.length; i++){
            for(int j = 0; j< h[i].length; j++){
                for(int k = 0; k < h[i][j].length; k++){//for every holoported member...
                    numH++;//incrememnt holoport
                }
            }
        }
     
        double oT = (double) numO; //convert for more accuracy
        double hT = (double) numH;//convert for more accuracy
        double moleculeDif = hT - oT; //this will accoutn for the sign orientations given in instructions
        double p = 100 * (moleculeDif / oT);//do calculations as doubles for accuracy
        int perc = (int) p;//convert to an int
        System.out.println( "Percentage is " + perc + "%" );//print
     }//end percentage
     
     
    public static void frankenstein(String [][][] o){//modify and order the holoported array
        String word = " ";//initialize a string
        String alphabetized = " ";//initialize a string
        for(int i = 0; i < o.length; i++){
            for(int j = 0; j < o[i].length; j++){
                for(int k = 0; k < o[i][j].length; k++){//for every member of the array...
                     word = o[i][j][k];//assign the member to word
                     char[] letters = word.toCharArray();//make the word into a char arraay
                     Arrays.sort(letters);//sort the char array alphabetically
                        //this puts the numbers first, so we'll have to reorder it
                     String alphabetizedL = new String (letters);//put the sorted char array back into a string
                     
                     //now i'm reordering the molecules
                     String numString = "";//initialize a string for the number chars
                     for( int l = 0; l < 4; l++){//for the first 4 chars in the aray
                         numString = numString + letters[l];//compile the numbers into a string
                     }
                     String letterString = "";//initialize a string for the letter chars
                     for(int l = 4; l < letters.length; l++){//for the first 2 chars in the aray
                         letterString = letterString + letters[l];//compile the letters into a string
                     }
                    String realString = letterString + numString;//compile the letter and number strings into one string
                     o[i][j][k] = realString; //assign the new sorted string into the holoported array at this member 
                }
            }
        }
        for(int i = 0; i < o.length; i++){
            for(int j = 0; j < o[i].length; j++){//for all array values...
                int smallest = j;//assign the smallest index to the inner index
                for( int k = j; k < o[i].length; k++){//narrow your pointer search to the 
                    //current innder index and the length of the inner array
                    if(o[i][k].length < o[i][smallest].length){//if the current pointer value is
                        //smaller than the smallest value..
                        smallest = k;//assign a new smallest index
                    }
                }//now youve found the smallest value in this array...
                //swap the values
                String[] temp = o[i][j];//store the current value into temp
                o[i][j] = o[i][smallest];//change the current value to the smallest value
                o[i][smallest ] = temp;//put the stored value into the spot that the smallest value came from
            }//repeat for all inner values until all inner arrays are sorted
        }    
        print(o); //prints the modified array
        
    }//end frankenstein
    
}//end class