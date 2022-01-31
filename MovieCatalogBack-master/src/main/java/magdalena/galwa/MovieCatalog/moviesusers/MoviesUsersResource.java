package magdalena.galwa.MovieCatalog.moviesusers;

import magdalena.galwa.MovieCatalog.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 31.01.2022
 */

@RestController
@RequestMapping("api/v1/moviesuser")
public class MoviesUsersResource {

    private final MoviesUsersService moviesUsersService;

    public MoviesUsersResource(MoviesUsersService moviesUsersService) {this.moviesUsersService = moviesUsersService;}

    @GetMapping("/all")
    public ResponseEntity<List<MoviesUsers>> getAllMoviesUsers(){
        List<MoviesUsers> moviesusers = moviesUsersService.findAllMoviesUsers();
        return new ResponseEntity<>(moviesusers, HttpStatus.OK);
    }

    @GetMapping("/idmovie/{id}")
    public ResponseEntity<List<MoviesUsers>> getMoviesUsersByUser(@PathVariable("id") User user ){
        List<MoviesUsers> moviesusers =  moviesUsersService.findMoviesUsersByUser(user);
        return new ResponseEntity<>(moviesusers, HttpStatus.OK);
    }

}
