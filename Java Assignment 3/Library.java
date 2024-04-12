import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
class TesLib{
    public static void main(String[] args) {
        Library library=new Library();
        library.addBook(new Book("Wings of fire","Abdul kalam"));
        library.addBook(new Book("Dennis Ritchie","CPP"));
        library.addBook(new Book("Rich dad poor dad","Robert kiyoski"));
        System.out.println("============================================================");
        library.displayBooks();
        Book bookToRemove = new Book("Dennis Ritchie", "CPP");
        library.removeBook(bookToRemove);
        System.out.println("============================================================");
        library.displayBooks();
    }
}
