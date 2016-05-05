/*Reilly
studying for exam 3*/
import java.util.Random;
import java.util.Scanner;
public class Exam3{
    public static void main( String [] args){
        
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        
        int [] array1 = new int [15];
        int [] array2 = new int [5];
        
        System.out.print("Enter increasing ints: ");
        for(int i = 0; i< 15; i++){
            //while(true...)
                //if(hasnextint)....
                    array1[i] = scan.nextInt();
                    //if (in range)....
                        //check = false;
                    //else{ print bad}
                //else{ scan.next();
        }
        for(int i = 0; i< 15; i++){
            System.out.print(array1[i] + " ");
        }
        int search = scan.nextInt();
        binary(array1, search);
        scramble(array1);
        System.out.println("Scram:");
        for(int i = 0; i< 15; i++){
            System.out.print(array1[i] + " ");
        }
        linear(array1, search);
        
        
        /*lab10 redo
        String []students = new String[rand.nextInt(6) + 5];
        int[] midterm = new int [students.length];
        for(int i = 0; i< students.length; i++){
            System.out.print("Enter a student's name: ");
            students[i] = scan.next();
            midterm[i] = rand.nextInt(101);
        }
        for(int i = 0; i< students.length; i++){
            System.out.println(students[i] + ": " + midterm[i]);
        }*/
        
        
        /* Finding the  maximum and minimum strings
        String [] original = {"one", "two", "to", "fifteen", "three"};
        
        int min = original[0].length();//length of first string
    	int max = original[0].length(); //length of first string
    	String minString = " ";
    	String maxString = " ";
    	for (int i = 0; i< original.length ; i++){//for all members
        	int length = original[i].length();
    		if(min > length){//if this current length is smaller…
    			min = length;
    			minString = original[i];
    		}
    		if(max < length){//if this current length is bigger….
    			max = length;
    			maxString = original[i];
    		}
    	}
    	//String[] finalS = {minString, maxString};
    	System.out.print(minString + " hi " + maxString); */
        
        
        
       /*printing overlap of two arrays in a third array with 0th entry being #overlapped members
       for( int i = 0; i < 5; i++){
            array1[i] = rand.nextInt(10);
            array2[i] = rand.nextInt(10);
        }
        
        System.out.print("Array1: ");
        for(int i = 0 ; i < 5; i++){
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Array2: ");
        for(int i = 0 ; i < 5; i++){
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        //first just counting the number of matches
        int t = 0; //counter for number of overlap
        for(int i = 0; i< array1.length; i++){
            for( int j = 0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    t++;
                }
               
            }
        }
        //now actually assigning array3
        int[] array3 = new int [t + 1];
        array3[0] = t;
        int k = 1;//coutner for array index of new array
        for(int i = 0; i< array1.length; i++){
            for(  int j = 0; j<array2.length; j++){
                if(array1[i] == array2[j]){
                    array3[k] = array1[i];
                    k++;
                }
            }
        }
        System.out.print("Array3: ");
        for(  k = 0; k < array3.length; k++){
            System.out.print(array3[k] + " ");
        }*/
        
        
        
        
        
    }//main meth
    
    
    public static void binary(int[] a, int x){
        int min = 0;
        int max = a.length;
        int mid = (max + min)/ 2;
        int t = 0;
        while(a[mid] != x ){
            if(a[mid] > x){//move to first half
                    max = mid; 
                    mid = (max + min) /2;
                    t++;
            }
            else if( a[mid] < x){//move to last half
                    min = mid;
                    mid = (max+ min) /2;
                    t++;
            }
            if (a[mid] == x) {
                    System.out.print("found it");
                    break;
            }
            if((max - min) < 3){
                System.out.print("no luck");
                break;
            }
        }
    
    
    }//binary
    
    public static int[] scramble( int[] a){
        Random rand = new Random();
        for(int i =0; i< a.length; i++){
            int r = rand.nextInt(a.length);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
        return a;
    }
    
    
    public static void linear(int[] a, int target){
        System.out.println("target: " + target + "HIIIII");
        boolean nope = false;
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
            if(a[i] == target){
                System.out.print("found it at " + i);
                nope = false;
                break;
            }
            else{
                nope = true;
            }
        }
        if(nope){
            System.out.print("no luck");
        }
        
        
        
    }//linear
    
    
}//class