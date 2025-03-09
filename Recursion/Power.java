public class Power {

    //O(n)
    public static int calc_power(int number, int power){
        if(power == 0){
            return 1;
        }
        return number * calc_power(number, power-1);
    }

    //O(log n)
    public static int OptimizedPower(int number, int power){
        if (power == 0) {
            return 1;
        }
        int halfpower = OptimizedPower(number, power/2);
        if(power % 2 == 0){
            return halfpower * halfpower;
        } else {
            return number * halfpower * halfpower;
        }
    }


    public static void main(String[] args) {
        System.out.println(calc_power(2,10));
        System.out.println(OptimizedPower(2,10));
    }
}
