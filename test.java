import java.util.Scanner;   
class Library {
 private final String name;
 private final String address;
 Library(String name, String address) {
 this.name = name;
 this.address = address;
 }
 void displayLibraryDetails() {
 System.out.println("Library Name: " + name);
 System.out.println("Library Address: " + address);
 }
 class Book {
 private final String title;
 private final String author;
 Book(String title, String author) {
 this.title = title;
 this.author = author;
 }
 void displayBookDetails() {
 System.out.println("Book Title: " + title);
 System.out.println("Author: " + author);
 }
 }
}
public class test {
 public static void main(String[] args) {
 Library library = new Library("Central Library", "Downtown");
 Library.Book book = library.new Book("Java Programming", "John Doe");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a namebook: ");
 String ff=sc.nextLine();
    System.out.println("Enter a author: ");
    String x = sc.nextLine();
    Library.Book book1 = library.new Book(ff,x);
 library.displayLibraryDetails();
 book.displayBookDetails();
 book1.displayBookDetails();
 }
}
