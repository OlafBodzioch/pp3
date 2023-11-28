public class Book {
 
    private String bookName;
    private int year;
    private Writer writer;

    public Book(String bookName, int year, Writer writer) {
        this.bookName = bookName;
        this.year = year;
        this.writer = writer;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public Writer getWriter() {
        return writer;
    }
    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public String toString() {
        return "Book [bookName=" + bookName + ", year=" + year + ", writer=" + writer + "]";
    }

    public static void main(String[] args) {
        
        Writer autor = new Writer("Roman", "Pisarski", 57);
        Book ksionszka = new Book("o psie ktury jedzil kolejom", 1967, autor);

        System.out.println(ksionszka.toString());

    }
    
}
