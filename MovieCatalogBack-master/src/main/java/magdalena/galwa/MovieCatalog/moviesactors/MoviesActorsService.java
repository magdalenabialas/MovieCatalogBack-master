package magdalena.galwa.MovieCatalog.moviesactors;

import magdalena.galwa.MovieCatalog.exception.MovieNotFoundException;
import magdalena.galwa.MovieCatalog.moviesactors.MoviesActors;
import magdalena.galwa.MovieCatalog.movie.Movie;
import magdalena.galwa.MovieCatalog.moviesactors.MoviesActorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author MagdaGalwa
 * @version 1
 * @since 15.01.2022
 */

@Service
public class MoviesActorsService {

    private final MoviesActorsRepo moviesactorsRepo;

    @Autowired
    public MoviesActorsService(MoviesActorsRepo moviesactorsRepo){this.moviesactorsRepo = moviesactorsRepo; }

    public List<MoviesActors> findAllMoviesActors(){return moviesactorsRepo.findAll(); }

    public List<MoviesActors> findMoviesActorsByMovie(Movie movie){
        return moviesactorsRepo.findMoviesActorsByMovie(movie).
                orElseThrow(() -> new MovieNotFoundException("Roles related to movie by id" + movie.getIdmovie() + "was not found"));
    }
}
