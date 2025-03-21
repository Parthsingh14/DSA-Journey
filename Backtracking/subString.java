public class subString {
    public static void findSubString(String str,String ans,int i){
        // baseCase
        if(i == str.length()){
            if (ans.length()==0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }

        // Yes Case
        findSubString(str, ans+str.charAt(i), i+1);

        // No Case
        findSubString(str, ans, i+1);
    }
    public static void main(String[] args) {
        String str = "abc";
        findSubString(str,"",0);
    }
}
