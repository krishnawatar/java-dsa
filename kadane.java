public class kadane {
    public static void kadane(int num[]){
        int cs=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            cs=cs+num[i];
            if(cs<0){
                cs=0;
            }
            max=Math.max(max, cs);
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        int numbert[]={-2,-3,4,-1,-2,1,5,-3};
        kadane(numbert);
    }
    
}
