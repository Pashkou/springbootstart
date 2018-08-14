package siarhei.pashkou.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import siarhei.pashkou.persistence.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
