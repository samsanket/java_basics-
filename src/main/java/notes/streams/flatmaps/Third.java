package notes.streams.flatmaps;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Third {

    public static void main(String[] args) {

        Product laptop = new Product(1, "Laptop");
        Product mouse = new Product(2, "Mouse");
        Product keyboard = new Product(3, "Keyboard");
        Product monitor = new Product(4, "Monitor");

        Order order1 = new Order(
                1001,
                List.of(laptop, mouse)
        );

        Order order2 = new Order(
                1002,
                List.of(keyboard, mouse)
        );

        Order order3 = new Order(
                1003,
                List.of(laptop, monitor)
        );

        Customer john = new Customer(
                101,
                "John",
                List.of(order1, order2)
        );

        Customer alice = new Customer(
                102,
                "Alice",
                List.of(order3)
        );



        List<Customer> customers = List.of(john, alice);
        //Find all unique products purchased by all customers.


        Set<Product> collect = customers.stream()
                .flatMap(o -> o.getOrders().stream())
                .flatMap(p -> p.getProducts().stream()).collect(Collectors.toSet());

    }
}
