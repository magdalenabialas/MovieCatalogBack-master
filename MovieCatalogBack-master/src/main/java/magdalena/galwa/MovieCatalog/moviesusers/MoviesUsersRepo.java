package magdalena.galwa.MovieCatalog.moviesusers;

import magdalena.galwa.MovieCatalog.user.User;
import magdalena.galwa.MovieCatalog.moviesusers.MoviesUsers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author MagdaB
 * @version 1
 * @since 31.01.2022
 */
public interface MoviesUsersRepo extends JpaRepository<MoviesUsers, Long> {
    Optional<List<MoviesUsers>> findMoviesUsersByUser(User user);
}
