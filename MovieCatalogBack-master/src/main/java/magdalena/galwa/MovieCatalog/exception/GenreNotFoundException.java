package magdalena.galwa.MovieCatalog.exception;

/**
 * @author MagdaB
 * @since 19.12.2021
 */
public class GenreNotFoundException extends RuntimeException{
    public GenreNotFoundException(String message) {
        super(message);
    }
}
