package BitManipulation;

public class Bit {

    public static void main(String args[]){

        // arithmetic shift(>>) and logical shift(>>>)
        System.out.println(-4>>1);
        System.out.println(-4>>>1);
        System.out.println(-4>>1);
        int ans = -4;
        for(int i = 0; i < 10; i++){
            ans <<= 1;
            System.out.println(ans);
        }
        // no <<<
        System.out.println(Integer.toBinaryString(-4>>1));
        System.out.println(Integer.toBinaryString(-4>>>1));

        // bit wise and
        System.out.println(4 & 5); // 100 & 101

        // bit wise or
        System.out.println(4 | 5); // 100 | 101

        // bit wise XOR
        System.out.println(4 ^ 5); // 100 ^ 101 = 001

        // bit wise XNOR
        System.out.println(~(4 ^ 5)); // ~(100 ^ 101) = 110
        // bit wise not
        System.out.println(~4); // 100 => 011

        // bit with long
        long tar = 10;
        System.out.println(10 & (0x1L));


    }

}
