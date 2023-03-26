package practiceproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayListGrouping {

    public static void main(String[] args) {
        // TODO Auto-generated method stub


        List<String> lst = new ArrayList<>();
        lst.add("Divya");
        lst.add("Divya");
        lst.add("Divya");
        lst.add("Anumanthu");
        lst.add("Nandini");
        lst.add("Nandini");
        lst.add("Neha");
        lst.add("Neha");
        lst.add("Neha");
        lst.add("Divya");
        lst.add("Ram");
        lst.add("Ram");


        Predicate<String> p = s -> s.length() > 4;

        Map<String, Long> mp = lst.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Set<String> st = mp.keySet();

        for (String s : st) {
            String key = s.toString();
            System.out.println(key + " " + mp.get(key));
        }


        Map<String, List<String>> mp1 = lst.stream().collect(Collectors.groupingBy(Function.identity()));

        System.out.println(mp1);


        Map<Boolean, List<String>> mp2 = lst.stream().collect(Collectors.partitioningBy(p));

        System.out.println(mp2);


    }


}
