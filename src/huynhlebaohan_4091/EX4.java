package huynhlebaohan_4091;

import java.util.ArrayList;

public class EX4 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Viet Nam");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("London");
        cities.add("Sydney");
        boolean contain = cities.contains("London");
        if (contain) {
            System.out.println("The list contains the city: London");
        } else {
            System.out.println("The list doesn't contain the city:London");
        }
        for (String citie : cities) {
            System.out.println(citie);
        }
    }
}
