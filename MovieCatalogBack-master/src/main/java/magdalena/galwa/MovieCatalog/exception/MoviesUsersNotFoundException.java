package magdalena.galwa.MovieCatalog.exception;

/**
 * @author MagdaB
 * @since 19.12.2021
 */
public class MoviesUsersNotFoundException extends RuntimeException{
    public MoviesUsersNotFoundException(String message) {
        super(message);
    }
}
