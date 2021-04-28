package cacib.interview.demo.infrastructure.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import cacib.interview.demo.domain.Counter;

/**
 * SpringDataCrudCounterRepository
 */
public class SpringDataCrudCounterRepository extends CrudRepository<Counter, String> {
}