package magdalena.galwa.MovieCatalog.director;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 13.01.2022
 */

@RestController
@RequestMapping("api/v1/director")
public class DirectorResource {

    private final DirectorService directorService;

    public DirectorResource(DirectorService directorService){
        this.directorService = directorService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Director>> getAllDirectors(){
        List<Director> directors = directorService.findAllDirectors();
        return new ResponseEntity<>(directors, HttpStatus.OK);
    }

    @GetMapping("/findiddirector/{id}")
    public ResponseEntity<Director> getDirectorByIddirector(@PathVariable("id") Long iddirector) {
        Director director = directorService.findDirectorByIddirector(iddirector);
        return new ResponseEntity<>(director, HttpStatus.OK);
    }
}
