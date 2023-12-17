import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryJournal {
    private List<Book> availableBooks;

    public LibraryJournal() {
        this.availableBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void removeBook(Book book) {
        availableBooks.remove(book);
    }

    public List<Book> getAvailableBooks() {
        return availableBooks;
    }

    public List<Book> findOverdueBooks() {
        List<Book> overdueBooks = new ArrayList<>();
        // Логика поиска просроченных книг
        // Например, перебор списка доступных книг и проверка их статуса
        for (Book book : availableBooks) {
            if (book.isIssued() &&
                    book.getDueDat().isBefore(LocalDate.now())) {
                overdueBooks.add(book);
            }
        }
        return overdueBooks;
    }
}