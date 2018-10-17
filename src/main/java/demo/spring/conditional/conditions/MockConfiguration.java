package demo.spring.conditional.conditions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class MockConfiguration {

    @Autowired
    private MockRepository repository;

    @Bean
    @Primary
    @ConditionalOnProperty(value = "mock.service")
    IService mockServis() {
        return new MockIService(repository);
    }
}
