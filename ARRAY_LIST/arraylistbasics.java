package ARRAY_LIST;

import java.util.ArrayList;

public class arraylistbasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.set(2, 10));
        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.contains(11));
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.size());
    }

}
