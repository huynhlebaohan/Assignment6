package huynhlebaohan_4091;

import java.util.ArrayList;

public class EX1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
