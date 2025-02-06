package collection;

import java.util.ArrayList;

public class class1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
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
//        System.out.println(list);

        for(String line : list){
            System.out.println(line);
        }
    }
}
