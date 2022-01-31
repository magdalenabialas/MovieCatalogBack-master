package magdalena.galwa.MovieCatalog.moviesusers;

import magdalena.galwa.MovieCatalog.exception.MovieNotFoundException;
import magdalena.galwa.MovieCatalog.user.User;
import magdalena.galwa.MovieCatalog.moviesusers.MoviesUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 31.01.2022
 */

@Service
public class MoviesUsersService {

    private final MoviesUsersRepo moviesusersRepo;

    @Autowired
    public MoviesUsersService(MoviesUsersRepo moviesusersRepo){this.moviesusersRepo = moviesusersRepo; }

    public List<MoviesUsers> findAllMoviesUsers(){return moviesusersRepo.findAll(); }

    public List<MoviesUsers> findMoviesUsersByUser(User user){
        return moviesusersRepo.findMoviesUsersByUser(user).
                orElseThrow(() -> new MovieNotFoundException("Rate related to user id" + user.getId() + "was not found"));
    }
}
