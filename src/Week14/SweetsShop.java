package Week14;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class SweetsShop {

    //attributes
    private static ArrayList<Double> price = new ArrayList<>();

    //taking input and convert to useful data
    public static void setPrice () {
        for(int i = 0; i < 5; i++) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter sweet price: ");
            String tempVar = in.nextLine();
            String prepVar = tempVar.replace("p", "");
            double va = Integer.parseInt(prepVar);
            double val = va / 100;

            price.add(val);
        }
        System.out.println("Prices stored inside of an array:");
        System.out.println(price);
        System.out.println("-------------------------");
    }

    //looking and display max price
    public static void maxPrice(){
        NumberFormat nw = NumberFormat.getCurrencyInstance(Locale.UK);
        double n = Collections.max(price);
        System.out.println("Max price: " + nw.format(n));
        System.out.println("-------------------------");
    }

    //looking and displaying min price
    public static void minPrice(){
        NumberFormat nw = NumberFormat.getCurrencyInstance(Locale.UK);
        double n = Collections.min(price);
        System.out.println("Min price: " + nw.format(n));
        System.out.println("-------------------------");
    }

    //calculate total price
    public static void totalPrice(){
        double n = 0;
        for (double value : price){
            n += value;
        }
        NumberFormat nw = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Total price: " + nw.format(n));
        System.out.println("-------------------------");
    }

    //calculating average price
    public static void averagePrice(){
        double n = 0;
        int count = 0;
        for (double value : price){
            n += value;
            count++;
        }
        double average = n / count;
        NumberFormat nw = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println("Average price: " + nw.format(average));
        System.out.println("-------------------------");
    }

    //main method
    public static void main(String[] args) {
        setPrice();
        maxPrice();
        minPrice();
        totalPrice();
        averagePrice();
    }

}
