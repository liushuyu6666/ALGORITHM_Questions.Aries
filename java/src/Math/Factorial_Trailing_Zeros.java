package Math;

public class Factorial_Trailing_Zeros {
    public int trailingZeroes(int n) {
        int divide = 5, cnt = 0;
        while(n >= divide){
            cnt += n / divide;
            divide = divide * 5;
        }
        return cnt;
    }
}
