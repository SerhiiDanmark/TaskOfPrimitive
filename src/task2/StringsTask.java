package task2;

import java.util.*;
import java.util.stream.Collectors;

public class StringsTask {

    public static void main(String[] args) {
        String str = "HHUUUWWAFFSSS";

        String[] line = str.split("");

        Set<String> lineStrings = getList(line);

        lineStrings.stream().forEach(System.out::println);
        System.out.println("------------------");

        String result = "";

        for (String elem : lineStrings) {
            List<String> stringList = Arrays.stream(line).filter(e -> elem.equals(e)).collect(Collectors.toList());
            result += elem + stringList.size();
            System.out.println(stringList);
        }

        System.out.println(result);


    }
    private static Set<String> getList(String[] arr) {
        Set<String> list = new TreeSet<>();

        for (String  elem : arr) {
            list.add(elem);
        }

        return list;
    }
}