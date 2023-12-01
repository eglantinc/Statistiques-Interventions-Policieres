import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InterventionsPolicieresWriter {

    /**
     * Cette méthode sert à produire un fichier de sortie où qu'il y aura une nouvelle statistique sur le nombre de
     * parcs par arrondissements où il y a eu des interventions policières.
     * 
     * @param fichierSortie Le chemin du fichier de sortie dans lequel on va produire la nouvelle statistique.
     * @param ligneSaisie La ligne de texte à écrire dans le fichier de sortie.
     */
    public static void ecrireFichierSortie( String fichierSortie, String ligneSaisie ) {

        try {

            FileWriter fichierEcriture = new FileWriter(fichierSortie, true );

            BufferedWriter tamponEcriture = new BufferedWriter(fichierEcriture);
            // Écrire une ligne de chaines de caractères.
            tamponEcriture.write(ligneSaisie );

            tamponEcriture.newLine();

            tamponEcriture.close();

            fichierEcriture.close();

        } catch( IOException e ) {

            throw new RuntimeException(String.format(TraducteurSingleton.getInstance()
                    .traduire("erreurEcritureDansFichier"), fichierSortie));

        }
    }

}