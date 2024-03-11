package Hashing.easy;

import java.util.Arrays;

public class _10_LinearProbing {

  public static void main(String[] args) {
    int arr[] = {9,99,999,9999};
    int []ans = linearProbing(10, arr, 4);

    System.out.println(Arrays.toString(ans));
  }

  static int[] linearProbing(int hashSize, int arr[], int n)
  {

    int[] hashTable = new int[hashSize];
    Arrays.fill(hashTable, -1);
    //Your code here
    for (int i = 0; i < n; i++) {
      int key = arr[i];
      int index = key % hashSize; // Calculate initial index
      int originalIndex = index;
      if(hashTable[index] == -1) {
        hashTable[index] = key;
      } else {
        // Linear probing to find an empty slot
        while (hashTable[index] != -1 && hashTable[index] != key) {
          index = (index + 1) % hashSize; // Move to the next slot
          if(index == originalIndex)
            break;
        }

        // Insert the element at the found index (skip if already present or no space)
        if (hashTable[index] == -1) {
          hashTable[index] = key;
        }
      }


    }

    return hashTable;
  }

}
