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
    public ResponseEntity<Map<String, Object>> getAllMovies(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "9") int size
    ){
        try {
            List<Movie> movies = new ArrayList<Movie>();
            Pageable paging = PageRequest.of(page, size);

            Page<Movie> pageMovie;

            pageMovie = movieService.findAllMovies(paging);
            movies = pageMovie.getContent();

            Map<String, Object> response = new HashMap<>();
            response.put("tutorials", movies);
            response.put("currentPage", pageMovie.getNumber());
            response.put("totalItems", pageMovie.getTotalElements());
            response.put("totalPages", pageMovie.getTotalPages());

            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/findidmovie/{id}")
    public ResponseEntity<Movie> getMovieByIdmovie (@PathVariable("id") Long idmovie){
        Movie movie = movieService.findMovieByIdmovie(idmovie);
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }

}
