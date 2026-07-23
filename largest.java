public class largest {
    public static int largestinarray(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            if(largest<number[i]){
                largest=number[i];
                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[]={1,4,6,7,8,9};
        System.out.println("largest is= "+largestinarray(arr));
    }
}
