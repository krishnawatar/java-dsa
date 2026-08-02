public class practice1 {
    public static int practicebinary(int n[],int key){
       int start=0;
       int end=n.length-1;
       
       while(start<=end){
        int mid=(start+end)/2;
        if(n[mid]==key){
            return mid;
        }
            if(n[mid]<key){
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
        int key=10;
        System.out.print("index of key is= "+practicebinary(number, key));        
    }
    
}
