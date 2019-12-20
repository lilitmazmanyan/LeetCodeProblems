public class isPalindrome {
    public static boolean isPalindrome(int num){
        if(num<0) return false;
        if(num%10==num) return true;
        int reversenum = 0;
        int length = (int) (Math.log10(num));
        for(int i = 0; i<= length/2; i++){
            reversenum*=10;
            reversenum+=num%10;
            num=num/10;
        }
        int lengthleft = (int) (Math.log10(num));
        int lengthrigth = (int) (Math.log10(reversenum));
        if(lengthleft!=lengthrigth){
            reversenum/=10;
        }
        for(int i = lengthleft; i>=0; i--){
            if(num%10 != reversenum%10) return false;
            num/=10;
            reversenum/=10;
        }

        if(num==reversenum && num ==0)
            return true;
        return false;
    }

}
