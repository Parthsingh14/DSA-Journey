public class removeDuplicate {

    public static void remove_duplicates(String str, int index, StringBuilder newStr, boolean arr[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar != ' ' && arr[currChar - 'a'] == true) {
            remove_duplicates(str, index + 1, newStr, arr);
        } else if (currChar != ' ') {
            arr[currChar - 'a'] = true;
            remove_duplicates(str, index + 1, newStr.append(currChar), arr);
        } else {
            remove_duplicates(str, index + 1, newStr, arr);
        }
    }

    public static void main(String[] args) {
        String str = "Parth Singh".toLowerCase().replace(" ", "");
        remove_duplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}