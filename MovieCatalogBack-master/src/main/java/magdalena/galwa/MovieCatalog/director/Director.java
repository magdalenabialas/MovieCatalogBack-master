package magdalena.galwa.MovieCatalog.director;

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
 * @author MagdaGalwa
 * @version 1
 * @since 13.01.2022
 */

@Entity
public class Director implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    private Long iddirector;
    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "movies_directors")
    private Set<Movie> movies = new HashSet<>();

    public Director(){}

    public Director(Long iddirector, String name){
        this.iddirector = iddirector;
        this.name=name;
    }

    public Long getIdDirector(){
        return this.iddirector;
    }

    public void setIdDirector(Long iddirector){
        this.iddirector = iddirector;
    }

    public String getNameDirector(){
        return this.name;
    }

    public void setNameDirector( String name){
        this.name=name;
    }

    public Set<Movie> getMovies(){
        return movies;
    }
}


