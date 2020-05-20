package lito.demo.repository;


import lito.demo.models.Author;
import org.springframework.data.repository.CrudRepository;

/**
 * @author oktay
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Integer>{

    Author findOne(Integer authorId);

    void delete(Integer authorId);
}
