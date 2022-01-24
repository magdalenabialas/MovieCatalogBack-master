package magdalena.galwa.MovieCatalog.genre;

import magdalena.galwa.MovieCatalog.genre.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 11.01.2022
 */
public interface GenreRepo extends JpaRepository<Genre, Long> {
    Optional<Genre> findGenreByIdgenre(Long idgenre);
}
