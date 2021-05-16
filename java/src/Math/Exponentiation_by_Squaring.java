package Math;

public class Exponentiation_by_Squaring {
    public double myPow(double x, int n) {
        long t = (long) n;
        double ans = 1.0;
        if(t < 0) t = -t;
        while(t > 0){
            if((t&0x1L) == 1){
                ans *= x;
            }
            x *= x;
            t >>= 1;
        }
        if(n < 0) return 1/ans;
        return ans;
    }
}
