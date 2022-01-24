package magdalena.galwa.MovieCatalog.moviesactors;

import magdalena.galwa.MovieCatalog.actor.Actor;
import magdalena.galwa.MovieCatalog.movie.Movie;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 15.01.2022
 */

@Entity
public class MoviesActors implements Serializable{

    @Id
    @Column(nullable = false, updatable = false)
    private Long idrole;
    private String charactername;
    @ManyToOne
    @JoinColumn(name ="idactor")
    private Actor actor;
    @ManyToOne
    @JoinColumn(name ="idmovie")
    private Movie movie;

    public MoviesActors(){}

    public MoviesActors(Long idrole, String charactername, Actor actor, Movie movie){
        super();
        this.idrole = idrole;
        this.charactername=charactername;
        this.actor = actor;
        this.movie = movie;
    }

    public Long getIdrole(){
        return this.idrole;
    }

    public void setIdrole(Long idrole){
        this.idrole = idrole;
    }

    public String getCharactername(){
        return this.charactername;
    }

    public void setCharactername(String charactername){
        this.charactername = charactername;
    }

    public Actor getActor(){
        return this.actor;
    }

    public void setActor(Actor actor){
        this.actor = actor;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }
}
