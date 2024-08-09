import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExample {

    public static void main(String[] args) {
		
		try {
			// Création d'un FileReader pour lire le fichier
			FileReader fileReader = new FileReader("../filesmanip/test.txt");
			
			// Création d'un BufferedReader qui utilise le FileReader
			BufferedReader reader = new BufferedReader(fileReader);
			
			// Lecture de la première ligne
			String line = reader.readLine();
			
			while (line != null) {
				// Affichage de la ligne
				System.out.println(line);
				// Lecture de la prochaine ligne
				line = reader.readLine();
			}
			// Fermeture du BufferedReader
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}