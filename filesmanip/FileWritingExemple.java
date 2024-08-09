import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingExemple {

    public static void main(String[] args) {

        BufferedWriter writer = null;

        try {
            // Création d'un FileWriter pour écrire dans un fichier
            FileWriter fileWriter = new FileWriter("../filesmanip/test.txt", false);

            // Création d'un BufferedWriter qui utilise le FileWriter
            writer = new BufferedWriter(fileWriter);

            // Ajout d'un texte à notre fichier
            for (String lineToWrite : args) {
                writer.write(lineToWrite);
                writer.newLine();
            }
            
            // writer.write("preferenceNewsletter=false");
			// writer.newLine();

			// writer.write("preferenceColor=#425384");
			// writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Assurez-vous de fermer le BufferedWriter dans le bloc finally
            if (writer != null) {
                try {
                    writer.close(); // Fermer pour s'assurer que tout est écrit
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}