package huynhlebaohan_4091;

import java.util.ArrayList;

public class EX5 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(82);
        numbers.add(6);
        numbers.add(78);
        numbers.add(25);
        numbers.add(30);
        numbers.add(13);
        numbers.add(98);
        numbers.add(45);
        numbers.add(100);
        numbers.add(56);
        numbers.add(64);
        numbers.remove(2);
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
