package cacib.interview.demo.domain.repository;

import cacib.interview.demo.domain.Counter;
import java.util.Optional;
/**
 * CounterRepository
 */
public interface CounterRepository {
    Optional<Counter> findByKey(final String key); 
    void save(final Counter counter);
}