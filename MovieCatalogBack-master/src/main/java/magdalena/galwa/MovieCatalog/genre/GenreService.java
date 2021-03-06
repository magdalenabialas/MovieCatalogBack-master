package magdalena.galwa.MovieCatalog.genre;

import magdalena.galwa.MovieCatalog.exception.GenreNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1.1
 * @since 11.01.2022
 */

@Service
public class GenreService {

    private final GenreRepo genreRepo;

    @Autowired
    public GenreService(GenreRepo genreRepo) {
        this.genreRepo = genreRepo;
    }

    public List<Genre> findAllGenres(){
        return genreRepo.findAll();
    }

    public Genre findGenreByIdgenre(Long idgenre){
        return genreRepo.findGenreByIdgenre(idgenre).
                orElseThrow(()-> new GenreNotFoundException("Genre by id " + idgenre + " was not found"));
    }
}
