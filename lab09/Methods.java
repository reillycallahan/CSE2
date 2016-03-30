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
        
        while( check ){
           
            //now run the methods for adj, nouns, verbs, nouns
            int intAdj = rand.nextInt(10);//generates a random value 0-9
            adjectiveGenerator(intAdj);
            
            int intNoun = rand.nextInt(10);
            nounGenerator(intNoun);
            
            int intVerb = rand.nextInt(10);
            verbGenerator(intVerb);
            
            System.out.print("the "); //prints an article 
            
            int intNoun2 = rand.nextInt(10);
            noun2Generator(intNoun2);
            
             System.out.println(".");
             //once one sentence has been generated, ask if they want anoter
             System.out.println("Please enter the letter y if you would like another sentence");
            String continueOrNah = scan.nextString();
            //convert input to int
                //if entered int == int for y, then check = true. if not, then check = false
        }
     
    }
    public static void adjectiveGenerator(int adj){ //for the adjective
       String adjective = "hi";
        switch( adj ){
            case 0:
                adjective = "The fantastical ";
                break;
            case 1:
                adjective = "The majestic ";
                break;
            case 2:
                adjective = "A fluffy ";
                break;
            case 3:
                adjective = "The terrifying ";
                break;
            case 4:
                adjective = "An embarrassing ";
                break;
            case 5:
                adjective = "An ebullient ";
                break;
            case 6:
                adjective = "The miniature ";
                break;
            case 7:
                adjective = "The obnoxious ";
                break;
            case 8:
                adjective = "The magnificent ";
                break;
            case 9:
                adjective = "A tiney tiny ";
                break;
        }
        //now that you have the ajective, print it
        System.out.print(adjective);
       
    }
    public static void nounGenerator(int adj){ //for the adjective
       String noun = "hi";
        switch( adj ){
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
        //now that you have the ajective, print it
        System.out.print(noun);
       
    }
    public static void verbGenerator(int adj){ //for the adjective
       String verb = "hi";
        switch( adj ){
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
        //now that you have the ajective, print it
        System.out.print(verb);
       
    }
    
    public static void noun2Generator(int adj){ //for the adjective
       String noun2 = "hi";
        switch( adj ){
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
        //now that you have the ajective, print it
        System.out.print(noun2);
       
    }
}