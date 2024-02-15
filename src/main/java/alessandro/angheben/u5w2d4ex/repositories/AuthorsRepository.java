package alessandro.angheben.u5w2d4ex.repositories;


import alessandro.angheben.u5w2d4ex.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByEmail(String email);
}
