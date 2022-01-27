package magdalena.galwa.MovieCatalog.movie;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
