package BitManipulation;

public class Sum_of_Two_Integers {
    public int getSum(int a, int b) {
        int curr = a ^ b;
        int carry = (a & b) << 1;
        if(carry != 0){
            return getSum(curr, carry);
        }
        return curr;
    }
}
