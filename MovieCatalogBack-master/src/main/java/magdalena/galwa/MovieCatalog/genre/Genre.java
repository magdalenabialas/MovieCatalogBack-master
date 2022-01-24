package magdalena.galwa.MovieCatalog.genre;

import com.fasterxml.jackson.annotation.JsonIgnore;
import magdalena.galwa.MovieCatalog.movie.Movie;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MagdalenaGalwa
 * @version 1
 * @since 18.12.2021
 */

@Entity
public class Genre implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    private Long idgenre;
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "movies_genres")
    private Set<Movie> movies = new HashSet<>();

    public Genre() { }

    public Genre(Long idgenre, String name) {
        this.idgenre = idgenre;
        this.name = name;
    }

    public Long getIdGenre(){
        return idgenre;
    }

    public void setIdGenre(Long idgenre) {
        this.idgenre = idgenre;
    }

    public String getNameGenre(){
        return name;
    }

    public void setNameGenre(String name) {
        this.name = name;
    }

    public Set<Movie> getMovies(){
        return movies;
    }
}