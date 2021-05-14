package task1;

import java.util.*;

public class TaskNumber {
    public static void main(String[] args) {

//        int[] arr1 = {1, 3, 5, 9, 4, 11, 2};
//        int[] arr2 = {3, 6, 9, 23, 1, 2, 3 };
//
//        List<Integer> ar1 = getList(arr1);
//        List<Integer> ar2 = getList(arr2);
//
//        List<Integer> resultList = new ArrayList<>();
//
//        for (int elem : ar1) {
//            if(ar2.contains(elem)){
//                resultList.add(elem);
//            }
//        }
//
//        resultList.stream().forEach(System.out::println);
//        System.out.println("-------------------");
//        resultList.stream().sorted().forEach(System.out::println);
//    }
//
//    private static List<Integer> getList(int[] arr){
//        List<Integer> integerList = new ArrayList<>();
//        for (int elem : arr) {
//            integerList.add(elem);
//        }
//        return integerList;

            int[] arr1 = {1, 2, 6, 8, 9, 2};
            int[] arr2 = {1, 3, 78, 4, 7, 2};


            Set<Integer> list1 = getList(arr1);
            Set<Integer> list2 = getList(arr2);

            List<Integer> resultList = new ArrayList<>();

            for (int elem : list1) {
                if (list2.contains(elem)) {
                    long count1 = Arrays.stream(arr1).filter(e -> e == elem).count();
                    long count2 = Arrays.stream(arr2).filter(e -> e == elem).count();

                    System.out.println(count1 + " " + count2);

                    long min = Math.min(count1, count2);

                    for (int i = 0; i < min; i++) {
                        resultList.add(elem);
                    }
                }
            }
            System.out.println(resultList);
        }

        private static Set<Integer> getList(int[] arr) {
            Set<Integer> list = new HashSet<>();

            for (int elem : arr) {
                list.add(elem);
            }

            return list;
        }
    }
