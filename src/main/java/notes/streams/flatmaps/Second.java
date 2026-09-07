package notes.streams.flatmaps;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Second {

    public static void main(String[] args) {
        Product laptop = new Product(1, "Laptop");
        Product mouse = new Product(2, "Mouse");
        Product keyboard = new Product(3, "Keyboard");
        Product monitor = new Product(4, "Monitor");

        List<Order> orders = List.of(

                new Order(
                        1001,
                        List.of(laptop, mouse)
                ),

                new Order(
                        1002,
                        List.of(keyboard, mouse, monitor)
                ),

                new Order(
                        1003,
                        List.of(laptop, monitor)
                )
        );

       // Find all unique products ordered across all orders.

        Set<Product> collect = orders.stream()
                .flatMap(o -> o.getProducts().stream()).collect(Collectors.toSet());

        collect.stream().map(Product::getName).forEach(System.out::println);
    }
}
