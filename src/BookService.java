import entity.BookDetail;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BookService {

    private Map<Integer, BookDetail> books = new HashMap<>();

    public void addBook(String type){
        BookDetail bookDetail = new BookDetail();

        Integer bookId = Collections.min(books.keySet()) + 1;

        if (type.equals("H")) {
            bookDetail.setType("Handwritten");
            bookDetail.setId(bookId);
        } else if (type.equals("P")) {
            bookDetail.setType("Printed");
            bookDetail.setId(bookId);
        }

        books.put(bookId, bookDetail);

        System.out.printf("Created new book: %s [id: %d]%n", type, bookId);
    }

    public void readInLibrary(String bookId, String memberId, String dateStr) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate readDate = LocalDate.parse(dateStr, formatter);

        BookDetail bookDetail = books.get(Integer.parseInt(bookId)); // kaydı çağırdık

        // kaydı düzenledik
        bookDetail.setStartingDate(readDate);
        bookDetail.setStatus("library");
        bookDetail.setMemberId(Integer.parseInt(memberId));

        books.put(Integer.parseInt(bookId), bookDetail); //kaydı update ettik
    }

    public Boolean checkAvailability(String bookId) {
        return books.get(Integer.parseInt(bookId)).getMemberId() != null;
    }

    public String borrowBook(String bookId, String memberId, String dateStr) {
        if (checkAvailability(bookId)) {
            return "kitabı alamazsınız"; // hata: kitabı alamazsınız
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate readDate = LocalDate.parse(dateStr, formatter);

        BookDetail bookDetail = books.get(Integer.parseInt(bookId)); // kaydı çağırdık

        // kaydı düzenledik
        bookDetail.setStartingDate(readDate);
        bookDetail.setStatus("borrow");
        bookDetail.setMemberId(Integer.parseInt(memberId));

        books.put(Integer.parseInt(bookId), bookDetail); //kaydı update ettik

        return "kitap başarıyla alındı";
    }


}
