public class practice1 {
    public static void practicebinary(int num[]){
       int curr=0;
       int maxsum=Integer.MIN_VALUE;
       int prefix[]=new int[num.length];
       prefix[0]=num[0];
       for(int i=1;i<prefix.length;i++){
        prefix[i]=prefix[i-1]+num[i];
       }
       for(int i=1;i<num.length;i++){
        int start=0;
        for(int j=i;j<num.length;j++){
            int end=j;
            curr=start==0?prefix[end]:prefix[end]-prefix[start-1];
            if(maxsum<curr){
                maxsum=curr;
            }
        }
    }
    System.out.println(maxsum);
    
       }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};    
                practicebinary(number); 
    }
    
}
