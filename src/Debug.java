import java.util.ArrayList;
import java.util.List;


public class Debug {
    
    /**
     * calculez la valeur moyenne d'une liste d'entiers
     *
     * @param listOfIntegers une liste contenant des nombres entiers
     * @return la moyenne de la liste
     */

    
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
    
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(5);
        myList.add(1,12);
        myList.set(0,4);
        myList.remove(1);
        myList.add(13);
        myList.add(3);

        double average = calculateAverage(myList);

        System.out.println("Complete list : " + myList);
        System.out.println("The average is : " + average);
    }
}
