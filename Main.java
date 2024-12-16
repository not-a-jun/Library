import java.util.List;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Book book1 = new Book("Война и мир", "Лев Толстой", 1867, true);
        Book book2 = new Book("Мы", "Евгений Замятин");
        Book book3 = new Book("Анна Каренина", "Лев Толстой", 1873, true);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        library.printAvailableBooks();

        List<Book>tolstoyBooks = library.findBookByAuthor("Лев Толстой");
        for (Book book: tolstoyBooks) {
            book.displayInfo();
        }

        book1.borrowBook();

        library.printAvailableBooks();

    }
}
