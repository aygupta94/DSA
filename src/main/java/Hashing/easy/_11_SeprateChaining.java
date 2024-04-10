package Hashing.easy;

import java.util.ArrayList;

public class _11_SeprateChaining {

  public static void main(String[] args) {
    int arr[] = {92, 4, 14, 24, 44, 91};
    int hashSize = 10;
    int n = 6;

    ArrayList<ArrayList<Integer>> res = separateChaining(arr, n, hashSize);

    for (int i = 0; i < res.size(); i++) {
      if (res.get(i).size() > 0) {
        System.out.print(i + "->");
        for (int j = 0; j < res.get(i).size() - 1; j++) {
          System.out.print(res.get(i).get(j) + "->");
        }
        System.out.print(res.get(i).get(res.get(i).size() - 1));
        System.out.println();
      }
    }
  }

  public static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize) {

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    for (int x : arr) {
      int index = x % hashSize;

      if (index < ans.size() && ans.get(index) == null) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        ans.add(index, list);
      } else if (index < ans.size() && ans.get(index) != null) {
        ArrayList<Integer> list = ans.get(index);
        list.add(x);
        ans.set(index, list);
      } else {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        for (int i = ans.size(); i < index; i++) {
          ans.add(new ArrayList<>());
        }
        ans.add(list);
      }
    }
    return ans;
  }

}
