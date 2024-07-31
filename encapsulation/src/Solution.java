public class Solution {
    public static void main(String[] args) {
Fraction x = new Fraction(1,3);
Fraction y = new Fraction(2,5);
Fraction z = new Fraction(6,8);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x.sum(y).minus(z));
    }
}
