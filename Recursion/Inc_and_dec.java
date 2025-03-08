public class Inc_and_dec {

    //print 1 to n in increasing order
    public static void inc_order(int x){
        if(x == 1){
            System.out.print(x+" ");
            return;
        }
        inc_order(x-1);
        System.out.print(x+" ");       
    }

    //print n to 1 in decreasing order
    public static void dec_order(int x){
        if (x==1) {
            System.out.print(x+" ");
            return;
        }
        System.out.print(x+" ");
        dec_order(x-1);
    }

    public static void main(String[] args) {
        inc_order(10);
        System.out.println();
        dec_order(20);
    }
}
