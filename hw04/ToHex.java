//Reilly Callahan
//CSE2 hw04
//Due Feb 23, 2016

//ToHex
//Take three inputs and convert them to hexadecimal outputs

//import the scanner
import java.util.Scanner;
//open class and main method
public class ToHex{ //class
    public static void main(String[] args){ //main method
    //declar and construct scanner
    Scanner myScanner = new Scanner ( System.in);
    
    //collect inputs 
    System.out.print("Enter 3 numbers as RGB values: ");
        //prompts the user to enter RGB
        
    //validate inputs as integers
    while( !myScanner.hasNextInt() ){
        System.out.println("Sorry, enter a valid integer.");
        myScanner.nextLine();
    }
    
    
    int r = myScanner.nextInt();
        //allows for user to type R value
    int g = myScanner.nextInt();
        //allows for user to type G value
    int b = myScanner.nextInt();
        //allows for user to type B value
    
    //now create if statements so that it only runs if all inputs are within range
    if ( r >= 0 & r <= 255 ){ //if r is in range
        if ( g >= 0 & g <= 255 ){ //if g is in range
            if ( b >= 0 & b <= 255 ){ //if b is in range
                
    
            //convert to hexadecimal
    
            //first, take the remainder after dived by 16
            int rHex1 = r % 16;
                 //gives an integer between 0 and 15 for r value
            int gHex1 = g % 16;
                 //gives an integer between 0 and 15 for g value
            int bHex1 = b % 16;
                  //gives an integer between 0 and 15 for b value
    
    
            //now, subtract the double by the integer (0-15)
            int rHex2 = r - rHex1;
                //gives a mutiple of 16 from 0-240 for the second r hexadecimal variable
            int gHex2 = g - gHex1;
                //gives a mutiple of 16 from 0-240 for the second g hexadecimal variable
            int bHex2 = b - bHex1;
                //gives a mutiple of 16 from 0-240 for the second b hexadecimal variable
    
    
            //then take the second hexadecimal varibale and divide by 16
            int rHex3 = rHex2 / 16;
                //gives an int 0-15 for the second r hexadecimal variable
            int gHex3 = gHex2 / 16;
                //gives an int 0-15 for the second g hexadecimal variable
            int bHex3 = bHex2 / 16;
                //gives an int 0-15 for the seond b hexadecimal variable
    
    
            //now that you have hex1 and hex3 from 0-15, use a switch statement 
                //to reassign hexadecimal varaibles to letters if necessary
    
            //start with first red value (redhex1 and redhexval1)
            String rHexVal1 = "Letter";
                //first, initialize the rHexVal1 string
            switch ( rHex1 ){ //working with the int rHex1
                case 0:
                    rHexVal1 = "0"; //10 --> A
                    break;
                case 1:
                    rHexVal1 = "1"; //10 --> A
                    break;
                case 2:
                    rHexVal1 = "2"; //10 --> A
                    break;
                case 3:
                    rHexVal1 = "3"; //10 --> A
                    break;
                case 4:
                    rHexVal1 = "4"; //10 --> A
                    break;
                case 5:
                    rHexVal1 = "5"; //10 --> A
                    break;
                case 6:
                    rHexVal1 = "6"; //10 --> A
                    break;
                case 7:
                    rHexVal1 = "7"; //10 --> A
                    break;
                case 8:
                    rHexVal1 = "8"; //10 --> A
                    break;
                case 9:
                     rHexVal1 = "9"; //10 --> A
                    break;
                case 10:
                     rHexVal1 = "A"; //10 --> A
                    break;
                case 11:
                     rHexVal1 = "B"; //11--> B
                    break;
                case 12:
                     rHexVal1 = "C";//12 --> C
                    break;
                case 13:
                     rHexVal1 = "D";//13 --> d
                    break;
                case 14:
                     rHexVal1 = "E";//14 --> E
                    break;
                case 15:
                     rHexVal1 = "F";//15 -->f
                    break;
                    }
            //now convert the second red value (rhex3 and redhexval3)
            String rHexVal3 = "Letter";
                //first, initialize the rHexVal3 string
            switch ( rHex3 ){ //working with the int rHex3
                case 0:
                     rHexVal3 = "0"; //10 --> A
                    break;
                case 1:
                     rHexVal3 = "1"; //10 --> A
                    break;
                case 2:
                     rHexVal3 = "2"; //10 --> A
                    break;
                case 3:
                     rHexVal3 = "3"; //10 --> A
                    break;
                case 4:
                     rHexVal3 = "4"; //10 --> A
                    break;
                case 5:
                     rHexVal3 = "5"; //10 --> A
                    break;
                case 6:
                     rHexVal3 = "6"; //10 --> A
                    break;
                case 7:
                     rHexVal3 = "7"; //10 --> A
                    break;
                case 8:
                     rHexVal3 = "8"; //10 --> A
                    break;
                case 9:
                     rHexVal3 = "9"; //10 --> A
                    break;
                case 10:
                     rHexVal3 = "A"; //10 --> A
                    break;
                case 11:
                     rHexVal3 = "B"; //11--> B
                    break;
                case 12:
                     rHexVal3 = "C";//12 --> C
                    break;
                case 13:
                     rHexVal3 = "D";//13 --> d
                    break;
                case 14:
                     rHexVal3 = "E";//14 --> E
                    break;
                case 15:
                     rHexVal3 = "F";//15 -->f
                    break;
            }    
            
             //now, first g value (ghex1 and ghexval1)
            String gHexVal1 = "Letter";
                //first, initialize the gHexVal1 string
            switch ( gHex1 ){ //working with the int gHex1
                case 0:
                     gHexVal1 = "0"; //10 --> A
                    break;
                case 1:
                     gHexVal1 = "1"; //10 --> A
                    break;
                case 2:
                     gHexVal1 = "2"; //10 --> A
                    break;
                case 3:
                     gHexVal1 = "3"; //10 --> A
                    break;
                case 4:
                     gHexVal1 = "4"; //10 --> A
                    break;
                case 5:
                     gHexVal1 = "5"; //10 --> A
                    break;
                case 6:
                     gHexVal1 = "6"; //10 --> A
                    break;
                case 7:
                     gHexVal1 = "7"; //10 --> A
                    break;
                case 8:
                     gHexVal1 = "8"; //10 --> A
                    break;
                case 9:
                     gHexVal1 = "9"; //10 --> A
                    break;
                case 10:
                     gHexVal1 = "A"; //10 --> A
                    break;
                case 11:
                     gHexVal1 = "B"; //11--> B
                    break;
                case 12:
                     gHexVal1 = "C";//12 --> C
                    break;
                case 13:
                     gHexVal1 = "D";//13 --> d
                    break;
                case 14:
                     gHexVal1 = "E";//14 --> E
                    break;
                case 15:
                     gHexVal1 = "F";//15 -->f
                    break;
            }
            //now convert the second g value (ghex3 and ghexval3)
            String gHexVal3 = "Letter";
                //first, initialize the gHexVal3 string
            switch ( gHex3 ){ //working with the int gHex3
                case 0:
                     gHexVal3 = "0"; //10 --> A
                    break;
                case 1:
                     gHexVal3 = "1"; //10 --> A
                    break;
                case 2:
                     gHexVal3 = "2"; //10 --> A
                    break;
                case 3:
                     gHexVal3 = "3"; //10 --> A
                    break;
                case 4:
                     gHexVal3 = "4"; //10 --> A
                    break;
                case 5:
                     gHexVal3 = "5"; //10 --> A
                    break;
                case 6:
                     gHexVal3 = "6"; //10 --> A
                    break;
                case 7:
                     gHexVal3 = "7"; //10 --> A
                    break;
                case 8:
                     gHexVal3 = "8"; //10 --> A
                    break;
                case 9:
                     gHexVal3 = "9"; //10 --> A
                    break;
                case 10:
                     gHexVal3 = "A"; //10 --> A
                    break;
                case 11:
                     gHexVal3 = "B"; //11--> B
                    break;
                case 12:
                     gHexVal3 = "C";//12 --> C
                    break;
                case 13:
                     gHexVal3 = "D";//13 --> d
                    break;
                case 14:
                     gHexVal3 = "E";//14 --> E
                    break;
                case 15:
                     gHexVal3 = "F";//15 -->f
                    break;
            } 
            
             //start with first b value (bhex1 and bhexval1)
            String bHexVal1 = "Letter";
                //first, initialize the bHexVal1 string
            switch ( bHex1 ){ //working with the int bHex1
                case 0:
                     bHexVal1 = "0"; //10 --> A
                    break;
                case 1:
                     bHexVal1 = "1"; //10 --> A
                    break;
                case 2:
                     bHexVal1 = "2"; //10 --> A
                    break;
                case 3:
                     bHexVal1 = "3"; //10 --> A
                    break;
                case 4:
                     bHexVal1 = "4"; //10 --> A
                    break;
                case 5:
                     bHexVal1 = "5"; //10 --> A
                    break;
                case 6:
                     bHexVal1 = "6"; //10 --> A
                    break;
                case 7:
                     bHexVal1 = "7"; //10 --> A
                    break;
                case 8:
                     bHexVal1 = "8"; //10 --> A
                    break;
                case 9:
                     bHexVal1 = "9"; //10 --> A
                    break;
                case 10:
                     bHexVal1 = "A"; //10 --> A
                    break;
                case 11:
                     bHexVal1 = "B"; //11--> B
                    break;
                case 12:
                     bHexVal1 = "C";//12 --> C
                    break;
                case 13:
                     bHexVal1 = "D";//13 --> d
                    break;
                case 14:
                     bHexVal1 = "E";//14 --> E
                    break;
                case 15:
                     bHexVal1 = "F";//15 -->f
                    break;
            }
            //now convert the second red value (rhex3 and redhexval3)
            String bHexVal3 = "Letter";
                //first, initialize the bHexVal3 string
            switch ( bHex3 ){ //working with the int bHex3
                case 0:
                     bHexVal3 = "0"; //10 --> A
                    break;
                case 1:
                     bHexVal3 = "1"; //10 --> A
                    break;
                case 2:
                     bHexVal3 = "2"; //10 --> A
                    break;
                case 3:
                     bHexVal3 = "3"; //10 --> A
                    break;
                case 4:
                     bHexVal3 = "4"; //10 --> A
                    break;
                case 5:
                     bHexVal3 = "5"; //10 --> A
                    break;
                case 6:
                     bHexVal3 = "6"; //10 --> A
                    break;
                case 7:
                     bHexVal3 = "7"; //10 --> A
                    break;
                case 8:
                     bHexVal3 = "8"; //10 --> A
                    break;
                case 9:
                     bHexVal3 = "9"; //10 --> A
                    break;
                case 10:
                     bHexVal3 = "A"; //10 --> A
                    break;
                case 11:
                     bHexVal3 = "B"; //11--> B
                    break;
                case 12:
                     bHexVal3 = "C";//12 --> C
                    break;
                case 13:
                     bHexVal3 = "D";//13 --> d
                    break;
                case 14:
                     bHexVal3 = "E";//14 --> E
                    break;
                case 15:
                     bHexVal3 = "F";//15 -->f
                    break;
            } 
    
    
            //make an if statement so that the program only prints
                //if the inputs are valid
        
            //print out the original decimal numbers and then their hexadecimal version
            System.out.println("The decimanl numbers R: " + 
                r + ", G: " + g + ", B: " + b +  
                ", is represented in hexadecimal as: " 
                + rHexVal3 + rHexVal1 + gHexVal3 + gHexVal1 
                + bHexVal3 + bHexVal1);
                     
            }
            //now you are outside of the valid b range
            else {
                System.out.println("Please enter values between 0 and 255.");
                    //asks for valid input
            }//now you have completely validated the b values
        }
        //now you are outside the valid g range
        else{
            System.out.println("Please enter values between 0 and 255.");
                //asks for valid input
        }//now you have completely validated the g values
    }//now you are outside of the valid r range
    else{
           System.out.println("Please enter values between 0 and 255.");
                //asks for valid input
    }//now you have completely validated the r values
    }//main method scope ends
}//class scope ends
