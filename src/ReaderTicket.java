import java.util.ArrayList;
import java.util.List;

public class ReaderTicket {
    private String studentName;
    private int ticketNumber;
    private List<Book> issuedBooks;
    private List<Book> BorrowedBooks;

    public ReaderTicket(String studentName, int ticketNumber) {
        this.studentName = studentName;
        this.ticketNumber = ticketNumber;
        this.issuedBooks = new ArrayList<>();
        this.BorrowedBooks = new ArrayList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public List<Book> getIssuedBooks() {
        return issuedBooks;
    }

    public void issueBook(Book book) {
        // Логика выдачи книги
        // Например, добавление книги в список issuedBooks
        issuedBooks.add(book);
        book.setIssued(true);
    }

    public void returnBook(Book book) {
        // Логика возврата книги
        // Например, удаление книги из списка issuedBooks
        issuedBooks.remove(book);
        book.setIssued(false);
    }

    public void BorrowBook(Book book) {
        BorrowedBooks.add(book);
    }

    public void ReturnBook(Book book) {
        BorrowedBooks.remove(book);
    }
}