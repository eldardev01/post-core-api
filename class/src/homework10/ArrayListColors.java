package homework10;

import java.util.ArrayList;

public class ArrayListColors {
    private static ArrayList<String> colorsList = new ArrayList<>();

    public void addList(String color1, String color2, String color3) {
        colorsList.add(color1);
        colorsList.add(color2);
        colorsList.add(color3);
    }
    public void printList() {
        for (String list: colorsList) {
            System.out.println(list);
        }
    }
}
