package magdalena.galwa.MovieCatalog.moviesactors;
import magdalena.galwa.MovieCatalog.movie.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
/**
 * @author MagdaGalwa
 * @version 2
 * @since 15.01.2022
 */
public interface MoviesActorsRepo extends JpaRepository<MoviesActors, Long> {
    Optional<List<MoviesActors>> findMoviesActorsByMovie(Movie movie);
}
