package magdalena.galwa.MovieCatalog.moviesusers;

import magdalena.galwa.MovieCatalog.exception.MovieNotFoundException;
import magdalena.galwa.MovieCatalog.movie.MovieRepo;
import magdalena.galwa.MovieCatalog.user.User;
import magdalena.galwa.MovieCatalog.moviesusers.MoviesUsersRepo;
import magdalena.galwa.MovieCatalog.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 31.01.2022
 */

@Service
public class MoviesUsersService {

    private final MoviesUsersRepo moviesusersRepo;
    private final UserRepo userRepo;
    private final MovieRepo movieRepo;

    @Autowired
    public MoviesUsersService(MoviesUsersRepo moviesusersRepo, UserRepo userRepo, MovieRepo movieRepo){
        this.moviesusersRepo = moviesusersRepo;
        this.userRepo = userRepo;
        this.movieRepo = movieRepo;}

    public List<MoviesUsers> findAllMoviesUsers(){return moviesusersRepo.findAll(); }

    public List<MoviesUsers> findMoviesUsersByUser(User user){
        return moviesusersRepo.findMoviesUsersByUser(user).
                orElseThrow(() -> new MovieNotFoundException("Rate related to user id" + user.getId() + "was not found"));
    }

    public MoviesUsers addRole(MoviesUsers moviesusers){
        moviesusers.setUser(userRepo.getById(moviesusers.getIduser()));
        moviesusers.setMovie(movieRepo.getById(moviesusers.getIdmovie()));
        return moviesusersRepo.save(moviesusers);
    }
}
