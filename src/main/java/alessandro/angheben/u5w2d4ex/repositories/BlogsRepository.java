package alessandro.angheben.u5w2d4ex.repositories;

import alessandro.angheben.u5w2d4ex.entities.Author;
import alessandro.angheben.u5w2d4ex.entities.Blogpost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface BlogsRepository extends JpaRepository<Blogpost, Integer> {
    List<Blogpost> findByAuthor(Author author);
}
