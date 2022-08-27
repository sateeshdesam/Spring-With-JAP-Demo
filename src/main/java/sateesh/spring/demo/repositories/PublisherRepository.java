package sateesh.spring.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import sateesh.spring.demo.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
