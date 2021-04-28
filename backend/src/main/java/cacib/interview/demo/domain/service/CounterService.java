package cacib.interview.demo.domain.service;

/**
 * CounterService
 */
public interface CounterService {
    Integer createCounter(String key);
    Integer incrementCounter(String key);
}