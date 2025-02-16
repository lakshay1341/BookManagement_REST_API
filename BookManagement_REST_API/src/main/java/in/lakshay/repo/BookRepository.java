package in.lakshay.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.lakshay.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
