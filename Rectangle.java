import java.util.Scanner;

public class Rectangle {
    private double length;
    private double width;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        length = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        width = sc.nextDouble();
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    public void display() {
        System.out.println("Length: " + length + " – Width: " + width);
    }
}
