package recursion_3;

import java.util.*;

public class FindNum {
    public static int persistence(long n) {
        if (n<10) {
            System.out.println(n);
            return (int)n;
        } else {
            String str = String.valueOf(n);
            List<String> strList = new ArrayList<>(Arrays.asList(str.split("")));
            List<Integer> intList = new ArrayList<>();
            for (String elem: strList) {
                intList.add(Integer.parseInt(elem));
            }
            long result = intList.get(0);
            for (int i = 1; i<intList.size(); i++) {
                result = result * intList.get(i);
            }
            return persistence(result);
        }
    }
}
