package problemsolving;

import java.util.Arrays;

public class MoveZero {

    public static void moveZerosToEnd(int[] nums) {

                // 0 1 0 3 12
                // 1 3 12 0 0

        int k=nums.length-1;
        for( int i =0;i<nums.length ;i++){
            if (nums[i]==0){
                nums[i]=nums[k];
                nums[k]=0;
                k--;
                if (i>=k){
                     break;
                }
            }

        }

            System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        test(
                new int[]{0, 1, 0, 3, 12},
                new int[]{1, 3, 12, 0, 0}
        );

//        test(
//                new int[]{1, 2, 3},
//                new int[]{1, 2, 3}
//        );
//
//        test(
//                new int[]{0, 0, 1},
//                new int[]{1, 0, 0}
//        );
//
//        test(
//                new int[]{1, 0, 0, 2, 0, 3},
//                new int[]{1, 2, 3, 0, 0, 0}
//        );
//
//        test(
//                new int[]{0, 0, 0},
//                new int[]{0, 0, 0}
//        );
//
//        test(
//                new int[]{-1, 0, -5, 0, 10},
//                new int[]{-1, -5, 10, 0, 0}
//        );
    }

    private static void test(int[] input, int[] expected) {

        try {

            moveZerosToEnd(input);

            boolean passed = Arrays.equals(input, expected);

            System.out.println(
                    "Input    : " + Arrays.toString(input)
            );

            System.out.println(
                    "Expected : " + Arrays.toString(expected)
            );

            System.out.println(
                    passed ? "PASS ✅" : "FAIL ❌"
            );

            System.out.println("----------------------");

        } catch (Exception e) {

            System.out.println(
                    "Exception: " + e.getMessage()
            );

            System.out.println("----------------------");
        }
    }
}
