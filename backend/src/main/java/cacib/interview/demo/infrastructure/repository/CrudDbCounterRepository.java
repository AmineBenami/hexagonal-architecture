package cacib.interview.demo.infrastructure.repository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import cacib.interview.demo.domain.repository.CounterRepository;
import cacib.interview.demo.domain.Counter;

@Component
@Primary
public class CrudDbCounterRepository implements CounterRepository {

    private final SpringDataCrudCounterRepository counterRepository;

    @Autowired
    public CrudDbCounterRepository(final SpringDataCrudCounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @Override
    public Optional<Counter> findByKey(final String key) {
        return counterRepository.findById(key);
    }

    @Override
    public void save(final Counter counter) {
        counterRepository.save(counter);
    }
}