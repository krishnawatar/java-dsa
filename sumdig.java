import java.util.*;
public class sumdig {
    public static void sumdigit(int n){
        int variablesum=0;
        while(n>0){
        int lastdigit=n%10;
        variablesum+=lastdigit;
        n=n/10;
    }
    System.out.println(variablesum);
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sumdigit(sc.nextInt());
        sc.close(); 
    }
}
