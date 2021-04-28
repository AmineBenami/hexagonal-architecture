package cacib.interview.demo.infrastructure.configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import cacib.interview.demo.infrastructure.repository.SpringDataCrudCounterRepository;

/**
 * CrudConfiguration
 */
@EnableJpaRepositories(basePackageClasses = SpringDataCrudCounterRepository.class)
public class CrudConfiguration {
    
}