import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Test BankAccount ===");
        BankAccount bank = new BankAccount("001", "Tuan", 5000);
        bank.deposit(1500);
        bank.withdraw(2000);
        bank.display();

        System.out.println("\n=== Test Book ===");
        Book book = new Book();
        book.input(sc);
        book.display();

        System.out.println("\n=== Test Car ===");
        Car car = new Car();
        car.input(sc);
        car.display();

        System.out.println("\n=== Test Circle ===");
        Circle cir = new Circle();
        cir.input(sc);
        cir.display();

        System.out.println("\n=== Test Employee ===");
        Employee emp = new Employee();
        emp.input(sc);
        emp.display();

        System.out.println("\n=== Test Product ===");
        Product prod = new Product();
        prod.input(sc);
        prod.display();

        System.out.println("\n=== Test Rectangle ===");
        Rectangle rec = new Rectangle();
        rec.input(sc);
        rec.display();

        System.out.println("\n=== Test Student ===");
        Student stu = new Student();
        stu.input(sc);
        stu.display();

        sc.close();
    }
}
