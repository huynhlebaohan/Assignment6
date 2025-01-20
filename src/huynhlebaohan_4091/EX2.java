package huynhlebaohan_4091;

import java.util.ArrayList;

public class EX2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Black");
        colors.add("Green");
        colors.add("Orange");
        colors.add("blue");
        colors.set(1, "Yellow");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
