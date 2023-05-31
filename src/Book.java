public class Book extends Author {
    private String bookName;

    private double price;
    private int qty = 0;
    private Author author;

    public Book(String bookName, Author author, double price, int qty) {
        super();
        setAuthor(author);
        setBookName(bookName);
        setPrice(price);
        setQty(qty);
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
