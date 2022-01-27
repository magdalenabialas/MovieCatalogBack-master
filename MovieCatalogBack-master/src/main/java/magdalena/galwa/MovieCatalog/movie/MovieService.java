package magdalena.galwa.MovieCatalog.movie;

import magdalena.galwa.MovieCatalog.exception.MovieNotFoundException;
import magdalena.galwa.MovieCatalog.movie.Movie;
import magdalena.galwa.MovieCatalog.movie.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 19.12.2021
 */

@Service
public class MovieService {
    private final MovieRepo movieRepo;

    @Autowired
    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public List<Movie> findAllMovies(){
        return movieRepo.findAll();
    }

    public Movie findMovieByIdmovie(Long idmovie){
        return movieRepo.findMovieByIdmovie(idmovie).
                orElseThrow(()-> new MovieNotFoundException ("Movie by id " + idmovie + " was not found"));
    }
}

