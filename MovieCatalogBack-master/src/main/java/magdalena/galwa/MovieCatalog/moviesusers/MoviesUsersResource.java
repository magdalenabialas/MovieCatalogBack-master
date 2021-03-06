package magdalena.galwa.MovieCatalog.moviesusers;

import magdalena.galwa.MovieCatalog.user.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 31.01.2022
 */

@RestController
@RequestMapping("api/v1/moviesusers")
public class MoviesUsersResource {

    private final MoviesUsersService moviesUsersService;

    public MoviesUsersResource(MoviesUsersService moviesUsersService) {this.moviesUsersService = moviesUsersService;}

    @GetMapping("/all")
    public ResponseEntity<List<MoviesUsers>> getAllMoviesUsers(){
        List<MoviesUsers> moviesusers = moviesUsersService.findAllMoviesUsers();
        return new ResponseEntity<>(moviesusers, HttpStatus.OK);
    }

    @GetMapping("/iduser/{id}")
    public ResponseEntity<List<MoviesUsers>> getMoviesUsersByUser(@PathVariable("id") User user ){
        List<MoviesUsers> moviesusers =  moviesUsersService.findMoviesUsersByUser(user);
        return new ResponseEntity<>(moviesusers, HttpStatus.OK);
    }

    @PostMapping("/add/rate")
    public ResponseEntity<MoviesUsers> addRate(@RequestBody MoviesUsers moviesUsers){
        MoviesUsers newMoviesUsers = moviesUsersService.addRole(moviesUsers);
        return new ResponseEntity<>(newMoviesUsers, HttpStatus.CREATED);
    }
}
