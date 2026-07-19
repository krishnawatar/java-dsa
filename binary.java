public class binary { 
    public static void bintodec(int binnum){
        int start=binnum;
        int pow=0;
        int decnum=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
             pow++;
             binnum=binnum/10; 
        }
        System.out.println(("decimal of  "+ start+" = "+decnum));
    }
    public static void main(String[] args) {
       bintodec(110);
}
}
