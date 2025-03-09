public class firstOccurence {


    public static int First_Occurance(int arr[],int index,int key){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == key){
            return index;
        }

        return First_Occurance(arr, index+1, key);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int ans = First_Occurance(arr,0,5);
        if (ans == -1) {
            System.out.println("No Element is found");
        } else{
            System.out.println("Element found at index: "+ans);
        }
    }
}
