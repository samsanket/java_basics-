package notes.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FiltersTest {
    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,3,4,5,6,7,8,9,0,11,12,13,14,15,55,51);
       Long count= arr.stream().filter(n->n%2==0).count();
       System.out.println(count);


        System.out.println("*************");


        arr.stream().filter(n->n%2==0).toList()
                .forEach(System.out::println);

        System.out.println("*************");

        arr.stream().filter(n->n%2==0).toList()
                .forEach(System.out::println);


    }
}
