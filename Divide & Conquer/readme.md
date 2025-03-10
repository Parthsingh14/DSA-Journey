# Merge Sort Algorithm

Merge Sort is a Divide and Conquer algorithm. It divides the input array into two halves, calls itself for the two halves, and then merges the two sorted halves. The `merge()` function is used for merging two halves. The `merge(arr, l, m, r)` is a key process that assumes that `arr[l..m]` and `arr[m+1..r]` are sorted and merges the two sorted sub-arrays into one.

## Steps of Merge Sort:
1. **Divide**: Divide the array into two halves.
2. **Conquer**: Recursively sort the two halves.
3. **Combine**: Merge the two sorted halves.

## Example:
Consider the array: `[12, 11, 13, 5, 6, 7]`

1. **Divide**: Split the array into two halves: `[12, 11, 13]` and `[5, 6, 7]`
2. **Conquer**: Recursively split and sort the halves:
    - `[12, 11, 13]` -> `[12]`, `[11, 13]` -> `[11]`, `[13]` -> merge to `[11, 13]` -> merge to `[11, 12, 13]`
    - `[5, 6, 7]` -> `[5]`, `[6, 7]` -> `[6]`, `[7]` -> merge to `[6, 7]` -> merge to `[5, 6, 7]`
3. **Combine**: Merge the sorted halves `[11, 12, 13]` and `[5, 6, 7]` to get the final sorted array `[5, 6, 7, 11, 12, 13]`

## Code Explanation:
The following Java code implements the Merge Sort algorithm:

```java
public class mergeSort {
    public static void merge_sort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        merge_sort(arr, si, mid);
        merge_sort(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si, j = mid + 1, k = 0;
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[si + l] = temp[l];
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        merge_sort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
```

In this code:
- `merge_sort` function recursively divides the array and sorts the halves.
- `merge` function merges the sorted halves.
- `main` function demonstrates the sorting of an example array.
