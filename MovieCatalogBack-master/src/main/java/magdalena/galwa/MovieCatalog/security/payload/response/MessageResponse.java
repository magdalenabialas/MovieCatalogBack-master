package magdalena.galwa.MovieCatalog.security.payload.response;

/**
 * @author MagdaB
 * @version 1
 * @since 27.01.2022
 */
public class MessageResponse {
    private String message;

    public MessageResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}