//Reilly Callahan CSE2
//HW02
//Due Feb 09, 2016

//define a class
public class Arithmetic {
    //main method
    public static void main(String[] args){
        
        //inputs
        int numPants = 3; //3 pairs of pants
        double pantsPrice = 34.98; //price per pant pair
        int numShirts = 2; //2 shirts
        double shirtPrice = 24.99; //price per shirt
        int numBelts = 1; //one belt
        double beltCost = 33.99; //price per belt
        double paSalesTax = 0.06; //tax rate
        //establish outputs
        double totPantsPrice, totShirtPrice, totBeltPrice; //raw group prices
        double taxPantsPrice, taxShirtPrice, taxBeltPrice;//taxes on each group
        double pantsWTax, shirtWTax, beltWTax; //total prices of each gropu
        double subTotal, taxTotal, finalTotal; //combined totals
        
        
        //calculations
        //raw price for items - number of item * price per item
        totPantsPrice = numPants * pantsPrice;//raw cost for all pants
        totShirtPrice = numShirts * shirtPrice;//raw cost for all shirts
        totBeltPrice = numBelts * beltCost;//raw cost for belt
        //taxes and prices with taxes for groups of items
        taxPantsPrice = totPantsPrice * paSalesTax;//tax cost for pants
        pantsWTax = taxPantsPrice + totPantsPrice;//pants taxes + raw pant price
        taxShirtPrice = totShirtPrice * paSalesTax;//tax cost for shirts
        shirtWTax = taxShirtPrice + totShirtPrice; //shirt tax + raw shirt price
        taxBeltPrice = totBeltPrice * paSalesTax;// tax for belt
        beltWTax = taxBeltPrice + totBeltPrice; //belt tax + raw belt price
        //combined totals
        subTotal = totPantsPrice + totShirtPrice + totBeltPrice; //raw combined price
        taxTotal = taxPantsPrice + taxShirtPrice + taxBeltPrice;//total price of taxes
        finalTotal = pantsWTax + shirtWTax + beltWTax; //final amount due
        
        
        //make the numbers pretty for printing
         totPantsPrice = (int) (100 * totPantsPrice) / 100.0;//multiply raw pant price
            //by 100, then covert to int and divide by 100
         totShirtPrice = (int) (100 * totShirtPrice)/ 100.0;//multiply raw shirt price
            //by 100, then covert to int and divide by 100
         totBeltPrice = (int) (100 * totBeltPrice) / 100.0;//multiply raw belt price
            //by 100, then covert to int and divide by 100
         taxPantsPrice = (int) (100 * taxPantsPrice) / 100.0;//multiply pant tax by
            // 100, then covert to int and divide by 100
         taxShirtPrice = (int) (100 * taxShirtPrice) / 100.0;//multiply shirt tax by
            // 100, then covert to int and divide by 100
         taxBeltPrice = (int) (100 * taxBeltPrice) / 100.0;//multiply belt tax by
            // 100, then covert to int and divide by 100
         subTotal = (int) (100 * subTotal) / 100.0;//multiply subtotal by 100, then
            //  covert to int and divide by 100
         taxTotal = (int) (100 * taxTotal) / 100.0;//multiply all taxes by 100, then
            //  covert to int and divide by 100
         finalTotal  = (int) (100 * finalTotal) / 100.0;//multiply total by 100, then
            //  covert to int and divide by 100


        //print the costs and tax for each group
        System.out.println("The pants cost " + totPantsPrice + " before tax. The tax on pants is "
        + taxPantsPrice + "."); //print costs for pants
        System.out.println("The shirts cost " + totShirtPrice + " before tax. The tax on shirts is "
        + taxShirtPrice + "."); //print costs for shirts
        System.out.println("The belt costs " + totBeltPrice + " before tax. The tax on the belt is "
        + taxBeltPrice + "."); //print costs for belt
        //print the costs added together
        System.out.println("The subtotal is " + subTotal + ".");
        System.out.println("The combined tax on these clothes is " + taxTotal + ".");
        System.out.println("The complete cost of this shopping spree is " + finalTotal + ".");
        
    }
}