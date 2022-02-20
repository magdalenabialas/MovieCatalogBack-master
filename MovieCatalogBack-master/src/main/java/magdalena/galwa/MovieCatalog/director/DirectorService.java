package magdalena.galwa.MovieCatalog.director;

import magdalena.galwa.MovieCatalog.exception.DirectorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 13.01.2022
 */

@Service
public class DirectorService {

    private final DirectorRepo directorRepo;

    @Autowired
    public DirectorService(DirectorRepo directorRepo){this.directorRepo = directorRepo; }

    public List<Director> findAllDirectors(){return directorRepo.findAll(); }

    public Director findDirectorByIddirector(Long iddirector){
        return directorRepo.findDirectorByIddirector(iddirector).
                orElseThrow(() -> new DirectorNotFoundException("Director by id" + iddirector + "was not found"));
    }
}
