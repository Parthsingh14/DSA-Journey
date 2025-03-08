import java.util.Scanner;

public class sumofNnum {

    public static int sum(int x){
        if(x == 1 ){
            return 1;
        }
        int SNm1 = sum(x-1);
        int S = SNm1 + x;
        return S; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The sum of "+num+" natural number is "+sum(num));
        sc.close();
    }
}
