package entities;

import Enum.entities.OrderStatus;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private OrderStatus status;

    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(OrderStatus status, Client client) {
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Double total() {
        double soma = 0.0;
        for (OrderItem i : items) {
            soma = soma + i.subTotal();
        }
        return soma;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: \n");
        sb.append("Order status: ");
        sb.append(status + "\n");
        sb.append("Client: ");
        sb.append(client + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: R$ ");
        sb.append(String.format("%.2f", total()));

        return sb.toString();
    }
}
