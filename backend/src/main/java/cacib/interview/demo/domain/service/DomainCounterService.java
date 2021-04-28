package cacib.interview.demo.domain.service;
import cacib.interview.demo.domain.Counter;
import cacib.interview.demo.domain.repository.CounterRepository;
import cacib.interview.demo.domain.exception.CounterNotFoundException;
/**
 * DomainCounterService
 */
public class DomainCounterService implements CounterService{
    private final CounterRepository counterRepository;
    public DomainCounterService(final CounterRepository counterRepository) {
        this.counterRepository = counterRepository;
    }

    @Override
    public Integer createCounter(String key) {
        final Counter counter = this.counterRepository.findByKey(key).orElseGet(() -> new Counter(key));
        this.counterRepository.save(counter);
        return counter.getCount();
    }

    @Override
    public Interger incrementCounter(String key) {
        final Counter counter = this.counterRepository.findByKey(key).orElseThrow(() -> new CounterNotFoundException("Counter with given key doesn't exist"));
        counter.incrementCount();
        this.counterRepository.save(counter);
        return counter.getCount();
    }
}