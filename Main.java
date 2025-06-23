/*Create a class called Book with:
•	String title
•	String author
Use a parameterized constructor to initialize both variables.
Add a method showBook() to print the book details.*/
class Book
{
    String title;
    String author;
    Book(String title, String author)
    {
        this.title = title;
        this.author = author;
    }
    public void showBook()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class Main {
    public static void main(String[] args) {
        Book skt = new Book("skt book", "skt skt");
        skt.showBook();
    }
}
