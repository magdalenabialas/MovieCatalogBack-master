package magdalena.galwa.MovieCatalog.director;

import magdalena.galwa.MovieCatalog.director.Director;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 13.01.2022
 */
public interface DirectorRepo extends JpaRepository<Director, Long> {
    Optional<Director> findDirectorByIddirector(Long iddirector);
}
