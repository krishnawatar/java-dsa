public class practice {
    public static void averageofnumber(int a,int b,int c){
        int average=(a+b+c)/3;
        System.out.println( "average is= "+average);
    }
    public static boolean iseven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void palindrome(int n){
        int original=n;
        int reverse=0;
        while(n>0){
            int lastdigit=n%10;
            reverse=reverse*10+lastdigit;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println(" not a palindrome");
        }
    }
    
    public static void main(String[] args) {
        averageofnumber(10,20,30);
        System.out.println(iseven(20));
        palindrome(121);
    }
}
