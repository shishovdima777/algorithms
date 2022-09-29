import java.util.*;

public class Main {
    public static void main(String[] args) {


        // хэш таблицы

        HashMap<String, Long> phoneBook = new HashMap<>();
        phoneBook.put("Dima", 89872678219L);
        phoneBook.put("Mama", 88556335939L);
        phoneBook.put("Valeriya", 89712283758L);


        pepa(Arrays.asList(5, 5));




    }





    private static int countElems(List list, int n) {
        if (n<=0) {
            return 0;
        } else {
            return  countElems(list, n-1) + list.size()-1;
        }
    }

    private static int firstFunc(String str) {
        return 1;
    }


    private static void pepa(List list) {
        while (!list.isEmpty()) {
            for (int i = 0; i<3; i++) {
                System.out.println(i);
            }
        }
    }





}
