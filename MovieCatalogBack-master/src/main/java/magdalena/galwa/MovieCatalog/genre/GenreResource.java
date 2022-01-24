package magdalena.galwa.MovieCatalog.genre;

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
 * @since 11.01.2022
 */

@RestController
@RequestMapping("api/v1/genre")
public class GenreResource {
    private final GenreService genreService;

    public GenreResource(GenreService genreService) {
        this.genreService = genreService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Genre>> getAllGenres() {
        List<Genre> genres = genreService.findAllGenres();
        return new ResponseEntity<>(genres, HttpStatus.OK);
    }

    @GetMapping("/findidgenre/{id}")
    public ResponseEntity<Genre> getGenreByIdgenre(@PathVariable("id") Long idgenre) {
        Genre genre= genreService.findGenreByIdgenre(idgenre);
        return new ResponseEntity<>(genre, HttpStatus.OK);
    }
}