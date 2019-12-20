public class ReverseInteger {
    public static int reverse(int x) {
        int k=0;
        while(x!=0){
            int pop = x%10;
            x/=10;
            if(k > Integer.MAX_VALUE/10 || ( k == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if(k < Integer.MIN_VALUE/10 || ( k == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            k=k*10+pop;
        }
        return k;
    }
}
