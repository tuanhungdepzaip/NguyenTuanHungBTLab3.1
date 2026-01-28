import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten SP: ");
        name = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap so luong: ");
        quantity = sc.nextInt();
    }

    public double getTotalPrice() {
        return price * quantity;
    }

    public void discount(double percent) {
        price = price - price * percent / 100;
    }

    public void display() {
        System.out.println("id: " + id + 
                           " – Name: " + name + 
                           " – Price: " + price + 
                           " – Quantity: " + quantity);
    }
}
