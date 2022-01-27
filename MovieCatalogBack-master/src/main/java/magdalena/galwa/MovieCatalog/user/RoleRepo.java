package magdalena.galwa.MovieCatalog.user;

/**
 * @author MagdaB
 * @version 1
 * @since 26.01.2022
 */
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import magdalena.galwa.MovieCatalog.user.ERole;
import magdalena.galwa.MovieCatalog.user.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}