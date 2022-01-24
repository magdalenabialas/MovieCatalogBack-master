package magdalena.galwa.MovieCatalog.movie;

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
 * @since 19.12.2021
 */

@RestController
@RequestMapping("api/v1/movie")
public class MovieResource {
    private final MovieService movieService;

    public MovieResource(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Movie>> getAllMovies(){
        List<Movie> movies = movieService.findAllMovies();
        return new ResponseEntity<>(movies, HttpStatus.OK);
    }

    @GetMapping("/findidmovie/{id}")
    public ResponseEntity<Movie> getMovieByIdmovie (@PathVariable("id") Long idmovie){
        Movie movie = movieService.findMovieByIdmovie(idmovie);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }
    @GetMapping("/findtitle/{title}")
    public ResponseEntity<Movie> getMovieByTitle (@PathVariable("title") String title){
        Movie movie = movieService.findMovieByTitle(title);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

}
