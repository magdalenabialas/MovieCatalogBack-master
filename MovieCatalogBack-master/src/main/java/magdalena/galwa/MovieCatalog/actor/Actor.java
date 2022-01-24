package magdalena.galwa.MovieCatalog.actor;

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
 * @since 15.01.2022
 */

@Entity
public class Actor implements Serializable {

    @Id
    @Column(nullable = false, updatable = false)
    private Long idactor;
    private String name;

    public Actor(){}

    public Actor(Long idactor, String name){
        this.idactor = idactor;
        this.name=name;
    }

    public Long getIdActor(){
        return this.idactor;
    }

    public void setIdActor(Long idactor){
        this.idactor = idactor;
    }

    public String getNameActor(){
        return this.name;
    }

    public void setNameActor( String name){
        this.name=name;
    }

}
