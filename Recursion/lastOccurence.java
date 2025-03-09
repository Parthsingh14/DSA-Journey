public class lastOccurence {


    public static int last_Occurance(int arr[],int index,int key){
        if(index == -1){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }

        return last_Occurance(arr, index-1, key);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,5,10};
        int ans = last_Occurance(arr,arr.length-1,5);
        if (ans == -1) {
            System.out.println("No Element is found");
        } else{
            System.out.println("Element found at index: "+ans);
        }
    }
}
