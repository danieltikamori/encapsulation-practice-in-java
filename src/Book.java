public class Book {

    private String bookTitle;
    private String bookAuthor;
    private int bookPages;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }
    public void showBookDetails(){
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Book Author: " + getBookAuthor());
        System.out.println("Book Pages: " + getBookPages());
    }
}
