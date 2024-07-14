package hw_10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,3,9,2,-11,8,6,9,45,54,-789,7));
        for(int i = 0; i < list.size(); i ++){
            list.set(i, list.get(i) + 3);
        }
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}