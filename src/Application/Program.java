package Application;

import Enum.entities.OrderStatus;
import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        System.out.println();

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());
        System.out.println();

        Order order = new Order(status, client);

        System.out.print("How many items to this data? ");
        int valor = sc.nextInt();
        for (int i = 0; i < valor; i ++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            System.out.println();

            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(productQuantity, productPrice, product);
            order.addItem(item);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);


        sc.close();
    }
}
