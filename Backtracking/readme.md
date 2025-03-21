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

## Explanation of subString.java

The `subString` class generates all possible substrings of a given string using recursion and backtracking. It explores two choices at each step: including or excluding the current character.

### Step-by-Step Explanation

1. **Base Case**:
    ```java
    if (i == str.length()) {
        if (ans.length() == 0) {
            System.out.println("null");
        }
        System.out.println(ans);
        return;
    }
    ```
    - If the current index `i` equals the length of the string, the recursion stops.
    - If the accumulated substring `ans` is empty, "null" is printed.
    - Otherwise, the accumulated substring is printed.

2. **Recursive Cases**:
    - **Include Current Character**:
        ```java
        findSubString(str, ans + str.charAt(i), i + 1);
        ```
        The current character is added to `ans`, and the function is called recursively with the next index.

    - **Exclude Current Character**:
        ```java
        findSubString(str, ans, i + 1);
        ```
        The current character is excluded, and the function is called recursively with the next index.

3. **Main Method**:
    ```java
    String str = "abc";
    findSubString(str, "", 0);
    ```
    - The input string is initialized as `"abc"`.
    - The `findSubString` method is called with the string, an empty substring, and the starting index `0`.

### Example

For the input string `"abc"`, the function generates the following substrings:

1. Include `'a'`, `'b'`, `'c'`: `"abc"`
2. Include `'a'`, `'b'`: `"ab"`
3. Include `'a'`, exclude `'b'`, include `'c'`: `"ac"`
4. Include `'a'`, exclude `'b'`, exclude `'c'`: `"a"`
5. Exclude `'a'`, include `'b'`, `'c'`: `"bc"`
6. Exclude `'a'`, include `'b'`: `"b"`
7. Exclude `'a'`, exclude `'b'`, include `'c'`: `"c"`
8. Exclude all characters: `"null"`

Output:
```
abc
ab
ac
a
bc
b
c
null
