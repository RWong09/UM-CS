public class Book {
    private String bookName;
    private String author;
    private String ISBN;
    
    public Book (String bookName, String author, String ISBN) {
        this.bookName = bookName;
        this.author = author;
        this.ISBN = ISBN;

    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}