package Hashing.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class _1_UnionAndIntersection_Of_2_Arrays {

    public static void main(String[] args) {

        int arr[] = {15, 20, 5, 15};
        int arr2[] = {15, 15, 15, 20, 10};

        int res[] = union(arr, arr2);

        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(intersection(arr, arr2)));
    }

    static int[] union(int arr[], int arr2[]) {

        //Solution 1
        //        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        //        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(arr2).boxed().collect(Collectors.toList()));
        //
        //        set1.addAll(set2);
        //
        //        return set1.stream().mapToInt(Integer::intValue).toArray();

        HashSet<Integer> res = new HashSet<>();
        for (int i : arr) {
            res.add(i);
        }
        for (int j : arr2) {
            res.add(j);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    static int[] intersection(int arr[], int arr2[]) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        HashSet<Integer> set2 = new HashSet<>(Arrays.stream(arr2).boxed().collect(Collectors.toList()));

        set1.retainAll(set2);

        return set1.stream().mapToInt(Integer::intValue).toArray();

    }

}
