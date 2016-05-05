/* Reilly Callahan
Due April 26, 2016
HW12: holoporter*/

//

import java.util.Random; //import random class
import java.util.Scanner; //import scanner class

public class Holoporter{
    public static void main(String [] args ){
        Random rand = new Random(); //construct and declare random 
        Scanner scan = new Scanner(System.in);//declare scanner class
        String[][][] objectOne = soRandom();
        //print(objectOne);
        String[][][] container = soRandom(); //makes a second array
        for( int i =0; i< container.length; i++){
            for(int j = 0; j < container[i].length; j++){
                for(int k = 0; k < container[i][j].length; k++){
                    container[i][j][k] = " ";//assigns all values to 0
                }
            }
        }
        holoport( objectOne, container);
    }//main meth
    
    public static String[][][] soRandom(){
        Random rand = new Random(); //construct and declare random 
        Scanner scan = new Scanner(System.in);//declare scanner class
    
        int o = rand.nextInt(9) + 1; //random int 1 thru 10 for length of outermost array
        String [][][] array = new String [o][][];//allocate and declare an array to have o spots
        
        for( int i = 0; i < o; i++){ //for every member inthe outermost array...
            int mid = rand.nextInt(9) + 1; //generates numbers 1 --> 10 inclusive
            array[i] = new String [mid][]; //allocates random length of each middle array
            for(int j = 0; j < mid; j++){ //for ea /ch member of the middle array...
                int inner = rand.nextInt(9) + 1;//random int 1 thru 10 for innermost array
                array[i][j] = new String [inner];//allocates random length of each innermost array
                for(int k = 0; k < inner; k++){
                    String input = coder();
                    array[i][j][k] = input; 
                    for( int c = 0; c < inner; c++){//for all of the inner ones...
                        if(input == array[i][j][c] ){//if the input previously set is the same
                            //at this point that its now checking...
                            array[i][j][k] = coder();//find a new random molecule for this spot
                        }
                    }
                }
            }
        }
        return array;
    }//soRandom
    
