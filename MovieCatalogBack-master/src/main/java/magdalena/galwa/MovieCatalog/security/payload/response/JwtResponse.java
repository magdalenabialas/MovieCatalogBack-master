package magdalena.galwa.MovieCatalog.security.payload.response;

/**
 * @author MagdaB
 * @version 1
 * @since 27.01.2022
 */
import javax.validation.constraints.NotBlank;
import java.util.List;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private Long id;
    private String username;
    private String email;
    private List<String> roles;
    private Long reccomended_movie1;
    private Long reccomended_movie2;


    public JwtResponse(String accessToken, Long id, String username, String email, List<String> roles, Long reccomended_movie1, Long reccomended_movie2) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
        this.reccomended_movie1 = reccomended_movie1;
        this.reccomended_movie2 = reccomended_movie2;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReccoMovie1() {
        return reccomended_movie1;
    }

    public Long getReccoMovie2() {
        return reccomended_movie2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }
}