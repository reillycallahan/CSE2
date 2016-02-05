//Reilly Callahan-- CSE2
//Feb 5, 2016
//lab 02- cyclometer
//printing the time, rotations, and distances of a cycler

//define a class
public class Cyclometer{
    //main method required for every Java program
    public static void main(String[] args) {
        
        //our input data 
        int secsTrip1 = 480; //seconds to make 1st trip
        int secsTrip2 = 3220; //seconds for 2nd trip
        int countsTrip1 = 1561; // number rotations for 1st trip
        int countsTrip2 = 9037; // number roations for 2nd trip
        //establish intermediate variables and output data
        double wheelDiameter = 27.0; //diameter of the bike wheel
        double PI = 3.14159; //value of pi
        double feetPerMile = 5280; //conversion factor for feet/mile
        double inchesPerFoot = 12;//conversion factor
        double secondsPerMinute = 60; //conversion factor
        double distanceTrip1, distanceTrip2, totalDistance; //establishing
            //variables for output
        
        //Print seconds and counts
        System.out.println("Trip 1 tookkkk " + (secsTrip1/secondsPerMinute) + "minutes and had " + countsTrip1 + " counts.");
        System.out.println("Trip 2 took " + (secsTrip2/secondsPerMinute) + "minutes and had " + countsTrip2 + " counts.");
        
        //caluclate the distance and convert to miles
            //trip1
            distanceTrip1 = countsTrip1 * wheelDiameter * PI; //distance in inches
            distanceTrip1 /= inchesPerFoot * feetPerMile; //converts to miles
            //trip2 
            distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot /feetPerMile; //distance in inches
            //add the two
            totalDistance = distanceTrip1 + distanceTrip2;
        
        //print the caluculated distances
        System.out.println("Trip 1 was " + distanceTrip1 + "miles");
        System.out.println("Trip 2 was " + distanceTrip2 + "miles");
        System.out.println("The total Distance was " + totalDistance + "miles");
        
    } //end of main method
} //end of class

