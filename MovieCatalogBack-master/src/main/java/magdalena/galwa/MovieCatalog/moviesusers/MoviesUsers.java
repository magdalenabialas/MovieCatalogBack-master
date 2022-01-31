package magdalena.galwa.MovieCatalog.moviesusers;

import magdalena.galwa.MovieCatalog.user.User;
import magdalena.galwa.MovieCatalog.movie.Movie;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 31.01.2022
 */

@Entity
public class MoviesUsers implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    private Long idrate;
    private Double rate;
    @ManyToOne
    @JoinColumn(name ="iduser")
    private User user;
    @ManyToOne
    @JoinColumn(name ="idmovie")
    private Movie movie;

    public MoviesUsers(){}

    public MoviesUsers(Long idrate, Double rate, User user, Movie movie){
        super();
        this.idrate = idrate;
        this.rate=rate;
        this.user = user;
        this.movie = movie;
    }

    public Long getIdrate(){
        return this.idrate;
    }

    public void setIdrate(Long idrate){
        this.idrate = idrate;
    }

    public Double getRate(){ return this.rate; }

    public void setRate(Double rate){
        this.rate = rate;
    }

    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

}
