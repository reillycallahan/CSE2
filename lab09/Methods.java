//Reilly Callahan
//CSE 2 lab 9
//March 25, 2015

//use methods to generate english sentences

//import the random class
import java.util.Random;

//import the scanner class
import java.util.Scanner;

//open class and main method
public class Methods{ 
    public static void main(String[] args){
        
        Random rand = new Random();//construct and declare random generator
        Scanner scan = new Scanner(System.in);//consturct and decalte scanner
        
        boolean check = true;// initialize a boolean for while loop
        while( check ){ //begin an infinite loop
            //now run the methods for adj, nouns, verbs, nouns
            System.out.print("The "); //print an article to start the sentence
                
            int intAdj = rand.nextInt(10);//generates a random value 0-9
            adjectiveGenerator(intAdj); //mehtod that generates adj
                
            int intNoun = rand.nextInt(10);//generates a random value 0-9
            nounGenerator(intNoun);//mehtod that generates noun
                
            int intVerb = rand.nextInt(10);//generates a random value 0-9
            verbGenerator(intVerb);//mehtod that generates verb
                
            System.out.print("the "); //prints an article before second noun
                
            int intNoun2 = rand.nextInt(10);//generates a random value 0-9
            noun2Generator(intNoun2);//mehtod that generates second noun
                
             System.out.println("."); //period at the end of the sentence
                 
           //once one sentence has been generated, ask if they want anoter
             System.out.println("Please enter 'yes' if you would like another sentence");
                //prompts user to enter yes for another sentence
            String continuePlz = "yes"; //initializes variable for yes
            String continueOrNah = scan.nextLine(); //assigns user input to a variable
            if( continueOrNah.equals(continuePlz) ){ //if user enters yes..
                //keep going in the infinite loop
            }
            else{//if they didnt answer yes...
                break;//end the infiintie loop
            }
        }//end of infinite loop
    }//end of main method
    public static void adjectiveGenerator(int adj){ //for the adjective
       String adjective = "hi"; //initializes string for adjective
        switch( adj ){ //change the random number to....
            case 0:
                adjective = "fantastical ";
                break;
            case 1:
                adjective = "majestic ";
                break;
            case 2:
                adjective = "fluffy ";
                break;
            case 3:
                adjective = "terrifying ";
                break;
            case 4:
                adjective = "embarrassing ";
                break;
            case 5:
                adjective = "ebullient ";
                break;
            case 6:
                adjective = "miniature ";
                break;
            case 7:
                adjective = "obnoxious ";
                break;
            case 8:
                adjective = "magnificent ";
                break;
            case 9:
                adjective = "tiney tiny ";
                break;
        }
        //now that you have the ajective, print it
        System.out.print(adjective);
       
    }
    public static void nounGenerator(int nouN){ //for the adjective
       String noun = "hi";//initializes string for noun
        switch( nouN ){//change the random number to....
            case 0:
                noun = "unicorn ";
                break;
            case 1:
                noun = "pirate ship ";
                break;
            case 2:
                noun = "poodle ";
                break;
            case 3:
                noun = "noodle ";
                break;
            case 4:
                noun = "monkey ";
                break;
            case 5:
                noun = "potato ";
                break;
            case 6:
                noun = "lemur ";
                break;
            case 7:
                noun = "water bottle ";
                break;
            case 8:
                noun = "clown fish ";
                break;
            case 9:
                noun = "clown nose ";
                break;
        }
        //now that you have the  noun, print it
        System.out.print(noun);
       
    }
    public static void verbGenerator(int verB){ //for the adjective
       String verb = "hi"; //initializes verb string
        switch( verB ){ //change random number to...
            case 0:
                verb = "leeped over ";
                break;
            case 1:
                verb = "soared above ";
                break;
            case 2:
                verb = "skidded across ";
                break;
            case 3:
                verb = "slithered ontop of ";
                break;
            case 4:
                verb = "destroyed ";
                break;
            case 5:
                verb = "ruined ";
                break;
            case 6:
                verb = "tickled ";
                break;
            case 7:
                verb = "picked up ";
                break;
            case 8:
                verb = "buried ";
                break;
            case 9:
                verb = "murdered ";
                break;
        }
        //now that you have the verb, print it
        System.out.print(verb);
       
    }
    
    public static void noun2Generator(int secondNoun){ //for the adjective
       String noun2 = "hi"; //iniitalizes string for noun2
        switch( secondNoun ){ //changes random number to...
            case 0:
                noun2 = "queen";
                break;
            case 1:
                noun2 = "Barney";
                break;
            case 2:
                noun2 = "chew toy";
                break;
            case 3:
                noun2 = "fluffer-nutter";
                break;
            case 4:
                noun2 = "oreo";
                break;
            case 5:
                noun2 = "rugby player";
                break;
            case 6:
                noun2 = "action figures";
                break;
            case 7:
                noun2 = "mountain hawk";
                break;
            case 8:
                noun2 = "Fud truck";
                break;
            case 9:
                noun2 = "dictionary";
                break;
        }
        //now that you have the noun, print it
        System.out.print(noun2);
       
    }
}