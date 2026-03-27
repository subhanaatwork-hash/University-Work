package CompositionLab;

public class Book {
    private String bookName;
    private String publisher;
    private Person author;

    public Book() {}
    
    public Book(String bookName, String publisher, Person author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }
    
    public void displayBook() {
        System.out.println("\nBook: " + bookName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author Details:");
        author.displayPerson();
    }
}