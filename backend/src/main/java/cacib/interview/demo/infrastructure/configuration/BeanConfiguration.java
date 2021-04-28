package cacib.interview.demo.infrastructure.configuration;

import cacib.interview.demo.DemoApplication;

import cacib.interview.demo.domain.repository.CounterRepository;
import cacib.interview.demo.domain.service.CounterService;
import cacib.interview.demo.domain.service.DomainCounterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * BeanConfiguration
 */
@Configuration
@ComponentScan(basePackageClasses = DemoApplication.class)
public class BeanConfiguration {
    @Bean
    CounterService counterService(final CounterRepository counterRepository) {
        return new DomainCounterService(counterRepository);
    }
}