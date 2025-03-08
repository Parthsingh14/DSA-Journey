public class factorial {

    public static int fact(int x){
        if(x == 1){
            return 1;
        }
        if(x == 0){
            return 1;
        }

        return x * fact(x-1);
    }

    public static void main(String[] args) {
        System.out.println("Factorial of a certain number is: "+ fact(10));
    }
}
