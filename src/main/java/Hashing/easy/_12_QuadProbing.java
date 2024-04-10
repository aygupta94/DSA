package Hashing.easy;

import java.util.Arrays;

public class _12_QuadProbing {

  public static void main(String[] args) {
    int hashSize = 11;
    int N = 4;
    int arr[] = {21,10,32,43,21};
    int[] hashTable = new int[hashSize];
    quadraticProbing(hashTable, hashSize, arr, N);
    System.out.println(Arrays.toString(hashTable));
  }

  static void quadraticProbing(int[] hash, int hash_size, int arr[], int N)
  {
    //Your code here
    Arrays.fill(hash, -1);

    for(int x: arr) {
      int index = x%hash_size;
      if(hash[index] == -1 && hash[index] != x)
      {
        hash[index] = x;
      } else {
        int prob_element = 0;
        while(hash[index] !=-1 && hash[index] != x) {
          prob_element +=1;
          index = (x + (int) Math.pow(prob_element, 2))%hash_size;
        }
        hash[index] = x;
      }
    }
  }

}
