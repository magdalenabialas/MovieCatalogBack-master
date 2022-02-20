package magdalena.galwa.MovieCatalog.actor;

import magdalena.galwa.MovieCatalog.exception.ActorNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 15.01.2022
 */

@Service
public class ActorService {

    private final ActorRepo actorRepo;

    @Autowired
    public ActorService(ActorRepo actorRepo){this.actorRepo = actorRepo; }

    public List<Actor> findAllActors(){return actorRepo.findAll(); }

    public Actor findActorByIdactor(Long idactor){
        return actorRepo.findActorByIdactor(idactor).
                orElseThrow(() -> new ActorNotFoundException("Actor by id" + idactor + "was nto found"));
    }
}
