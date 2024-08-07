import java.util.ArrayList;

class BookStore {
    
    public static Categories categories;
    
    // Définissez une fonction récursive
    public static int countBooks(Categories categories) {
        int c = 0;
        for (RecursiveClass category : categories) {
            c += category.numberOfBooks;
            c += countBooks(category.subCategories);
        }
        return c;
    }
    
    public static void main(String[] args) {
        // Créez des catégories avec des livres
        RecursiveClass c1 = new RecursiveClass();
        c1.numberOfBooks = 3;
        RecursiveClass c2 = new RecursiveClass();
        c2.numberOfBooks = 2;
        RecursiveClass c3 = new RecursiveClass();
        c3.numberOfBooks = 1;
    
        // Ajoutez des sous-catégories
        Categories subc1 = new Categories();
        subc1.add(c3);
        c1.subCategories = subc1;
    
        // Ajoutez les catégories à la librairie
        categories = new Categories();
        categories.add(c1);
        categories.add(c2);
    
        // Appelez la fonction récursive
        int numberOfBooks = countBooks(categories);
        System.out.println("The bookstore has " + numberOfBooks + " books");
    }
}

class RecursiveClass {

    public int numberOfBooks;
    public Categories subCategories = new Categories();

}

class Categories extends ArrayList<RecursiveClass> {

}
