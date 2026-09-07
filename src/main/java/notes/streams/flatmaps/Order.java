package notes.streams.flatmaps;

import java.util.List;

class Order {

    private int orderId;
    private List<Product> products;

    public Order(int orderId, List<Product> products) {
        this.orderId = orderId;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getProducts() {
        return products;
    }
}