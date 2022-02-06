package magdalena.galwa.MovieCatalog.movie;

import magdalena.galwa.MovieCatalog.director.Director;
import magdalena.galwa.MovieCatalog.genre.Genre;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * @author MagdalenaGalwa
 * @version 1
 * @since 18.12.2021
 */

@Entity
public class Movie implements Serializable {
    @Id
    @Column(nullable = false, updatable = false)
    private Long idmovie;
    private String title;
    private String original_lang;
    private String release_date;
    @Column(length = 700)
    private String description;
    private Double average_rate;
    private Integer vote_count;
    @Column(length = 500)
    private String poster_path;

    @ManyToMany
    @JoinTable(
            name="MoviesGenres",
            joinColumns = @JoinColumn(name = "idmovie"),
            inverseJoinColumns = @JoinColumn(name = "idgenre")
    )

    private Set<Genre> movies_genres = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name="MoviesDirectors",
            joinColumns = @JoinColumn(name = "idmovie"),
            inverseJoinColumns = @JoinColumn(name = "iddirector")
    )

    private Set<Director> movies_directors = new HashSet<>();

    public Movie(){}

    public Movie(Long id_movie, String title, String original_lang, String release_date, String description, Double average_rate, Integer vote_count, String poster_path) {
        this.idmovie = id_movie;
        this.title = title;
        this.original_lang = original_lang;
        this.release_date = release_date;
        this.description = description;
        this.average_rate = average_rate;
        this.vote_count = vote_count;
        this.poster_path = poster_path;
    }

    public Long getIdmovie(){

        return idmovie;
    }

    public void setIdmovie(Long idmovie) {

        this.idmovie = idmovie;
    }

    public String getTitle(){

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getOriginal_lang() {

        return original_lang;
    }

    public void setOriginal_lang(String original_lang) {

        this.original_lang = original_lang;
    }

    public String getRelease_date(){

        return release_date;
    }

    public void setRelease_date(String release_date) {

        this.release_date = release_date;
    }

    public String getDescription(){

        return description;
    }

    public void setDescription(String title) {

        this.description = description;
    }

    public Double getAverage_rate(){

        return average_rate;
    }

    public void setAverage_rate(Double average_rate) {

        this.average_rate = average_rate;
    }

    public Integer getVote_count(){

        return vote_count;
    }

    public void setVote_count(Integer vote_count) {

        this.vote_count = vote_count;
    }

    public String getPoster_path(){

        return poster_path;
    }

    public void setPoster_path(String poster_path) {

        this.poster_path = poster_path;
    }

    public Set<Genre> getMovies_genres(){
        return movies_genres;
    }

    public Set<Director> getMovies_directors(){
        return movies_directors;
    }

}


