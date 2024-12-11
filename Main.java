import java.util.ArrayList;

    class Book {
        String title;
        String author;
        int year;
        boolean isAvailable;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
            this.isAvailable = true;
        }

        public Book(String title, String author) {
            this(title, author, 2024);
        }

        public void borrowBook() {
            if (isAvailable) {
                isAvailable = false;
            }
        }

        public void returnBook() {
            isAvailable = true;
        }

        public void displayInfo() {
            System.out.println("Название книги:" + title + ", " + "Автор:" + author + ", " + "Год:" + year + ", " + "Доступность:" + isAvailable);
        }
    }

         class Library {
            ArrayList<Book> books = new ArrayList<>();

            public void addBook(Book book) {
                books.add(book);
            }

            public void printAvailableBooks() {
                for (Book book : books) {
                    if (book.isAvailable) {
                        book.displayInfo();
                    }
                }
            }

            public ArrayList<Book> findBookByAuthor(String author) {
                ArrayList<Book> refund = new ArrayList<>();
                for (Book book : books) {
                    if (book.author.equals(author)) {
                        refund.add(book);
                    }
                }
                return refund;
            }
        }

        public class Main {
            public static void main(String[] args) {

                Library library = new Library();
                Book book1 = new Book("Война и мир", "Лев Толстой", 1867);
                Book book2 = new Book("Мы", "Евгений Замятин", 1920);

                library.addBook(book1);
                library.addBook(book2);

                library.printAvailableBooks();

                book1.borrowBook();

                library.printAvailableBooks();

            }
        }
