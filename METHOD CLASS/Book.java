import java.util.Scanner;

public class Book {
    String name;
    String author;
    double price;

    public static Book createBook() {
        Book b = new Book();
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Book details:");
        System.out.print("Name: ");
        b.name = s.next();

        System.out.print("Author: ");
        b.author = s.next();

        System.out.print("Price: ");
        b.price = s.nextDouble();

        return b;
    }

    public void display() {
        System.out.println("Book name: " + name);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);
    }

    public static void main(String[] args) {
        Book b1 = createBook();
        Book b2 = createBook();

        b1.display();
        System.out.println("======");
        b2.display();
    }
}
