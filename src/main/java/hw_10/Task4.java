package hw_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task4 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(6);
        set.add(9);
        set.add(3);
        set.add(5);
        set.add(1);
        set.add(6);
        set.add(8);
        set.add(6);
        set.add(4);
        set.add(4);
        set.add(4);
        System.out.println(set);
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
        list.clear();
        System.out.println(list.size());
    }
}