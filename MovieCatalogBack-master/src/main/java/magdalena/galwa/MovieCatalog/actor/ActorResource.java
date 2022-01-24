package magdalena.galwa.MovieCatalog.actor;

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
 * @since 15.01.2022
 */

@RestController
@RequestMapping("api/v1/actor")
public class ActorResource {

    private final ActorService actorService;

    public ActorResource(ActorService actorService) {this.actorService = actorService;}

    @GetMapping("/all")
    public ResponseEntity<List<Actor>> getAllActors(){
        List<Actor> actors = actorService.findAllActors();
        return new ResponseEntity<>(actors, HttpStatus.OK);
    }

    @GetMapping("/findidactor/{id}")
    public ResponseEntity<Actor> getActorByIdactor(@PathVariable("id") Long idactor){
        Actor actor = actorService.findActorByIdactor(idactor);
        return new ResponseEntity<>(actor, HttpStatus.OK);
    }
}
