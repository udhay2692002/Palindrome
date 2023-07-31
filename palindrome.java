public class palindrome {

    public static void main(String[] args) {
        String a = "MALAYALAM";
        int len = a.length();
        boolean flag = true;

        for (int i = 0; i < len / 2; i++) {
            if (a.charAt(i) != a.charAt(len - 1 - i)) {
                flag = false;
                break; // No need to continue checking, we already know it's not a palindrome.
            }
        }

        if (flag) {
            System.out.println("THE GIVEN STRING IS PALINDROME");
        } else {
            System.out.println("THE GIVEN STRING IS NOT PALINDROME");
        }
    }
}
