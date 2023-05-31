public class Library {
    public static void main(String[] args) {
        Author author1 = new Author("Homer", "homer@ithaca.net", 'M');
        Book book1 = new Book("The Odyssey", author1, 12.99, 12);
        Author author2 = new Author("J.K. Rowling", "jkrowling@harrypotter.biz", 'F');
        Book book2 = new Book("Harry Potter", author2, 9.99, 7);
        Author author3 = new Author("Stephen King", "sking@gmail.com", 'M');
        Book book3 = new Book("The Outsider", author3, 19.99, 43);

        System.out.println("Name of book: " + book1.getBookName() + ", Author: " + book1.getAuthor() + ", Price: " + book1.getPrice() + ", Quantity: " + book1.getQty());
        System.out.println("Name of book: " + book2.getBookName() + ", Author: " + book2.getAuthor() + ", Price: " + book2.getPrice() + ", Quantity: " + book2.getQty());
        System.out.println("Name of book: " + book3.getBookName() + ", Author: " + book3.getAuthor() + ", Price: " + book3.getPrice() + ", Quantity: " + book3.getQty());
    }
}
