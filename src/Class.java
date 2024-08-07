public class Class {
    public static void main(String[] args) throws Exception {

        // Utilise le constructeur par défaut
        Book defaultBook = new Book(null, null, 0);
        
        // Utilise le constructeur secondaire
        Book customBook = new Book("Java Programming", "John Doe", 300);
        
        // Utilise le constructeur principal
        Book fullBook = new Book("Java Programming", "John Doe", 300, "Tech Books Publishing");

        System.out.println(defaultBook);
        System.out.println(customBook);
        System.out.println(fullBook);

        System.out.println(fullBook.title);

        
    }
}

class Book {

    String title;
    String author;
    int numberOfPages;
    String publisher;

    // Constructeur secondaire de la classe Book
    Book(String title, String author, int numberOfPages) {

        // Utilise le constructeur principal avec des valeur prédéfinies
        this(title, author, numberOfPages, "OC");
    }

    Book(String title, String author, int numberOfPages, String publisher) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.publisher = publisher;
    }

    // On override la méthode toString qui nous renverrait le 
    // nom de la classe + son id (-> Book@80ec1f8 p.e)
    @Override
    public String toString() {
        return "title='" + title + "'" +
               ", author='" + author + "'" +
               ", numberOfPages=" + numberOfPages +
               ", publisher='" + publisher;
    }
}