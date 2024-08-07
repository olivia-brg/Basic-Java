import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Data {

    public static void array() {
        int[] firstArray; // Déclarer la variable
        firstArray = new int[7]; // Créer le tableau et l'assigner à la variable
        firstArray[4] = 3; // Attribuez la valeur 3 a l'index 4 (5e element)

        int[] secondArray;
        secondArray = new int[] { 6, 2, 3, 7, 3, 4, 1 }; // Créer un nouveau tableau avec toutes les valeurs et
                                                         // l'assigne à notre variable

        System.out.println("\n--------------| Arrays |--------------");
        System.out.println("First array : " + Arrays.toString(firstArray));
        System.out.println("Second array : " + Arrays.toString(secondArray));
        System.out.println("--------------------------------------\n");

        // TABLEAU MULTIDIMENSIONNEL
        String[][] myTheatreSeats = new String[30][12]; // Créez un tableau multidimensionnel pour gérer tous les rangs
                                                        // d'un théâtre
        myTheatreSeats[9][5] = "James Logan"; // Rang 10, siège 6 (l'ndex commence à 0)

        // Inconveniant des arrays :
        // - ils ont une taille fixe
        // - on ne peux modifier que les valeurs existantes (on ne peux pas ajouter d'élément à la fin)
    }

    public static void list() {
        List<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(7); // Ajoute l'élément à la fin de la liste
        myArrayList.add(5); // Ajoute l'élément à la fin de la liste
        myArrayList.add(1, 12); // Décale les éléments à partir de l'index 1 pour ajouter celui-ci
        myArrayList.set(0, 4); // Remplace l'élément à l'index 0
        myArrayList.remove(1); // Besoin de commenter vraiment?
        myArrayList.add(13);
        myArrayList.add(3);

        double averageOfArrayList = calculateAverage(myArrayList);

        System.out.println("----------| Liste Ordonnée |----------");
        System.out.println("Complete list : " + myArrayList);
        System.out.println("List size : " + myArrayList.size());
        System.out.println("The average is : " + averageOfArrayList);
        System.out.println("--------------------------------------\n");

        // On peux utiliser cette liste avec les objets suivant :
        // - Integer (int)
        // - Double (double)
        // - Float (float)
        // - Boolean (boolean)
    }

    public static void set() {
        // Ensemble (set) ou "collection non-ordonnée"

        Set<String> ingredients = new HashSet<>();
        ingredients.add("eggs");
        ingredients.add("sugar");
        ingredients.add("butter");
        ingredients.add("salt");
        ingredients.remove("salt");

        System.out.println("-------------| Ensemble |-------------");
        System.out.println("Ingredients list : " + ingredients);
        System.out.println("List size : " + ingredients.size());
        System.out.println("--------------------------------------\n");

        // Utilisation de la méthode size car .length est un attribut des tableaux
        // et la méthode .length() est une méthode pour les strings
    }

    public static void map() {

        Map<String, Integer> myMap = new HashMap<>();

        // Les âges de mes amis
        myMap.put("Jenny", 34);
        myMap.put("Livia", 28);
        myMap.put("Paul", 31);

        // Définissez des clés en tant que constantes dans votre classe
        final String KMAELYS = "Maëlys";
        final String KGIULIA = "Giulia";
        // Utilisez des constantes en tant que keys
        myMap.put(KMAELYS, 27);
        myMap.put(KGIULIA, 17);

        // Accédez à un élément
        
        System.out.println("-----------| Dictionnaire |-----------");
        System.out.println("Jenny value : " + myMap.get("Jenny"));
        System.out.println("Maëlys value : " + myMap.get(KMAELYS));
        System.out.println("--------------------------------------\n");

    }

    public static void main(String[] args) {
        array();
        list();
        set();
        map();
    }

    public static double calculateAverage(List<Integer> listOfIntegers) {
        if (listOfIntegers.isEmpty()) {
            return 0; // ou gérer autrement selon les besoins
        }
        double sum = 0;
        for (int value : listOfIntegers) {
            sum += value;
        }
        return sum / listOfIntegers.size();
    }
}
