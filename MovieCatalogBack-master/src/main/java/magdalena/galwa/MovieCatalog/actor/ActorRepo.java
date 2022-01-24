package magdalena.galwa.MovieCatalog.actor;

import magdalena.galwa.MovieCatalog.actor.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author MagdaGalwa
 * @version 1
 * @since 15.01.2022
 */
public interface ActorRepo extends JpaRepository<Actor, Long> {
    Optional<Actor> findActorByIdactor(Long idactor);
}
