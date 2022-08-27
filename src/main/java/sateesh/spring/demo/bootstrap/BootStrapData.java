package sateesh.spring.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sateesh.spring.demo.model.Author;
import sateesh.spring.demo.model.Book;
import sateesh.spring.demo.model.Publisher;
import sateesh.spring.demo.repositories.AuthorRepository;
import sateesh.spring.demo.repositories.BookRepository;
import sateesh.spring.demo.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository  authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author sateesh = new Author("Sateesh", "Desam");
        Publisher booksPublisher = new Publisher("Oreilly", "Beeramguda", "Hyderabad", "Telangana");
        Book springWithJpa  = new Book("Spring With JPA");
        sateesh.getBooks().add(springWithJpa);
        springWithJpa.getAuthor().add(sateesh);
        authorRepository.save(sateesh);
        bookRepository.save(springWithJpa);
        publisherRepository.save(booksPublisher);
        System.out.print("Number of Books Wrote" + authorRepository.count());
        System.out.print("Number of Books Published" + publisherRepository.count());

    }
}
