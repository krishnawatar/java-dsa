public class maxsubarraysum {
    public static void printsubarraysum(int num[]){
        int curr=0;
        int maxsum=Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
        int start=i;
        for(int j=i;j<num.length;j++){
            int end=j;
            curr=0;
            for(int k=start;k<=end;k++){
                curr+=num[k];
            }
            System.out.println(curr);
                if(maxsum<curr){
                    maxsum=curr;
                }
        }
    }
    System.out.println("max sum= "+maxsum);
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        printsubarraysum(number);

    }
}
