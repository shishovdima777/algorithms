package breadth_search_6;
import java.util.*;

public class BreadthSearch {
    public static void main(String[] args) {
        graph.put("you", Arrays.asList("Carl", "Bob", "Tasha"));
        graph.put("Carl", Arrays.asList("Claire", "Steve"));
        graph.put("Bob", Arrays.asList("Vlad", "Valery"));
        graph.put("Tasha", Arrays.asList("Sam"));
        graph.put("Jake", Collections.emptyList());
        graph.put("Vlad", Collections.emptyList());
        graph.put("Valery", Collections.emptyList());
        graph.put("Claire", Collections.emptyList());
        graph.put("Steve", Collections.emptyList());

        search("you");

    }
    private static Map<String, List<String>> graph = new HashMap<>();

    private static boolean checkPerson(String name) {
        return name.endsWith("m");
    }

    private static boolean search(String name) {
        Queue<String> searchQueue = new PriorityQueue<>(graph.get((name)));
        List<String> searchedPpl = new ArrayList<>();

        while (!searchQueue.isEmpty()) {
            String person = searchQueue.poll();
                if(!searchedPpl.contains(person)) {
                    if(checkPerson(person)) {
                        System.out.println(person + " is Mafia");
                        return true;
                    } else {
                        searchQueue.addAll(graph.get(person));
                        searchedPpl.add(person);
                    }
                }
        }
        return false;

    }



}



