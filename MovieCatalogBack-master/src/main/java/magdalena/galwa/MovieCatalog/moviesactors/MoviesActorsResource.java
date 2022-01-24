package magdalena.galwa.MovieCatalog.moviesactors;

import magdalena.galwa.MovieCatalog.movie.Movie;
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
 * @since 15.01.2022
 */

@RestController
@RequestMapping("api/v1/moviesactors")
public class MoviesActorsResource {

    private final MoviesActorsService moviesactorsService;

    public MoviesActorsResource(MoviesActorsService moviesactorsServic) {this.moviesactorsService = moviesactorsServic;}

    @GetMapping("/all")
    public ResponseEntity<List<MoviesActors>> getAllMoviesActors(){
        List<MoviesActors> moviesactors = moviesactorsService.findAllMoviesActors();
        return new ResponseEntity<>(moviesactors, HttpStatus.OK);
    }

    @GetMapping("/idmovie/{id}")
    public ResponseEntity<List<MoviesActors>> getMoviesActorsByMovie(@PathVariable("id") Movie movie ){
        List<MoviesActors> moviesactors =  moviesactorsService.findMoviesActorsByMovie(movie);
        return new ResponseEntity<>(moviesactors, HttpStatus.OK);
    }
}