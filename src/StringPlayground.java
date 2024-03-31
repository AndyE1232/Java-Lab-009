/**
 *
 * @author Trevor Hartman
 * @author Andrew Escarcega
 *
 * @since 03/30/24
 *
 */

public class StringPlayground {

    public static int parenthesesCount(String s){
        //String s = "((3 + 7) * 2)";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') { count++; }
            else if (c == ')') { count--; }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "((3 + 7) * 2)";
        System.out.println(parenthesesCount(s));
        String s2 = "(((3 + 7) * 2)";
        System.out.println(parenthesesCount(s2));
        String s3 = "((3 + 7) * 2))";
        System.out.println(parenthesesCount(s3));
    }
}