package notes.streams.filter;


import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
Find duplicate values from a list

Given:

List<String> names = List.of(
    "John",
    "Alice",
    "Bob",
    "Alice",
    "David",
    "John",
    "John"
);

Find names that appear more than once.

Expected:

Alice
John
 */
public class DuplicatesInList {
    public static void main(String[] args) {

        List<String> names = List.of(
                "John",
                "Alice",
                "Bob",
                "Alice",
                "David",
                "John",
                "John"
        );


        Set<String> list = names.stream().filter(
                n -> Collections.frequency(names, n) > 1
        ).collect(Collectors.toSet());

        System.out.println(list);
    }
}
