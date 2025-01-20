package huynhlebaohan_4091;

import java.util.ArrayList;

public class EX3 {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(19.99);
        prices.add(8.15);
        prices.add(12.54);
        prices.add(25.00);
        prices.add(30.75);
        for (double price : prices) {
            System.out.println(price);
        }
    }
}
