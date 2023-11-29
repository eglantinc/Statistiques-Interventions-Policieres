/**
 * Exception personnalisée utilisée pour signaler des informations invalides
 * dans le fichier d'entrée. Elle étend RuntimeException pour indiquer que
 * c'est une exception non vérifiée.
 */
public class InformationInvalideDansLeFichierEntree extends RuntimeException {

    /**
     * Construit une nouvelle instance de l'exception avec le message spécifié.
     *
     * @param message Message détaillant la nature de l'information invalide.
     */
    public InformationInvalideDansLeFichierEntree(String message) {
        super(message);
    }
}

