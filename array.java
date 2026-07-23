public class array {
    public static int linear(String[] number, String key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;

    }
    public static void main(String[] args) {
        String[] number={"samosa","idli","dosa"};
        String key="idli";
        int index=linear(number, key);
        if(index==(-1)){
            System.out.print("no");
        }
        else{
            System.out.print("String is at index=  "+index);
        }
    }
    
}
  