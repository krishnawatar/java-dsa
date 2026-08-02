public class reverse {
    public static void reversenumber(int n[]){
        int first=0;
        int last=n.length-1;
        while(first<last){
        int temp= n[last];
        n[last]=n[first];
        n[first]=temp;
        first++;
        last--;
        }
    }
    public static void main(String[] args) {
        int number[]={2,4,6,8,10};
        reversenumber(number);
        for(int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
