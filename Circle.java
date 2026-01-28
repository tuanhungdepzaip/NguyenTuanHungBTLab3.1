import java.util.Scanner;

public class Circle {
    private double radius;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        radius = sc.nextDouble();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isBigCircle() {
        return getArea() > 100;
    }
}
