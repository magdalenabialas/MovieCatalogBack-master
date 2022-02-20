package magdalena.galwa.MovieCatalog.exception;

/**
 * @author MagdaB
 * @since 19.12.2021
 */
public class MoviesActorsNotFoundException extends RuntimeException{
    public MoviesActorsNotFoundException(String message) {
        super(message);
    }
}