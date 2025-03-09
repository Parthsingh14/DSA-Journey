public class fibonacci {

    //takes O(2^n) time complexity, use DP to minimize the complexity.

    public static int fib(int x){
        if(x == 1 || x == 0) { return x; }

        return fib(x-1) + fib(x-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
