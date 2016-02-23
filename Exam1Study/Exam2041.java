//practice exam from fall 2014
public class Exam2041 {
    public static void main(String[] args){
        //String day = "day";
       // int prob1A = 1 + 1 + "day" + 2 + 3;
        //boolean prob1B = 3 * 4 == 7 > 5;
        //boolean prob1C = 2 < 3 || 5 * 2 ==11 && 5 > 6;
    //    boolean prob = 2 < 3 == 5 > 6;
        //double prob1D = 3 % 12 + 5 * 4 % 11 / 2.0;
      //  boolean prob1E = 2 < 0 && 3 / (1-1) > 0;
        //boolean prob1 = 3 / (1-1) > 0;
        //System.out.println(prob1C);
        //System.out.println(prob);
        //System.out.println(prob1E);
        //System.out.println(prob1);
        
        //int n = 5, m = 7, k = 0, y;
          //  if( n*m*2%6 ==4){
            //    k=20;
            //}
            //if ((n+m)/.5 > 10){
             //   k+=8;
        //    }
          //  y = 2.1; 
            //System.out.println(y +"k= " + k);
            
    /*    int k = 50;
        int j = 12;
        int n = 5;
        int v = n++;
        if(k/j > 2 && k%j > 1){
            k++;
            if( j%k > 14){
                 k++;
        	    j++;
            }
            else{j--;}
            }
         else{k/=2;
         } 
System.out.println(j+" "+k);
System.out.println(v);
    */
   /* int k = 22;
    char y = 'y';
    char Y  = 'Y';
    char n = 'n';
    char N = 'N';
    char x = 'N';
    
    switch (x){
        case 'y':
        System.out.println('y');
    case 'Y': 
        System.out.println('Y'); 
        k /= 2;
    case 'n':
        break;
    case 'N':
        System.out.println('N');
        k += 5;
        break;
    default:
        System.out.println("default ");
        k *= 5;
    }
    System.out.printf("k = %2.2f\n", (double)k);
*/
        import java.util.Scanner;
        Scanner myScanner = new Scanner (System.in);
        //prompt
        System.out.println("Please enter a 5-digit positive int: ");
        //vallidate input
        while (!myScanner.hasNextInt() ){
            System.out.print("Sorry, please enter a real int.");
            myScanner.nextLine();
        }
        
    }
}