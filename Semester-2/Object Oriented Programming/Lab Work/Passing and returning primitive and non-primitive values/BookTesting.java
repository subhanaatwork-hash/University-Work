class Book {

    private String author;
    private String[] chapterNames = new String[100];

    public Book() {
        author = "";
    }

    public Book(String a, String[] c) {
        author = a;
        chapterNames = c;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setChapters(String[] c) {
        chapterNames = c;
    }

    public String getAuthor() {
        return author;
    }

    public static boolean compareBooks(Book b1, Book b2) {
        if (b1.author.equals(b2.author))
            return true;
        else
            return false;
    }

    public static Book compareChapterNames(Book b1, Book b2) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < b1.chapterNames.length; i++) {
            if (b1.chapterNames[i] != null)
                count1++;
        }

        for (int i = 0; i < b2.chapterNames.length; i++) {
            if (b2.chapterNames[i] != null)
                count2++;
        }

        if (count1 > count2)
            return b1;
        else
            return b2;
    }
}

public class BookTesting {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.setAuthor("Ali");
        String[] ch1 = {"Intro", "Chapter1", "Chapter2"};
        book1.setChapters(ch1);

        String[] ch2 = {"Intro", "C1", "C2", "C3"};
        Book book2 = new Book("Ali", ch2);

        System.out.println(Book.compareBooks(book1, book2));

        Book bigger = Book.compareChapterNames(book1, book2);
        System.out.println(bigger.getAuthor());
    }
}