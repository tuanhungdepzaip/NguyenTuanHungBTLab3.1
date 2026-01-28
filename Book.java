import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private double price;
    private int year;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tieu de: ");
        title = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        author = sc.nextLine();
        System.out.print("Nhap gia: ");
        price = sc.nextDouble();
        System.out.print("Nhap nam xuat ban: ");
        year = sc.nextInt();
    }

    public void display() {
        System.out.println("Title: " + title + 
                           " – Author: " + author + 
                           " – Price: " + price + 
                           " – Year: " + year);
    }

    public boolean isExpensive() {
        return price > 200000;
    }

    public boolean isOldBook() {
        return year < 2015;
    }
}
