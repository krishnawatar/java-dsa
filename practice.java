import java.util.*;
public class practice {
    public static int binary(int num[],int target ){
       int start=0;
        int end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==target){
                return mid;
            }
            if(num[mid]<target){
                 start=mid+1;
                
            }
            else{
               end=mid-1;
                
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int number[]={2,4,6,8,10,12,14};
        int target=10;
        System.out.print(binary(number, target));
    }
}
