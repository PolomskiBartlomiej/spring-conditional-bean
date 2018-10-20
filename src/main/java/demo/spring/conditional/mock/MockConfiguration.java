package demo.spring.conditional.mock;

import demo.spring.conditional.user.UserService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
class MockConfiguration {

    @Bean
    @Primary
    @ConditionalOnProperty(value = "mock.service")
    UserService mockUserService() {
        return new MockUserService();
    }
}
