package magdalena.galwa.MovieCatalog.exception;

/**
 * @author MagdaB
 * @since 19.12.2021
 */
public class DirectorNotFoundException extends RuntimeException{
    public DirectorNotFoundException(String message) {
        super(message);
    }
}
