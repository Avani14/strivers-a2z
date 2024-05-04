public class ReverseNumber {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        System.out.println(reverseNumber.reverse(-123));
    }
    public int reverse(int x) {
        int temp;
        long reverseNum = 0;
        while(x!=0){
            temp = x%10;
            reverseNum = reverseNum * 10 + temp;
            x = x /10;
        }
        if(reverseNum<Integer.MIN_VALUE || reverseNum > Integer.MAX_VALUE){
            return 0;
        }
        return (int)reverseNum;
    }
}
