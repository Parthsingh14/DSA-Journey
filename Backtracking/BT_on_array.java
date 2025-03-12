public class BT_on_array {
    
    public static void perform_operation(int arr[],int index, int value){
        if(index == arr.length){
            return;
        }
        arr[index] = value;
        perform_operation(arr,index+1,value+1); //Recursion
        arr[index] = value - 2; //backtracking  operation
    }


    public static void main(String[] args) {
        int arr[] = new int[5];
        perform_operation(arr,0,1);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
