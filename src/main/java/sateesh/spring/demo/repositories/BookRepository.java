package sateesh.spring.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import sateesh.spring.demo.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
