import java.util.Scanner;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap luong: ");
        salary = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + " – Name: " + name + " – Salary: " + salary);
    }

    public double calculateTax() {
        if (salary > 10000000) {
            return salary * 0.1;
        }
        return 0;
    }
}
