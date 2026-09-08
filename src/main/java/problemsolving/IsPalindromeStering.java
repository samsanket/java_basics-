package problemsolving;

import java.util.Arrays;
import java.util.Locale;

public class IsPalindromeStering {

    public static boolean isPalindrome(String input) {
        if (input == null){
            return false;
        }

        char[] in=input.strip().toLowerCase(Locale.ROOT).replaceAll("[^a-zA-Z0-9]", "").toCharArray();
        int k = in.length-1;

        System.out.println(Arrays.toString(in));

        for (char c : in) {
            if (c == ' ') {
                continue;
            }
            if (c != in[k]) {
                return false;
            }
            k--;
        }

        return true;
    }

    public static void main(String[] args) {

        test(
            "A man, a plan, a canal: Panama",
            true
        );

        test(
            "race a car",
            false
        );

        test(
            "Was it a car or a cat I saw?",
            true
        );

        test(
            "hello",
            false
        );

        test(
            "12321",
            true
        );

        test(
            "12345",
            false
        );

        test(
            "",
            true
        );

        test(
            "a",
            true
        );

        test(
            ".,!@#",
            true
        );
    }

    private static void test(
            String input,
            boolean expected) {

        try {

            boolean actual = isPalindrome(input);

            System.out.println(
                "Input    : " + input
            );

            System.out.println(
                "Expected : " + expected
            );

            System.out.println(
                "Actual   : " + actual
            );

            System.out.println(
                actual == expected
                    ? "PASS ✅"
                    : "FAIL ❌"
            );

            System.out.println("--------------------");

        } catch (Exception e) {

            System.out.println(
                "Exception: " + e.getMessage()
            );

            System.out.println("--------------------");
        }
    }
}