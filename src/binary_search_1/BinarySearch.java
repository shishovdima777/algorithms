package binary_search_1;

import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(10);
        binarySearch_1(10, list);
    }

    public static int binarySearch_1(int num, ArrayList<Integer> list) {
        int low = 0;   // инициализируем низший индекс
        int high = list.size() - 1;       //высший индекс
        int mid = 0;      // средний инекс

        while (low <= high) {
            mid = (low + high) / 2;

            if( list.get(mid) < num) {
                low = mid + 1;
            } else if (list.get(mid) > num) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
