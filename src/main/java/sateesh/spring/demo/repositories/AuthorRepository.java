package sateesh.spring.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import sateesh.spring.demo.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