    public static String coder(){
         Random rand = new Random(); //construct and declare random 
        String molecule = " ";
        String[] aZ = { "A", "B", "C", "D", "E", "F", "G", "H", "I","J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            //creates a string with letters A thru Z
        int letterIndex = rand.nextInt(aZ.length );
        int letterIndex2 = rand.nextInt(aZ.length);
        
        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            //creates a string with numbers 0 thru 9
        int numIndex = rand.nextInt(num.length);
        int numIndex2 = rand.nextInt(num.length);
        int numIndex3 = rand.nextInt(num.length);
        int numIndex4 = rand.nextInt(num.length);
        
        molecule = aZ[letterIndex] + aZ[letterIndex2] + num[numIndex] + num[numIndex2] + num[numIndex3] + num[numIndex4];
        
       // used to check the method System.out.print(molecule + "      ");
        
        return molecule; //returns a random letter from A-Z
    }//end of coder
    
    public static void print(String[][][] a){ 
        for( int i = 0; i < a.length; i++ ){
            for( int j = 0 ; j < a[i].length; j++ ){
                for( int k = 0; k< a[i][j].length; k++ ){
                    if(k == 0){
                        System.out.print("[");
                    }
                    System.out.print(a[i][j][k] );
                    if( k == a[i][j].length - 1 ){//if its the last member...
                        System.out.print("]");
                    }
                    else{
                        System.out.print(", ");
                    }
                } //done printing the values of one innermost array
                if(i != a.length - 1 ){
                    //keep going normally...
                }
                else{
                    if(j != a[i].length - 1){
                       System.out.print(" | "); //get ready to print the next innermost array
                    }
                }
            }
            if(i != a.length - 1) {
                System.out.print("---");
            }
        }
    }//prints the3D array
    
    public static String[][][] holoport(String [][][] object, String [][][] container){
        //first, allocate the new string
        String[][][] newObj;//declares new array
        if(object.length > container.length){
            newObj = new String[object.length] [][];
            for(int i = 0; i < object.length; i++){
                if(object[i].length > container[i].length){
                    newObj[i] = new String [object[i].length ][];
                    for(int j = 0; j < object[i].length; j++){
                        if(object[i][j].length > container[i][j].length){
                            newObj[i][j] = new String [object[i][j].length];
                        }
                        else{
                            newObj[i][j] = new String [container[i][j].length];
                        }
                    }
                }
                else{
                    newObj[i] = new String [ container[i].length][];
                    for(int j = 0; j < container[i].length; j++){
                        if(object[i][j].length > container[i][j].length){
                            newObj[i][j] = new String [object[i][j].length];
                        }
                        else{
                            newObj[i][j] = new String [container[i][j].length];
                        }
                    }
                }
            }
        }
        else{
            newObj = new String[container.length][][];
            for(int i = 0; i < object.length; i++){
                if(object[i].length > container[i].length){
                    newObj[i] = new String [object[i].length ][];
                    for(int j = 0; j < object[i].length; j++){
                        if(object[i][j].length > container[i][j].length){
                            newObj[i][j] = new String [object[i][j].length];
                        }
                        else{
                            newObj[i][j] = new String [container[i][j].length];
                        }
                    }
                }
                else{
                    newObj[i] = new String [ container[i].length][];
                    for(int j = 0; j < container[i].length; j++){
                        if(object[i][j].length > container[i][j].length){
                            newObj[i][j] = new String [object[i][j].length];
                        }
                        else{
                            newObj[i][j] = new String [container[i][j].length];
                        }
                    }
                }
            }
        }
        
        
        // parameterize
        if(container.length < object.length){//if the object is bigger, truncate
            for( int i =0; i< container.length; i++){
                if(container[i].length < object[i].length){
                    for(int j = 0; j < container[i].length; j++){
                        if( container[i][j].length < object[i][j].length){
                            for(int k = 0; k < container[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the obj value 
                                //for all container values 
                            }//inner for
                        }//inner if
                        else{//if the containter is bigger....
                            //fill the new object with old object values and then assign special code to gaps 
                            for(int k = 0; k < object[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the object value 
                                //for all object values 
                            }//inner for
                             System.out.print("object length: " + object[i][j].length + " container length: " + container[i][j].length);
                            for(int k = object[i][j].length- 1; k < container[i][j].length; k++){
                                newObj[i][j][k] = "$$$$$$"; //assign the leftoer values to the special code
                            }//inner for
                            
                        }//inner else
                    }//mid for
                    
                }///mid if
                else{//if the container is bigger...
                    for(int j = 0; j < object[i].length; j++){
                        if( container[i][j].length < object[i][j].length){
                            for(int k = 0; k < container[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the obj value 
                                //for all container values 
                            }
                        }
                        else{//if the containter is bigger....
                            //fill the new object with old object values and then assign special code to gaps 
                            for(int k = 0; k < object[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the object value 
                                //for all object values 
                            }
                             System.out.print("object length: " + object[i][j].length + " container length: " + container[i][j].length);
                            for(int k = object[i][j].length - 1; k < container[i][j].length; k++){
                                newObj[i][j][k] = "$$$$$$"; //assign the leftoer values to the special code
                            }
                            
                        }
                            
                    }      
                }//mid else
            }//outer for
        }//outer if
        else{//if the containter is bigger...
            for(int i = 0; i < object.length; i++){
                if(container[i].length < object[i].length){
                    for(int j = 0; j < container[i].length; j++){
                        if( container[i][j].length < object[i][j].length){
                            for(int k = 0; k < container[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the obj value 
                                //for all container values 
                            }//inner for
                        }//inner if
                        else{//if the containter is bigger....
                            //fill the new object with old object values and then assign special code to gaps 
                            for(int k = 0; k < object[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the object value 
                                //for all object values 
                            }//inner for
                             System.out.print("object length: " + object[i][j].length + " container length: " + container[i][j].length);
                            for(int k = object[i][j].length - 1; k < container[i][j].length; k++){
                                newObj[i][j][k] = "$$$$$$"; //assign the leftoer values to the special code
                            }//inner for
                            
                        }//inner else
                    }//mid for
                    
                }///mid if
                else{//if the container is bigger...
                    for(int j = 0; j < object[i].length; j++){
                        if( container[i][j].length < object[i][j].length){
                            for(int k = 0; k < container[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the obj value 
                                //for all container values 
                            }
                        }
                        else{//if the containter is bigger....
                            //fill the new object with old object values and then assign special code to gaps 
                            for(int k = 0; k < object[i][j].length; k++){
                               newObj[i][j][k] = object[i][j][k];//assign the newobject to the object value 
                                //for all object values 
                            }
                            System.out.print("object length: " + object[i][j].length + " container length: " + container[i][j].length);
                            for(int k = object[i][j].length - 1; k < container[i][j].length; k++){
                                newObj[i][j][k] = "$$$$$$"; //assign the leftoer values to the special code
                            }
                            
                        }
                            
                    }      
                }//mid else
                
            }//outer for
        }//outer else
        return newObj;
    }//end of holoport
    
}//end class