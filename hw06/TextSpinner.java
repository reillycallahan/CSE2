/*
Reilly Callahan 
CSE 2 hw 06
Due March 8, 2016
*/

//Create a spinning module

//open class and main method
public class TextSpinner{
    public static void main(String[] args){
    
        //intiialize variables
        int t = 1;//counter set to a positive int
        char slash = '/';//the first char of the sequence
        char delete = '\b'; //the backspace unicode
        char hyphon = '-';//the second char of the sequence
        char backslash = '\\';//the third char of the sequence
        char stick = '|';//the last char of the sequence
        while ( t > 0 ){ //start an infinite loop
            if ( t % 4 == 1 ){//the first char when remainder is 1
                System.out.print(slash);//print a slash
            }
            if (t % 4 == 2 ){//the second char when remainder is 2
                System.out.print(delete);//delete the slash
                System.out.print(hyphon);//print the hyphon
            }
            if( t % 4 == 3 ){//the third char when remainder is 3
                System.out.print(delete);//delete the slash
                System.out.print(backslash);//print the backslash
            }
            
            if( t % 4 == 0 ){//the last char when remainder is 0
                System.out.print(delete);//delete the slash
                System.out.print(stick);//print the stick
                System.out.print(delete);//delete the sitck
            }
           t++;//increement the count
        }
    }
}