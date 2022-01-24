package magdalena.galwa.MovieCatalog.exception;

/**
 * @author MagdaB
 * @since 19.12.2021
 */
public class MovieNotFoundException extends RuntimeException{
    public MovieNotFoundException(String message) {
        super(message);
    }
}
