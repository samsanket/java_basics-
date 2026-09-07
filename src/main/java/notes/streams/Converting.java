package notes.streams;

import java.util.Arrays;

public class Converting {

    public static void main(String[] args) {


        int [] array_int = {1,2,3,4,5,6,1234567891,8};

        Integer[] array_Integer = {1,2,3,4,5,6,7,8,9,1324657981};


        Arrays.stream(array_int).forEach(System.out::println);


        Arrays.stream(array_Integer).forEach(System.out::println);
    }
}
