package problemsolving;

import java.util.HashMap;


public class FirstNonRepeatingChar {

    public static char firstNonRepeating(String input) {
if (input==null || input.equals(null) || input.length()<1){
    throw new RuntimeException("Invalid input1");
}
        HashMap<Character,Integer> seen = new HashMap<>();
        for(char c : input.toCharArray()){
          seen.put(c,seen.getOrDefault(c,0)+1);
        }

        for(char c : input.toCharArray()){
           if (seen.get(c) <=1){
               return c;
           }
        }

        return '\0';
    }

    public static void main(String[] args) {

        test("swiss", 'w');

        test("aabbcde", 'c');

        test("aabbcc", '\0');

        test("leetcode", 'l');

        test("aabbccd", 'd');

        test("z", 'z');

        test("", '\0');

        test("aabbba", '\0');
    }

    private static void test(String input, char expected) {

        try {

            char actual = firstNonRepeating(input);

            System.out.println(
                "Input    : " + input
            );

            System.out.println(
                "Expected : " +
                (expected == '\0' ? "NONE" : expected)
            );

            System.out.println(
                "Actual   : " +
                (actual == '\0' ? "NONE" : actual)
            );

            System.out.println(
                actual == expected ? "PASS" : "FAIL"
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