package collection;

import java.util.ArrayList;

public class class1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("Pineapple");
        list.add("Grapes");
        list.add("Watermelon");
        list.add("Lemon");
        list.add("Kiwi");
        list.add("Guava");

        list2.add("2-data-Apple");
        list2.add("2-data-Banana");
        list2.add("2-data-Mango");
        list2.add("2-data-Orange");
        list2.add("2-data-Pineapple");
        list2.add("2-data-Grapes");
        list2.add("2-data-Watermelon");
        list2.add("2-data-Lemon");
        list2.add("2-data-Kiwi");
        list2.add("2-data-Guava");

        list.addAll(list2);
//        System.out.println(list);

        for(String line : list){
            System.out.println(line);
        }
    }
}
