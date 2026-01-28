import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double score;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap diem: ");
        score = sc.nextDouble();
    }

    public void display() {
        System.out.println("ID: " + id + " - Name: " + name + " - Score: " + score);
    }

    public boolean isPass() {
        return score >= 5;
    }
}
