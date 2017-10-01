public class Palindrome {
    public static void main(String[] args) {
        String s = "wow1 a 1wow";
        System.out.println(isPalindrome(s));
        }

    private static boolean isPalindrome(String s) {
        StringBuilder stringReverse = new StringBuilder(s).reverse();
        System.out.println(s);
        System.out.println(stringReverse);
        return stringReverse.toString().equals(s);
    }
}
