//Reilly Callahan
//CSE2 lab04
//Feb 19, 2016

//Card Generator
//geneerate a random card number and determine the suit of the card

//start class and main method
public class CardGenerator {
    public static void main(String[] args){
        
        //generate a random number from 0-13
        int number = (int)(Math.random() * 52);
        //initialize the suits via string
        String suit = "suit";
        //iniitialize the card ID
        String iD = "ID";
        
        //use if statements to assign the suit
        if ( number <= 13 ){ //if between 0-13, diamond
            suit = "Diamonds";
        }
        else if ( number <= 26 ){//between 14-26, club
            suit = "Clubs";
        }
        else if ( number <= 39 ){//between 27-39, heart
            suit = "Hearts";
        }
        else{//between 40-52, spade
            suit = "Spades";
        }
        
        //convert card numbers to correct number within their suit
        int cardNum = number % 13;
            //uses the modulus to find the remainder of division 
                //and therefore the number within its suit
            
        // change numbers so 1= ace, 2-10 = 2-10, and 11-13 = Jack-King
        switch ( cardNum ){ //switch cardNumbers 
            case 1:
                iD = "Ace"; //1 = ace
                break;
            case 2:
                iD = "2"; //2 = 2
                break;
            case 3:
                iD = "3";//3 = 3
                break;
            case 4:
                iD = "4";//4 = 4
                break;
            case 5:
                iD = "5";//5 = 5
                break;
            case 6:
                iD = "6";//6 = 6
                break;
            case 7:
                iD = "7";//7 = 7
                break;
            case 8:
                iD = "8";//8 = 8
                break;
            case 9:
                iD = "9";//9 = 9
                break;
            case 10:
                iD = "10";//10 = 10
                break;
            case 11:
                iD = "Jack"; //11 = jack
                break;
            case 12:
                iD = "Queen"; //12 = queen
                break;
            default: //the only cardNum left is 13
                iD = "King"; //13 = king
                break;
        }
        
        //print the identity and suit of the card
        System.out.println("You picked the " + iD + " of " + suit);
        
    }
}