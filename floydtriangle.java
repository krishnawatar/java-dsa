public class floydtriangle {
    public static void flyd(int n){
        int counter=1;
    for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
            System.out.print(counter);
            System.out.print(" ");
            counter++;
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        flyd(5);
    }
    
}
