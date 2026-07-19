public class Prime {
    public static boolean isPrime(int n) { // Number to check for primality

        if (n == 2) {
            return true;
        }
        for(int i=2;i<=Math.sqrt(i);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
        }
        // public static void primesinrange(int n){
        //     for(int i=2;i<=n;i++){
        //         if(isPrime(i)){
        //             System.out.print(i+" ");
        //         }
        //     }
        //     System.out.println();
        // }
        public static void main(String args[]){
            // primesinrange(100);
            System.out.println(isPrime(25));
        } 
}
