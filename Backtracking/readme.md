## Explanation of BT_on_array.java

The `BT_on_array` class demonstrates a simple backtracking algorithm on an array. The main method initializes an array of size 5 and calls the `perform_operation` method to fill the array using recursion and backtracking.

### Step-by-Step Explanation

1. **Initialization**:
    ```java
    int arr[] = new int[5];
    ```
    An array `arr` of size 5 is initialized with default values (0).

2. **Perform Operation**:
    ```java
    perform_operation(arr, 0, 1);
    ```
    The `perform_operation` method is called with the array, starting index 0, and initial value 1.

3. **Recursive Function**:
    ```java
    public static void perform_operation(int arr[], int index, int value) {
        if (index == arr.length) {
            return;
        }
        arr[index] = value;
        perform_operation(arr, index + 1, value + 1); // Recursion
        arr[index] = value - 2; // Backtracking operation
    }
    ```
    - **Base Case**: If the index is equal to the length of the array, the function returns.
    - **Set Value**: The current index of the array is set to the current value.
    - **Recursive Call**: The function calls itself with the next index and the next value.
    - **Backtracking**: After the recursive call, the current index of the array is set to `value - 2`.

4. **Print Array**:
    ```java
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    ```
    The array is printed to the console.

### Example

Let's go through an example to understand the process:

- Initial call: `perform_operation(arr, 0, 1)`
    - `arr[0] = 1`
    - Recursive call: `perform_operation(arr, 1, 2)`
        - `arr[1] = 2`
        - Recursive call: `perform_operation(arr, 2, 3)`
            - `arr[2] = 3`
            - Recursive call: `perform_operation(arr, 3, 4)`
                - `arr[3] = 4`
                - Recursive call: `perform_operation(arr, 4, 5)`
                    - `arr[4] = 5`
                    - Recursive call: `perform_operation(arr, 5, 6)` (base case reached, return)
                - Backtracking: `arr[4] = 3`
            - Backtracking: `arr[3] = 2`
        - Backtracking: `arr[2] = 1`
    - Backtracking: `arr[1] = 0`

Final array: `[1, 0, 1, 2, 3]`
