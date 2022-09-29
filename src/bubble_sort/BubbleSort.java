package bubble_sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
        bubbleSort(list);
    }
    private static List<Integer> list = new ArrayList<>(Arrays.asList(1, 6, 8, 10));
    private static void bubbleSort(List<Integer> list) {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i<list.size()-1; i++) {
                if (list.get(i) > list.get(i+1)) {
                    temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    sorted = false;
                }
            }
        }
        System.out.println(list);
    }
}
