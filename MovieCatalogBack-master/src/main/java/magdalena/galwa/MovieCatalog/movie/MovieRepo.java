package magdalena.galwa.MovieCatalog.movie;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import magdalena.galwa.MovieCatalog.movie.Movie;

import java.util.Optional;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 19.12.2021
 */


public interface MovieRepo extends JpaRepository<Movie, Long> {
    Optional<Movie> findMovieByIdmovie(Long idmovie);
}



