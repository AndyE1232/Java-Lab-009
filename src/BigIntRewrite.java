/**
 *
 * @author Trevor Hartman
 * @author Andrew Escarcega
 *
 * @since 03/30/24
 *
 */

import java.math.BigInteger;
public class BigIntRewrite {

    public static BigInteger pow(int x, int n) {
        if (n == 0) return BigInteger.valueOf(1);
        // find x to the n/2 recursively
        BigInteger t = pow(x, n / 2);
        // if n is even, the result is t squared
        // if n is odd, the result is t squared times x
        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        BigInteger c = pow(a, b);
        System.out.println(c);
//I'm not sure why but it highlights BigInteger, multiply and println in red saying there are errors but it works fine
    }
}
